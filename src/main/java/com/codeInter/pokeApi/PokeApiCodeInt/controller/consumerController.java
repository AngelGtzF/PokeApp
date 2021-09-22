package com.codeInter.pokeApi.PokeApiCodeInt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class consumerController {

    @Autowired
    private RestTemplate restTemplate;
    //private String pkmnTypeId="1";//del 1 al 18
    private  String url = "https://pokeapi.co/api/v2/type/";


    @RequestMapping ("/pkmnGeneration")
    public Object getPkmnGenerations(){
        Object response = null;
       // for (int i = 1; i < 3; i++) {
            try {
                int i=1;
                String tempUrl = url + i;
                HttpHeaders headers = new HttpHeaders();
                headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
                headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
                HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

                 response = restTemplate.exchange(tempUrl, HttpMethod.GET,entity,Object.class);

                System.out.println(response);
                // return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
                return response;
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        //}


        return response;
    }


       // Object[] generations = restTemplate.getForObject(url,Object[].class);
        //System.out.println(generations);
       // return Arrays.asList(generations);


    /*

    public Object getPkmnGenerations(){
            Object generations = restTemplate.getForObject(url, Object.class);
            return generations;
    }
*/
}

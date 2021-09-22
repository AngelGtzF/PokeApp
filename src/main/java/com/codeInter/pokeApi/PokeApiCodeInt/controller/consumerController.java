package com.codeInter.pokeApi.PokeApiCodeInt.controller;

import com.codeInter.pokeApi.PokeApiCodeInt.model.Generacion;
import com.codeInter.pokeApi.PokeApiCodeInt.model.PkmnTypes;
import com.codeInter.pokeApi.PokeApiCodeInt.model.PkmnV;
import com.codeInter.pokeApi.PokeApiCodeInt.model.PkmnVista;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.DataInput;
import java.util.*;

@RestController
public class consumerController {

    @Autowired
    private RestTemplate restTemplate;
    //private String pkmnTypeId="1";//del 1 al 18
    private  String url = "https://pokeapi.co/api/v2/type/";
    public int n=1;


    //Aqui va el jackson que toma el tipo PkmnTypes y luego lo debe meter en una lista y asi iterar cada tipo
    @RequestMapping(value = "/prueba1", method = RequestMethod.GET)
    public List<PkmnTypes> getPkmnTypes(){
        List<PkmnTypes> listaTipos = null;
        for(int i=1;i<19;i++){
            //peticion que se ciclara para meter las cosas, primero probar la serialicacion
        }
        //se puede llamar cuando se va a inicio para tener listo todo, agregar bandera para no repetir operacion
        return listaTipos;
    }

    @RequestMapping("/generaciones")
    public String vistaGeneraciones(){
        //llamar desde aqui al de prueba1 una vez funcione

        return"mostrarGeneraciones";
    }

    @RequestMapping ("/pkmnGeneration")
    public HashMap<String, ArrayList<PkmnVista>> getPkmnGenerations(){
        ResponseEntity<PkmnV> response = null;
        ArrayList<PkmnVista> lista1gen = new ArrayList<>();
        ArrayList<PkmnVista> lista2gen = new ArrayList<>();
        ArrayList<PkmnVista> lista3gen = new ArrayList<>();
        ArrayList<PkmnVista> lista4gen = new ArrayList<>();
        ArrayList<PkmnVista> lista5gen = new ArrayList<>();
        ArrayList<PkmnVista> lista6gen = new ArrayList<>();
        HashMap<String, ArrayList<PkmnVista>> generaciones = new HashMap<String, ArrayList<PkmnVista>>();


        try {
           // for (int i = 1; i < 4; i++) {
                // int i=1;
                String tempUrl = url + n;
                HttpHeaders headers = new HttpHeaders();
                headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
                headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
                HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
                //Obtenemos el objeto con la informacion de los pokemones de cierto tipo
                response = restTemplate.exchange(tempUrl, HttpMethod.GET, entity, PkmnV.class);
                /**
                 * @param response Este parametro se descompone para obtener cada pokemon con su informacion pertinente
                 */
                //Se genera el pokemon para agregarlo a la lista de su generacion correspondiente
                int cantidadPkmn = response.getBody().getPokemon().size();
                for (int j = 0; j < cantidadPkmn; j++) {
                    PkmnVista pkmnVista = new PkmnVista(response.getBody().getPokemon().get(j).getPokemon().getName(), response.getBody().getName(),
                            Integer.parseInt(response.getBody().getPokemon().get(j).getPokemon().getUrl().substring(34, response.getBody().getPokemon().get(j).getPokemon().getUrl().length() - 1)));
                    //para que no guardemos pokemons pasada la sexta generacion
                    if (pkmnVista.getNumero() < 722) {
                        //Primera generacion
                        if (pkmnVista.getNumero() > 0 && pkmnVista.getNumero() < 152) {
                            lista1gen.add(new PkmnVista(pkmnVista.getName(), pkmnVista.getTipo(), pkmnVista.getNumero()));

                        }//Segunda generacion
                        else if (pkmnVista.getNumero() > 151 && pkmnVista.getNumero() < 252) {
                            lista2gen.add(new PkmnVista(pkmnVista.getName(), pkmnVista.getTipo(), pkmnVista.getNumero()));
                        }//Tercera generacion
                        else if (pkmnVista.getNumero() > 251 && pkmnVista.getNumero() < 387) {
                            lista3gen.add(new PkmnVista(pkmnVista.getName(), pkmnVista.getTipo(), pkmnVista.getNumero()));
                        }
                        //Cuarta generacion
                        else if (pkmnVista.getNumero() > 386 && pkmnVista.getNumero() < 494) {
                            lista4gen.add(new PkmnVista(pkmnVista.getName(), pkmnVista.getTipo(), pkmnVista.getNumero()));
                        }
                        //Quinta generacion
                        else if (pkmnVista.getNumero() > 493 && pkmnVista.getNumero() < 650) {
                            lista5gen.add(new PkmnVista(pkmnVista.getName(), pkmnVista.getTipo(), pkmnVista.getNumero()));
                        }
                        //Sexta generacion
                        else if (pkmnVista.getNumero() > 649 && pkmnVista.getNumero() < 722) {
                            lista6gen.add(new PkmnVista(pkmnVista.getName(), pkmnVista.getTipo(), pkmnVista.getNumero()));
                        }

                    }

                }
           // }

        generaciones.put("1era Generacion", lista1gen);
        generaciones.put("2da Generacion", lista2gen);
        generaciones.put("3ra Generacion", lista3gen);
        generaciones.put("4ta Generacion", lista4gen);
        generaciones.put("5ta Generacion", lista5gen);
        generaciones.put("6ta Generacion", lista6gen);

        n++;
        return  generaciones;

        }
        catch (Exception ex) {
                ex.printStackTrace();
            }



        return generaciones;
    }

}

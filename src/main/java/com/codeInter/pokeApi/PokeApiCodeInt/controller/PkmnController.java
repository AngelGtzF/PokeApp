package com.codeInter.pokeApi.PokeApiCodeInt.controller;

import com.codeInter.pokeApi.PokeApiCodeInt.model.Pokemon;
import com.codeInter.pokeApi.PokeApiCodeInt.service.PkmnService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Controlador encargado de pasar a las vistas de html y hacer los movimientos en la base de datos
@Controller
public class PkmnController {
    private PkmnService pkmnService;

    public PkmnController(PkmnService pkmnService){
        this.pkmnService = pkmnService;
    }
    @GetMapping("/capturar")
    public String pkmnCapture(Model model, Pokemon pokemon){
        return "formPokemon";
    }
    @GetMapping("/inicio")
    public String index(){
        return "index";
    }
    @GetMapping("/formCaptura")
    public String formCaptura(){
        return "capturarPkmn";
    }

}

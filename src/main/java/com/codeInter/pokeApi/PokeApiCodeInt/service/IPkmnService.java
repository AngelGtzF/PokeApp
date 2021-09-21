package com.codeInter.pokeApi.PokeApiCodeInt.service;

import com.codeInter.pokeApi.PokeApiCodeInt.model.Pokemon;

import java.util.List;
import java.util.Optional;

public interface IPkmnService {
    Pokemon capturarPokemon(Pokemon pokemon);

    Optional<Pokemon> regresarApodo(String apodo);

    Optional<List<Pokemon>> listaEspecies(String especie);


}

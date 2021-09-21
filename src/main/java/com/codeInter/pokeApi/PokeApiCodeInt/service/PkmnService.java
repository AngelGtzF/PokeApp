package com.codeInter.pokeApi.PokeApiCodeInt.service;

import com.codeInter.pokeApi.PokeApiCodeInt.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PkmnService implements IPkmnService {
    @Override
    public Pokemon capturarPokemon(Pokemon pokemon) {
        return null;
    }

    @Override
    public Optional<Pokemon> regresarApodo(String apodo) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Pokemon>> listaEspecies(String especie) {
        return Optional.empty();
    }


}

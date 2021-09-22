package com.codeInter.pokeApi.PokeApiCodeInt.service;

import com.codeInter.pokeApi.PokeApiCodeInt.model.Generacion;

import java.util.List;
import java.util.Optional;

public interface IGenerationService {
    Optional<List<Generacion>> listaGeneraciones();
}

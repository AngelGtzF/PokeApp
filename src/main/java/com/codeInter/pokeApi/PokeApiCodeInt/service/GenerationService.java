package com.codeInter.pokeApi.PokeApiCodeInt.service;

import com.codeInter.pokeApi.PokeApiCodeInt.model.Generacion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenerationService implements IGenerationService{
    @Override
    public Optional<List<Generacion>> listaGeneraciones() {
        return Optional.empty();
    }
}

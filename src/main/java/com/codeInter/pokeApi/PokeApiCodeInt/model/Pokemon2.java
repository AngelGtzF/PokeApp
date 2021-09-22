package com.codeInter.pokeApi.PokeApiCodeInt.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pokemon",
        "slot"
})
@Generated("jsonschema2pojo")
public class Pokemon2 {

    @JsonProperty("pokemon")
    private SubPokemon pokemon;
    @JsonProperty("slot")
    private String slot;

    @JsonProperty("pokemon")
    public SubPokemon getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(SubPokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon2 withPokemon(SubPokemon pokemon) {
        this.pokemon = pokemon;
        return this;
    }

    @JsonProperty("slot")
    public String getSlot() {
        return slot;
    }

    @JsonProperty("slot")
    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Pokemon2 withSlot(String slot) {
        this.slot = slot;
        return this;
    }



}

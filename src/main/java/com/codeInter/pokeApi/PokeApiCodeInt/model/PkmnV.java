package com.codeInter.pokeApi.PokeApiCodeInt.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "pokemon"
})
@Generated("jsonschema2pojo")
public class PkmnV {

    @JsonProperty("name")
    private String name;
    @JsonProperty("pokemon")
    private List<Pokemon2> pokemon = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PkmnV withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("pokemon")
    public List<Pokemon2> getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(List<Pokemon2> pokemon) {
        this.pokemon = pokemon;
    }

    public PkmnV withPokemon(List<Pokemon2> pokemon) {
        this.pokemon = pokemon;
        return this;
    }


}




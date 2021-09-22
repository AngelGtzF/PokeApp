package com.codeInter.pokeApi.PokeApiCodeInt.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PkmnTypes {

    private String name;
    private List<PkmnV> pokemon;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PkmnV> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<PkmnV> pokemon) {
        this.pokemon = pokemon;
    }

    private class PkmnV {
        private String name;
        private String url;
        private int slot;

        public PkmnV(String name, String url, int slot) {
            this.name = name;
            this.url = url;
            this.slot = slot;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getSlot() {
            return slot;
        }

        public void setSlot(int slot) {
            this.slot = slot;
        }
    }
}

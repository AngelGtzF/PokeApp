package com.codeInter.pokeApi.PokeApiCodeInt.model;


import lombok.Data;

@Data
public class PkmnVista {
    private String name;
    private String tipo;
    private int numero;

    public void setSegundoTipo(String tipo, String segundoTipo){
        this.tipo= tipo+"/"+segundoTipo;
    }

    public PkmnVista(String name, String tipo, int numero) {
        this.name = name;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

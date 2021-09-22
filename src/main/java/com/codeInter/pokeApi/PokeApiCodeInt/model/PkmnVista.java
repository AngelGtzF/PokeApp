package com.codeInter.pokeApi.PokeApiCodeInt.model;

public class PkmnVista {
    private String nombre;
    private String tipo;
    private int numero;

    public void setSegundoTipo(String tipo, String segundoTipo){
        this.tipo= tipo+"/"+segundoTipo;
    }
    public PkmnVista(String nombre, String tipo, int numero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = numero;
    }

    public PkmnVista() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }
}

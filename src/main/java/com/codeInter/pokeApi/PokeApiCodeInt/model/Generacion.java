package com.codeInter.pokeApi.PokeApiCodeInt.model;

import lombok.Data;

//import java.util.ArrayList;
import java.util.List;


@Data
public class Generacion {
    private String nombre;
    private List<PkmnVista> pkmnVistas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PkmnVista> getPkmnVistas() {
        return pkmnVistas;
    }

    public void setPkmnVistas(List<PkmnVista> pkmnVistas) {
        this.pkmnVistas = pkmnVistas;
    }

    public Generacion(String nombre, List<PkmnVista> pkmnVistas) {
        this.nombre = nombre;
        this.pkmnVistas = pkmnVistas;

    }

    public Generacion(String nombre) {
        this.nombre = nombre;
    }
}

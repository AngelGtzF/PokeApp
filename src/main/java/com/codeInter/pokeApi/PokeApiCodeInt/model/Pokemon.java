package com.codeInter.pokeApi.PokeApiCodeInt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String apodo;
    @Column(nullable = false)
    private String tipos;
    @Column(nullable = false)
    private String especie;
    @Column(nullable = false)
    private int ataque;
    @Column(nullable = false)
    private int defensa;
    @Column(nullable = false)
    private int salud;
    @Column(nullable = false)
    private int numero;

}

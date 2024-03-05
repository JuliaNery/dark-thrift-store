package br.com.darkthriftstore.model;

import java.util.Random;

public record CategoriaModel(Long id, String nome) {
    public CategoriaModel(Long id, String nome){
        this.id = Math.abs(new Random().nextLong());
        this.nome = nome;
    }
}

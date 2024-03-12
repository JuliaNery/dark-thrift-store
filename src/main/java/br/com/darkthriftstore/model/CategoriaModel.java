package br.com.darkthriftstore.model;

import java.util.Random;

<<<<<<< HEAD
public record CategoriaModel(Long id, String nome) {
    public CategoriaModel(Long id, String nome){
        this.id = Math.abs(new Random().nextLong());
        this.nome = nome;
    }
}

=======
public record CategoriaModel (Long id, String nome)  {

    public CategoriaModel(Long id, String nome){
        this.id = Math.abs( new Random().nextLong() );
        this.nome = nome;

    }

}
>>>>>>> 0316accfe1b4439465f3d6f8b9b62485d709cf3d

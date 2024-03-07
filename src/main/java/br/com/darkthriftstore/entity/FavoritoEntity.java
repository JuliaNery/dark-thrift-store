package br.com.darkthriftstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class FavoritoEntity {
    @Id
    private Long id;
    private UsuarioEntity usuario;
    private ProdutoEntity produto;
}

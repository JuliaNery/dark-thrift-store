package br.com.darkthriftstore.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@Data
@Builder
public class FavoritoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private UsuarioEntity usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProdutoEntity produto;
}

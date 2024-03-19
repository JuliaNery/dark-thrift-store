package br.com.darkthriftstore.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Positive(message = "o valor deve ser positivo")
    private BigDecimal valor;
    private String nome;
    private String descricao;
    private String tamanho;
    private String foto;
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaEntity categoria;
}

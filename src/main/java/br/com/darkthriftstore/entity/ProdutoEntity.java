package br.com.darkthriftstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class ProdutoEntity {
    @Id
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String descricao;
    private String tamanho;
    private String foto;
}

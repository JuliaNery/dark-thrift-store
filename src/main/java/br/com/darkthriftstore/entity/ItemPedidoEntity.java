package br.com.darkthriftstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@Data
@Builder
public class ItemPedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProdutoEntity produto;
    private Integer qtd_produto;
    private BigDecimal subtotal_item;
    @ManyToOne(fetch = FetchType.LAZY)
    private PedidoEntity pedido;

}

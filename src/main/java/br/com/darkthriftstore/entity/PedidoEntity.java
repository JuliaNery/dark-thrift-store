package br.com.darkthriftstore.entity;

import br.com.darkthriftstore.validation.Present;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private UsuarioEntity usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    private PagamentoEntity pagamento;
    @Present
    private LocalDate data;
    private BigDecimal valorTotal;
    private String codigoRastreio;
    private String transportadora;
    private BigDecimal subTotal;
}

package br.com.darkthriftstore.entity;

import br.com.darkthriftstore.validation.Present;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UsuarioEntity usuario;
    @Present
    private PagamentoEntity pagamento;
    private LocalDate data;
    private BigDecimal valorTotal;
    private String codigoRastreio;
    private String transportadora;
    private BigDecimal subTotal;
}

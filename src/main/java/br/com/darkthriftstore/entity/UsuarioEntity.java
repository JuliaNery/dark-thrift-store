package br.com.darkthriftstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 11, max = 11,message = " o campo cpf deve ter 11 caracteres validos")
    private String cpf;
    private String nome;
    @NotBlank(message = "email é obrigatorio")
    private String email;
    private String tipo;
    private String senha;
}

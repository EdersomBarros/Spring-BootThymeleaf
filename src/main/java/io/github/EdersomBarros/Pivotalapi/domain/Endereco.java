package io.github.EdersomBarros.Pivotalapi.domain;


import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;


@Entity
@Getter@Setter
@NoArgsConstructor
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {

    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String logradouro;

    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String bairro;

    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String cidade;

    @NotNull(message = "{NotNull.endereco.uf}")
    @Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    private UF uf;

    @NotBlank
    @Size(min = 9, max = 9, message = "{Size.endereco.cep}")
    @Column(nullable = false, length = 9)
    private String cep;

    @NotNull(message = "{NotNull.endereco.numero}")
    @Digits(integer = 5, fraction = 0)
    @Column(nullable = false, length = 5)
    private Integer numero;

    @Size(max = 255)
    private String complemento;



}

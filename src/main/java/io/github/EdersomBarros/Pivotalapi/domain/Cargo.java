package io.github.EdersomBarros.Pivotalapi.domain;

import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Getter@Setter
@NoArgsConstructor
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}

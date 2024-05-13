package io.github.EdersomBarros.Pivotalapi.domain;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter@Setter
@NoArgsConstructor
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;


}

package io.github.EdersomBarros.Pivotalapi.dao;

import io.github.EdersomBarros.Pivotalapi.domain.Cargo;
import io.github.EdersomBarros.Pivotalapi.domain.Departamento;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}

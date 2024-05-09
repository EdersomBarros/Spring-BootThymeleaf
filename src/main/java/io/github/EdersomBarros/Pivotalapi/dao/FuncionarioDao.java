package io.github.EdersomBarros.Pivotalapi.dao;



import io.github.EdersomBarros.Pivotalapi.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}

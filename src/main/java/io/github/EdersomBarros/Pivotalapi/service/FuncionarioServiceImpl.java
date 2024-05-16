package io.github.EdersomBarros.Pivotalapi.service;

import io.github.EdersomBarros.Pivotalapi.dao.FuncionarioDao;
import io.github.EdersomBarros.Pivotalapi.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao dao;

    @Override
    @Transactional(readOnly = false)
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);

    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {

        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodos() {

        return dao.findAll();
    }

    @Override
    public List<Funcionario> buscarPorNome(String nome) {
        return dao.findByNome(nome);
    }

    @Override
    public List<Funcionario> buscarPorCargo(Long id) {
        return dao.findByCargoId(id);

    }

    @Override
    public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
        if (entrada != null && saida != null) {
            return dao.findByDataEntradaDataSaida(entrada, saida);
        } else if (entrada != null) {
            return dao.findByDataEntrada(entrada);
        } else if (saida != null) {
            return dao.findByDataSaida(saida);
        } else {
            return new ArrayList<>();
        }

    }
}

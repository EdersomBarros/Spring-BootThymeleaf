package io.github.EdersomBarros.Pivotalapi.service;

import io.github.EdersomBarros.Pivotalapi.dao.DepartamentoDao;
import io.github.EdersomBarros.Pivotalapi.domain.Cargo;
import io.github.EdersomBarros.Pivotalapi.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class DepartamentoServiceImpl implements DepartamentoService{

    @Autowired
    private DepartamentoDao departamentoDao;

    @Override @Transactional(readOnly = false)
    public void salvar(Departamento departamento) {
        departamentoDao.save(departamento);
    }

    @Override @Transactional(readOnly = false)
    public void editar(Departamento departamento) {
        departamentoDao.update(departamento);
    }

    @Override @Transactional(readOnly = false)
    public void excluir(Long id) {
            departamentoDao.delete(id);
    }

    @Override  @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {

        return departamentoDao.findById(id);
    }

    @Override  @Transactional(readOnly = true)
    public List<Departamento> buscarTodos() {
        return departamentoDao.findAll();
    }

    @Override
    public boolean departamentoTemCargos(Long id) {
        if (buscarPorId(id).getCargos().isEmpty()){
            return false;
        }
        return true;
    }
}

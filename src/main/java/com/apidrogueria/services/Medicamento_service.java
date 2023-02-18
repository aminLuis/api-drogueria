package com.apidrogueria.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.apidrogueria.Models.Medicamento;
import com.apidrogueria.dao.Medicamento_repository_dao;
import com.apidrogueria.interfaces.IMedicamento;

public class Medicamento_service implements IMedicamento {

    @Autowired
    private Medicamento_repository_dao medicamento_dao;

    @Override
    public List<Medicamento> findAll() {
        return medicamento_dao.findAll();
    }

    @Override
    public Medicamento findById(UUID id) {
        return medicamento_dao.findById(id).orElseThrow(null);
    }

    @Override
    public Medicamento save(Medicamento medicamento) {
        return medicamento_dao.save(medicamento);
    }

    @Override
    public void deleteById(UUID id) {
        medicamento_dao.deleteById(id);
    }

}

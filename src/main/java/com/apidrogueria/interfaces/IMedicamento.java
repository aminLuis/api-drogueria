package com.apidrogueria.interfaces;

import java.util.List;
import java.util.UUID;

import com.apidrogueria.Models.Medicamento;

public interface IMedicamento {

    public List<Medicamento> findAll();

    public Medicamento findById(UUID id);

    public Medicamento save(Medicamento medicamento);

    public void deleteById(UUID id);

}

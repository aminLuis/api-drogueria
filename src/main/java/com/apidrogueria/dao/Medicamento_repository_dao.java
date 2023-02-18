package com.apidrogueria.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidrogueria.Models.Medicamento;

public interface Medicamento_repository_dao extends JpaRepository<Medicamento, UUID> {

}

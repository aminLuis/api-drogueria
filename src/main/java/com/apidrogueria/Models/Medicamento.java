package com.apidrogueria.Models;

import java.util.UUID;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamento")
@EntityListeners(AuditingEntityListener.class)
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nombre;

    private String laboratorio;

    private String fecha_fabricacion;

    private String fecha_vencimiento;

    private Long stock;

    private Double costo_unidad;

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setFechaFabricacion(String fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public String getFechaFabricacion() {
        return fecha_fabricacion;
    }

    public void setFechaVencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getFechaVencimiento() {
        return fecha_vencimiento;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getStock() {
        return stock;
    }

    public void setCostoUnidad(Double costo_unidad) {
        this.costo_unidad = costo_unidad;
    }

    public Double getCostoUnidad() {
        return costo_unidad;
    }

}

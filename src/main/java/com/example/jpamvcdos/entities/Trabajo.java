package com.example.jpamvcdos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="JOBS")
public class Trabajo {

    @Id
    @Column(name="JOB_ID")
    private String idJob;
    @Column(name="JOB_TITLE")
    private String nombre;
    @Column(name="MIN_SALARY")
    private Integer salarioMin;
    @Column(name="MAX_SALARY")
    private Integer salarioMax;

    public Trabajo() {
    }

    public String getIdJob() {
        return idJob;
    }

    public void setIdJob(String idJob) {
        this.idJob = idJob;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(Integer salarioMin) {
        this.salarioMin = salarioMin;
    }

    public Integer getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(Integer salarioMax) {
        this.salarioMax = salarioMax;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trabajo trabajo = (Trabajo) o;
        return Objects.equals(idJob, trabajo.idJob) && Objects.equals(nombre, trabajo.nombre) && Objects.equals(salarioMin, trabajo.salarioMin) && Objects.equals(salarioMax, trabajo.salarioMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJob, nombre, salarioMin, salarioMax);
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "idJob='" + idJob + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salarioMin=" + salarioMin +
                ", salarioMax=" + salarioMax +
                '}';
    }
}

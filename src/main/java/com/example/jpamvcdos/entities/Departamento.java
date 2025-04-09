package com.example.jpamvcdos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Departamento {

    @Id
    @Column(name="DEPARTMENT_ID")
    private Integer idDepartamento;
    @Column(name="DEPARTMENT_NAME")
    private String nombre;
    @Column(name="MANAGER_ID")
    private Empleado manager;
    @Column(name="LOCATION_ID")
    private Integer idLocation;

}

package com.example.jpamvcdos.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="EMPLOYEE")
public class Empleado {

    @Id
    @Column(name="EMPLOYEE_ID")
    private String id;
    @Column(name="FIRST_NAME")
    private String nombre;
    @Column(name="LAST_NAME")
    private String apellido;
    @Column(name="EMAIL")
    private String email;
    @Column(name="PHONE_NUMBER")
    private String numTelefono;
    @Column(name="HIRE_DATE")
    private LocalDate fechaContratacion;
    @Column(name="JOB_ID")
    private Trabajo trabajo;
    @Column(name="COMISSION_PCT")
    private Integer comision;
    @Column(name="MANAGER_ID")
    private Integer idManager;
    @Column(name="DEPARTMENT_ID")
    private Departamento departamento;



    public Empleado() {

    }

}

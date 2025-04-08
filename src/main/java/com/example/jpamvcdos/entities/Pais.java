package com.example.jpamvcdos.entities;

import jakarta.persistence.*;

@Entity
@Table(name="COUNTRIES")
public class Pais {

    @Id
    @Column(name="COUNTRY_ID")
    private String id;
    @Column(name="COUNTRY_NAME")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region region;

    public Pais() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                '}';
    }
}

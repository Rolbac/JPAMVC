package com.example.jpamvcdos.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="LOCATIONS")
public class Direccion {

    @Id
    @Column(name="LOCATION_ID")
    private Integer id;
    @Column(name="STREET_ADDRESS")
    private String direccionCalle;
    @Column(name="POSTAL_CODE")
    private String codigoPostal;
    @Column(name="CITY")
    private String ciudad;
    @Column(name="STATE_PROVINCE")
    private String provincia;
    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Pais pais;

    public Direccion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(id, direccion.id) && Objects.equals(direccionCalle, direccion.direccionCalle) && Objects.equals(codigoPostal, direccion.codigoPostal) && Objects.equals(ciudad, direccion.ciudad) && Objects.equals(provincia, direccion.provincia) && Objects.equals(pais, direccion.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, direccionCalle, codigoPostal, ciudad, provincia, pais);
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", direccionCalle='" + direccionCalle + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais=" + pais +
                '}';
    }
}

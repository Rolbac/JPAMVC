package com.example.jpamvcdos.admin;

import com.example.jpamvcdos.entities.Pais;

import java.util.List;

public interface AdminPais {
    List<Pais> listPaises();

    Pais conseguirPais(String id);

    Pais grabarPais(Pais pais);

    void eliminarPais(String id);

    Pais editarPais(Pais pais);
}

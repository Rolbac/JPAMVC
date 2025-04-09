package com.example.jpamvcdos.admin;

import com.example.jpamvcdos.entities.Direccion;

import java.util.List;

public interface AdminDireccion {

    List<Direccion> listDirecciones();
    Direccion conseguirDireccion(Integer id);

    Direccion grabarDireccion(Direccion direccion);

    void eliminarDireccion(Integer id);

    Direccion editarDireccion(Direccion direccion);
}

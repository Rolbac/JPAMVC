package com.example.jpamvcdos.admin;

import com.example.jpamvcdos.entities.Direccion;
import com.example.jpamvcdos.repositories.RepoDireccion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDireccionImpl implements AdminDireccion{

    private final RepoDireccion repoDireccion;

    public AdminDireccionImpl(RepoDireccion repoDireccion){
        this.repoDireccion=repoDireccion;
    }

    @Override
    public List<Direccion> listDirecciones() {
        return repoDireccion.findAll();
    }

    @Override
    public Direccion conseguirDireccion(Integer id) {
        return repoDireccion.findById(id).get();
    }

    @Override
    public Direccion grabarDireccion(Direccion direccion) {
        return repoDireccion.save(direccion);
    }

    @Override
    public void eliminarDireccion(Integer id) {
    repoDireccion.deleteById(id);
    }

    @Override
    public Direccion editarDireccion(Direccion direccion) {
        return repoDireccion.save(direccion);
    }
}

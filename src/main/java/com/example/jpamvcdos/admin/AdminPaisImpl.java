package com.example.jpamvcdos.admin;

import com.example.jpamvcdos.entities.Pais;
import com.example.jpamvcdos.repositories.RepoPais;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPaisImpl implements AdminPais{

    private final RepoPais repoPais;

    public AdminPaisImpl(RepoPais repoPais) {
        this.repoPais = repoPais;
    }

    @Override
    public List<Pais> listPaises() {
        return repoPais.findAll();
    }

    @Override
    public Pais conseguirPais(String id) {
        return repoPais.findById(id).get();
    }

    @Override
    public Pais grabarPais(Pais pais) {
        return repoPais.save(pais);
    }

    @Override
    public void eliminarPais(String id) {
        repoPais.deleteById(id);
    }
}

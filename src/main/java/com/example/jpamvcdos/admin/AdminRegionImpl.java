package com.example.jpamvcdos.admin;

import com.example.jpamvcdos.entities.Pais;
import com.example.jpamvcdos.entities.Region;
import com.example.jpamvcdos.repositories.RepoPais;
import com.example.jpamvcdos.repositories.RepoRegion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminRegionImpl implements AdminRegion{

    private final RepoRegion repoRegion;

    public AdminRegionImpl(RepoRegion repoRegion) {
        this.repoRegion = repoRegion;
    }

    @Override
    public List<Region> listRegion() {
        return repoRegion.findAll();
    }

    @Override
    public Region conseguirRegion(Integer id) {
        return repoRegion.findById(id).get();
    }

    @Override
    public Region grabarRegion(Region region) {
        return repoRegion.save(region);
    }

    @Override
    public void eliminarRegion(Integer id) {
        repoRegion.deleteById(id);
    }
}

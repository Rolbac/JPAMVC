package com.example.jpamvcdos.admin;

import com.example.jpamvcdos.entities.Pais;
import com.example.jpamvcdos.entities.Region;

import java.util.List;

public interface AdminRegion {
    List<Region> listRegion();

    Region conseguirRegion(Integer id);

    Region grabarRegion(Region region);

    void eliminarRegion(Integer id);
}

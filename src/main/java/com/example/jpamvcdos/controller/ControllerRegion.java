package com.example.jpamvcdos.controller;


import com.example.jpamvcdos.admin.AdminRegion;
import com.example.jpamvcdos.entities.Pais;
import com.example.jpamvcdos.entities.Region;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/regiones")
public class ControllerRegion {

    AdminRegion adminRegion;

    public ControllerRegion(AdminRegion adminRegion) {
        this.adminRegion = adminRegion;
    }

    @GetMapping
    public String paginaPaises(Model model){
        model.addAttribute("listado", adminRegion.listRegion());

        model.addAttribute("region", new Region());
        return "regiones/t_regiones";
    }

    @GetMapping("/{id}")
    public String irPais(@PathVariable Integer id, Model model){
        model.addAttribute("elemento", adminRegion.conseguirRegion(id));
        return "regiones/t_region";
    }
}

package com.example.jpamvcdos.controller;


import com.example.jpamvcdos.admin.AdminRegion;
import com.example.jpamvcdos.entities.Pais;
import com.example.jpamvcdos.entities.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/regiones")
public class ControllerRegion {

    public static Logger log = LoggerFactory.getLogger(ControllerDireccion.class);

    AdminRegion adminRegion;

    public ControllerRegion(AdminRegion adminRegion) {
        this.adminRegion = adminRegion;
    }

    @GetMapping
    public String paginaPaises(Model model){
        log.info("[paginaPaises]");

        model.addAttribute("listado", adminRegion.listRegion());
        model.addAttribute("region", new Region());

        return "regiones/t_regiones";
    }

    @GetMapping("/{id}")
    public String irPais(@PathVariable Integer id, Model model){
        log.info("[irPais]");

        model.addAttribute("elemento", adminRegion.conseguirRegion(id));

        return "regiones/t_region";
    }
}

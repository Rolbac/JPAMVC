package com.example.jpamvcdos.controller;

import com.example.jpamvcdos.admin.AdminPais;
import com.example.jpamvcdos.admin.AdminPaisImpl;
import com.example.jpamvcdos.admin.AdminRegion;
import com.example.jpamvcdos.entities.Pais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paises")
public class ControllerPais {

    AdminPais adminPais;
    AdminRegion adminRegion;

    public ControllerPais(AdminPais adminPais, AdminRegion adminRegion) {
        this.adminPais = adminPais;
        this.adminRegion = adminRegion;
    }

    @GetMapping
    public String paginaPaises(Model model){
        model.addAttribute("listado", adminPais.listPaises());
        model.addAttribute("regiones", adminRegion.listRegion());
        model.addAttribute("pais", new Pais());
        return "t_paises";
    }

    @GetMapping("/{id}")
    public String irPais(@PathVariable String id, Model model){
        model.addAttribute("elemento", adminPais.conseguirPais(id));
        return "t_pais";
    }

    @PostMapping
    public String insertarPais(@ModelAttribute Pais pais, Model model){
        pais=adminPais.grabarPais(pais);
        model.addAttribute("elemento", pais);

        return "redirect:/paises/"+ pais.getId();
    }

}

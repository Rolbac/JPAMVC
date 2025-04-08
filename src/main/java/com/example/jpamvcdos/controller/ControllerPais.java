package com.example.jpamvcdos.controller;

import com.example.jpamvcdos.admin.AdminPais;
import com.example.jpamvcdos.admin.AdminPaisImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paises")
public class ControllerPais {

    AdminPais admin;

    public ControllerPais(AdminPais admin) {
        this.admin = admin;
    }

    @GetMapping
    public String paginaPaises(Model model){
        model.addAttribute("listado", admin.listPaises());
        return "paises";
    }

}

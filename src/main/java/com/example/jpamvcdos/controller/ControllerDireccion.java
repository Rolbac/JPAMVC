package com.example.jpamvcdos.controller;

import com.example.jpamvcdos.admin.AdminDireccion;
import com.example.jpamvcdos.admin.AdminDireccionImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/direcciones")
public class ControllerDireccion {

    AdminDireccion adminDireccion;

    public ControllerDireccion(AdminDireccion adminDireccion){
        this.adminDireccion=adminDireccion;
    }

    @GetMapping
    public String paginaDirecciones(Model model){
        model.addAttribute("listado", adminDireccion.listDirecciones());
        return "direcciones/t_direcciones";
    }
}

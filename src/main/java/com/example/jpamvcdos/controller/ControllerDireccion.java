package com.example.jpamvcdos.controller;

import com.example.jpamvcdos.admin.AdminDireccion;
import com.example.jpamvcdos.admin.AdminPais;
import com.example.jpamvcdos.entities.Direccion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/direcciones")
public class ControllerDireccion {

    public static Logger log = LoggerFactory.getLogger(ControllerDireccion.class);

    AdminDireccion adminDireccion;
    AdminPais adminPais;

    public ControllerDireccion(AdminDireccion adminDireccion, AdminPais adminPais){
        this.adminDireccion=adminDireccion;
        this.adminPais=adminPais;
    }

    @GetMapping
    public String paginaDirecciones(Model model){
        log.info("[paginaDirecciones]");

        model.addAttribute("listado", adminDireccion.listDirecciones());
        model.addAttribute("paises",adminPais.listPaises());
        model.addAttribute("direccion", new Direccion());

        return "direcciones/t_direcciones";
    }

    @PostMapping
    public String insertarDireccion(@ModelAttribute Direccion direccion){
        log.info("[insertarDireccion]");

        direccion=adminDireccion.grabarDireccion(direccion);
        log.info("[La direccion "+direccion.toString()+" ha sido guardada]");

        return "redirect:/direcciones/"+direccion.getId();
    }

    @GetMapping("/{id}")
    public String irDireccion(@PathVariable Integer id,Model model){
        log.info("[irDireccion]");

        model.addAttribute("elemento", adminDireccion.conseguirDireccion(id));

        return "direcciones/t_direccion";
    }

    @GetMapping("/e/{id}")
    public String editarDireccionVista(@PathVariable Integer id, Model model){
        log.info("[editarDireccionVista]");

        model.addAttribute("elemento", adminDireccion.conseguirDireccion(id));
        model.addAttribute("paises",adminPais.listPaises());

        return "direcciones/t_e_direccion";
    }

    @PostMapping("/e")
    public String editarDireccion(@ModelAttribute Direccion direccion,Model model){
        log.info("[editarDireccion]");

        direccion=adminDireccion.editarDireccion(direccion);
        log.info("La dirección: {} ha sido editada", direccion);
        model.addAttribute("elemento",direccion);

        return "redirect:/direcciones/"+direccion.getId();
    }

    @GetMapping("/d/{id}")
    public String eliminarDireccion(@PathVariable Integer id){
        log.info("[eliminarDireccion]");

        Direccion direccion = adminDireccion.conseguirDireccion(id);
        log.info("Eliminando la dirección: {}", direccion);

        adminDireccion.eliminarDireccion(id);
        log.info("La dirección: {} ha sido eliminada", direccion);

        return "redirect:/direcciones";
    }
}

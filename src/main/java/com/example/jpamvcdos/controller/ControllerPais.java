package com.example.jpamvcdos.controller;

import com.example.jpamvcdos.admin.AdminPais;
import com.example.jpamvcdos.admin.AdminPaisImpl;
import com.example.jpamvcdos.admin.AdminRegion;
import com.example.jpamvcdos.entities.Pais;
import oracle.ucp.proxy.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paises")
public class ControllerPais {

    public static Logger log = LoggerFactory.getLogger(ControllerPais.class);

    AdminPais adminPais;
    AdminRegion adminRegion;

    public ControllerPais(AdminPais adminPais, AdminRegion adminRegion) {
        this.adminPais = adminPais;
        this.adminRegion = adminRegion;
    }

    @GetMapping
    public String paginaPaises(Model model){
        log.info("[paginaPaises]");
        model.addAttribute("listado", adminPais.listPaises());
        model.addAttribute("regiones", adminRegion.listRegion());
        model.addAttribute("pais", new Pais());
        return "paises/t_paises";
    }

    @GetMapping("/{id}")
    public String irPais(@PathVariable String id, Model model){
        model.addAttribute("elemento", adminPais.conseguirPais(id));
        return "paises/t_pais";
    }

    @PostMapping
    public String insertarPais(@ModelAttribute Pais pais){
        pais=adminPais.grabarPais(pais);

        return "redirect:/paises/"+ pais.getId();
    }

    @GetMapping("/e/{id}")
    public String editarPaisVista(@PathVariable String id, Model model){
        model.addAttribute("elemento", adminPais.conseguirPais(id));
        model.addAttribute("listado", adminRegion.listRegion());
        return "paises/t_e_pais";
    }

    @PostMapping("/e")
    public String editarPais(@ModelAttribute Pais pais, Model model){
        pais=adminPais.editarPais(pais);
        model.addAttribute("elemento",pais);
        return "redirect:/paises/"+pais.getId();
    }
    @GetMapping("/d/{id}")
    public String deletePais(@PathVariable String id){
        adminPais.eliminarPais(id);
        return "redirect:/paises";
    }


}

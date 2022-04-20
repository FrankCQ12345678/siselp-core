package edu.elp.siselp.controller;

import edu.elp.siselp.dao.IPersonaDao;
import edu.elp.siselp.entity.Persona;
import edu.elp.siselp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class Saludo {
    @Autowired
    private IPersonaService personaService;
    @GetMapping("/listaPersonas")
    public List<Persona> listaPersona(){
        return this.personaService.listaPersonas();
    }
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola Mundo  ..... te Saludo" + nombre;
    }
    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Bienvenido ";
    }
}

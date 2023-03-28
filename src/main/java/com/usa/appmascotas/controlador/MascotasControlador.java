package com.usa.appmascotas.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MascotasControlador {

    @GetMapping("/mascotas")
    public String obtenerMascotas(){
        return "Hola mundo";
    }
}

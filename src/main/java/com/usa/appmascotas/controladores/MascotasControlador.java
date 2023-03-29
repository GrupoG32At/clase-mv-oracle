package com.usa.appmascotas.controladores;

import com.usa.appmascotas.entidades.MascotaEntidad;
import com.usa.appmascotas.servicios.MascotaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MascotasControlador {
    @Autowired
    MascotaServicio mascotaServicio;

    @GetMapping("/mascotas")
    public Optional<MascotaEntidad> obtenerMascotasPorId(@RequestParam int id){
        return mascotaServicio.obtenerMascotaPorID(id);
    }

    @DeleteMapping("/mascotas")
    public void eliminarMascotasPorId(@RequestParam int id){
        mascotaServicio.eliminarMascotaPorId(id);
    }
}

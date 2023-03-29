package com.usa.appmascotas.servicios;

import com.usa.appmascotas.dbo.MascotaDbo;
import com.usa.appmascotas.entidades.MascotaEntidad;
import com.usa.appmascotas.repositorios.MascotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MascotaServicio {

    @Autowired
    MascotaRepositorio mascotaRepositorio;

    public Optional<MascotaEntidad> obtenerMascotaPorID(int id){
        return mascotaRepositorio.findById(id);
    }

    public void eliminarMascotaPorId(int id){
        mascotaRepositorio.deleteById(id);
    }

}

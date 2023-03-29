package com.usa.appmascotas.repositorios;

import com.usa.appmascotas.entidades.MascotaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepositorio extends JpaRepository<MascotaEntidad,Integer> {

}

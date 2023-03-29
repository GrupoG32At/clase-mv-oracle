package com.usa.appmascotas.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MascotaDbo {
    private int id;
    private String nombre;
    private String raza;
    private int edad;
}

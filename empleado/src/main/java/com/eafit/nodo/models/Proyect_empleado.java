package com.eafit.nodo.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Proyect_empleado {

    @ManyToOne
    @JoinColumn(name = "id_proyect", nullable = false)
    private Proyects proyect;
    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado empleado;


}

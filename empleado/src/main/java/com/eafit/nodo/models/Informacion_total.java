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

public class Informacion_total {

    @ManyToOne
    @JoinColumn(name = "id_proyect", nullable = false)
    private Proyects id_proyect;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado id_empleado;

    @ManyToOne
    @JoinColumn(name = "nomApell_empleado", nullable = false)
    private Empleado nomApell_empleado;

    @ManyToOne
    @JoinColumn(name = "salario_empleado", nullable = false)
    private Empleado salario_empleado;

    @ManyToOne
    @JoinColumn(name = "pago_mensual", nullable = false)
    private Empleado pago_mensual;
}

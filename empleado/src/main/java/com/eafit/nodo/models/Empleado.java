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
@Entity

public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id_empleado;
    @Column(nullable = false)
    private String nomApell_empleado;
    private Integer salario_mensual;
    private Integer pago_mensual;

    @ManyToOne
    @JoinColumn(name = "id_depart", nullable = false)
    private Departamentos departamentos;
}

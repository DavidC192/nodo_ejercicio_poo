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
public class Detalles {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id_registro;

    @ManyToOne
    @JoinColumn(name = "id_estudiantes", nullable = false)
    private Estudiante estudiante;

    @OneToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Materias curso;
}

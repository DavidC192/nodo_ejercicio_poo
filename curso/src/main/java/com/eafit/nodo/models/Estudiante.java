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
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id_estudiante;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;

    private String cursos;

}


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
public class Materias {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id_cursos;

    @ManyToOne
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profeso;
}

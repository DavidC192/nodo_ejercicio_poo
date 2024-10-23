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
public class Proyects  {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id_proyect;
    @Column(nullable = false)
    private String nombre_proyect;
}



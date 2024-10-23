package com.eafit.nodo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id_marca;
    @Column(nullable = false)
    private String nombre_marca;
    private String categori_marca;
}

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
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id_producto;
    @Column(nullable = false)
    private String nombre_producto;
    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false)
    private Marca marca;


}

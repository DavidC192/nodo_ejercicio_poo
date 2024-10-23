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
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int cliente_id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;

    private String gmail;

}


package com.eafit.nodo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id_notas;
    @Column(nullable = false)
    private Double nota_n1;
    private Double nota_n2;
    private Double nota_n3;
    private Double nota_n4;
    private Double nota_n5;
    private Double nota_n6;
    private Double nota_n7;

}

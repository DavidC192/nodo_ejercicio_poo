package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Venta;

public class ventaRepository extends AbstractRepository<Venta> {
    public ventaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
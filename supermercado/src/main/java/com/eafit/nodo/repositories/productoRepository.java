package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Producto;

public class productoRepository extends AbstractRepository<Producto> {
    public productoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
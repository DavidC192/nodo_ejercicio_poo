package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Detalles_venta;

public class detalles_ventaRepository extends AbstractRepository<Detalles_venta> {

    public detalles_ventaRepository() {
        super(new EntityManagerPostgres<>());
    }
}

package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Detalles;

public class detallesRepository extends AbstractRepository<Detalles> {

    public detallesRepository() {
        super(new EntityManagerPostgres<>());
    }
}

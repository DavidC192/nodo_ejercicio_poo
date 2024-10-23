package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Proyects;

public class proyectsRepository extends AbstractRepository<Proyects> {

    public proyectsRepository() {
        super(new EntityManagerPostgres<>());
    }
}
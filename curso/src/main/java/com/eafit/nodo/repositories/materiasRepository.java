package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Materias;

public class materiasRepository extends AbstractRepository<Materias> {
    public materiasRepository() {
        super(new EntityManagerPostgres<>());
    }
}
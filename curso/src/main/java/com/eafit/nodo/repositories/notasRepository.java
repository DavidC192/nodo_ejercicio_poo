package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Notas;

public class notasRepository extends AbstractRepository<Notas> {

    public notasRepository() {
        super(new EntityManagerPostgres<>());
    }
}
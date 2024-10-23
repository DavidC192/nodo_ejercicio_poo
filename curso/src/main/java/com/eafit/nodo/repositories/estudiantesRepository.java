package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Estudiante;

public class estudiantesRepository extends AbstractRepository<Estudiante> {

    public estudiantesRepository() {
        super(new EntityManagerPostgres<>());
    }
}
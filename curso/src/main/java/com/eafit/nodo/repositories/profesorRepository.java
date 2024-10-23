package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Profesor;

public class profesorRepository extends AbstractRepository<Profesor> {
    public profesorRepository() {
        super(new EntityManagerPostgres<>());
    }
}
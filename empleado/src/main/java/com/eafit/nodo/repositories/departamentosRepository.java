package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Departamentos;

public class departamentosRepository extends AbstractRepository<Departamentos> {

    public departamentosRepository() {
        super(new EntityManagerPostgres<>());
    }
}

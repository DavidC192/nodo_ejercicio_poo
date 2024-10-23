package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Informacion_total;

public class informacion_totalRepository extends AbstractRepository<Informacion_total> {
    public informacion_totalRepository() {
        super(new EntityManagerPostgres<>());
    }
}
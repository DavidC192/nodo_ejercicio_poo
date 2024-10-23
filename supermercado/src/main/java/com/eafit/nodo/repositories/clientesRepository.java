package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Clientes;

public class clientesRepository extends AbstractRepository<Clientes> {

    public clientesRepository() {
        super(new EntityManagerPostgres<>());
    }
}
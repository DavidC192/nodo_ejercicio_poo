package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Marca;

public class marcaRepository extends AbstractRepository<Marca> {

    public marcaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
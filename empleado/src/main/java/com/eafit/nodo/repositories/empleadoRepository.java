package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Empleado;

public class empleadoRepository extends AbstractRepository<Empleado> {

    public empleadoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
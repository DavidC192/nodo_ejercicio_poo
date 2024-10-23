package com.eafit.nodo.repositories;

import com.eafit.nodo.configs.EntityManagerPostgres;
import com.eafit.nodo.models.Proyect_empleado;

public class proyect_empleadoRepository extends AbstractRepository<Proyect_empleado> {
    public proyect_empleadoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
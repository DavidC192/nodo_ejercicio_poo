package com.eafit.nodo;

import com.eafit.nodo.models.Departamentos;
import com.eafit.nodo.models.Empleado;
import com.eafit.nodo.models.Informacion_total;
import com.eafit.nodo.models.Proyect_empleado;
import com.eafit.nodo.models.Proyects;
import com.eafit.nodo.repositories.departamentosRepository;
import com.eafit.nodo.repositories.empleadoRepository;
import com.eafit.nodo.repositories.informacion_totalRepository;
import com.eafit.nodo.repositories.proyect_empleadoRepository;
import com.eafit.nodo.repositories.proyectsRepository;

public class Main {
    public static void main(String[] args) {
        departamentosRepository departamentosRepository = new departamentosRepository();
        empleadoRepository empleadoRepository = new empleadoRepository();
        informacion_totalRepository informacion_totalRepository = new informacion_totalRepository();
        proyectsRepository proyectsRepository = new proyectsRepository();
        proyect_empleadoRepository proyect_empleadoRepository = new proyect_empleadoRepository();


        Departamentos departamento = new Departamentos();
        departamento.setId_depart(12311);
        departamento.setArea_depart("infrastructura");
        Departamentos departamento2 = Departamentos.builder()
                .id_depart(12111)
                .area_depart("tecnologia")
                .build();

        Empleado empleado1 = new Empleado();
        empleado1.setDepartamentos(departamento2);
        empleado1.setId_empleado(12111);
        empleado1.setNomApell_empleado("pedro");
        empleado1.setPago_mensual(10000);
        empleado1.setSalario_mensual(15000);

        Proyects proyects = Proyects.builder()
                .nombre_proyect("pedro_empanadas")
                .id_proyect(12111)
                .build();

        departamentosRepository.create(departamento);
        departamentosRepository.create(departamento2);
        empleadoRepository.create(empleado1);
        proyectsRepository.create(proyects);

        departamentosRepository.findAll()
                .forEach(System.out::println);
        empleadoRepository.findAll()
                .forEach(System.out::println);
        proyectsRepository.findAll()
                .forEach(System.out::println);

        departamentosRepository.close();
        empleadoRepository.close();
        proyectsRepository.close();
        informacion_totalRepository.close();
        proyect_empleadoRepository.close();

    }
}
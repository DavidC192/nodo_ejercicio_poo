package com.eafit.nodo;

import com.eafit.nodo.models.*;
import com.eafit.nodo.repositories.*;

public class Main {
    public static void main(String[] args) {

    detallesRepository detallesRepository = new detallesRepository();
    estudiantesRepository estudiantesRepository = new estudiantesRepository();
    materiasRepository materiasRepository = new materiasRepository();
    notasRepository notasRepository = new notasRepository();
    profesorRepository profesorRepository = new profesorRepository();

    Notas notas = new Notas();
    notas.setId_notas(12313);
    notas.setNota_n1(1.5);
    notas.setNota_n2(4.0);
    notas.setNota_n3(5.0);
    notas.setNota_n4(2.4);
    notas.setNota_n5(1.5);
    notas.setNota_n6(4.5);
    notas.setNota_n7(2.3);

    Estudiante estudiante = new Estudiante();
        estudiante.setId_estudiante(123);
        estudiante.setNombre("predro");
        estudiante.setApellido("man");
        estudiante.setCursos("matematicas");
    Estudiante estudiante2 = Estudiante.builder()
            .id_estudiante(3492)
            .nombre("anamaria")
            .apellido("lana")
            .cursos("lengua")
            .build();
    Profesor profesor = new Profesor();
        profesor.setId_profesor(15);
        profesor.setNotas(notas);

    Materias materias = new Materias();
        materias.setId_cursos(21);
        materias.setProfeso(profesor);

    Detalles detalles = new Detalles();
        detalles.setId_registro(2);
        detalles.setEstudiante(estudiante);
        detalles.setCurso(materias);

    detallesRepository.create(detalles);
    estudiantesRepository.create(estudiante);
    profesorRepository.create(profesor);
    materiasRepository.create(materias);
    notasRepository.create(notas);

    detallesRepository.findAll()
            .forEach(System.out::println);
    estudiantesRepository.findAll()
            .forEach(System.out::println);
    profesorRepository.findAll()
            .forEach(System.out::println);
    materiasRepository.findAll()
            .forEach(System.out::println);
    notasRepository.findAll()
            .forEach(System.out::println);

    detallesRepository.close();
    estudiantesRepository.close();
    profesorRepository.close();
    materiasRepository.close();
    notasRepository.close();

    }

}
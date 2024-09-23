package homework1.ejercicion2.tipo2;

import homework1.ejercicion2.Voluntario;

public class volInt extends Voluntario{
    
    protected Double tiempo;

    protected volInt(String nombre, Double salario, Integer tipo, Double horas, Integer cedula,Double tiempo){
    super(nombre, salario, tipo,horas,cedula);

    this.tiempo = tiempo;

    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Tipo: " + tipo);
        System.out.println("Horas: " + horas);
        System.out.println("Cédula: " + cedula);
        System.out.println("contrato" + tiempo);
    }
}
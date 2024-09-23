package homework1.ejercicion2.tipo1;

import homework1.ejercicion2.Asalariado;

public abstract class profesor extends Asalariado {

    public String topic;

    protected profesor(String nombre, Double salario, Integer tipo, Double seguridadSocial, Integer cedula, String topic){
    super(nombre, salario, tipo, seguridadSocial, cedula);

    this.topic = topic;

    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Tipo: " + tipo);
        System.out.println("seguridaSocial: " + seguridadSocial);
        System.out.println("Cédula: " + cedula);
    }
    
}

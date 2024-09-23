package homework1.ejercicion2.tipo1;

import homework1.ejercicion2.Asalariado;

public abstract class presonal extends Asalariado {

    public String zoneOfWork;

    protected presonal(String nombre, Double salario, Integer tipo, Double seguridadSocial, Integer cedula, String zoneOfWork){
    super(nombre, salario, tipo, seguridadSocial, cedula);

    this.zoneOfWork = zoneOfWork;

    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Tipo: " + tipo);
        System.out.println("seguridaSocial: " + seguridadSocial);
        System.out.println("Cédula: " + cedula);
    }
    
}

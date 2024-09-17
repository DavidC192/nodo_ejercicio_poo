package homework1.ejercicion2.tipo2;

import homework1.ejercicion2.Voluntario;

public class VolExtr extends Voluntario {

    protected String contrato;

    public VolExtr(String nombre, Double salario, Integer tipo, Double horas, Integer cedula, String contrato) {
        super(nombre, salario, tipo, horas, cedula);
        this.contrato = contrato;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();  // Call the base class method
        System.out.println("Contrato: " + contrato);
    }
}

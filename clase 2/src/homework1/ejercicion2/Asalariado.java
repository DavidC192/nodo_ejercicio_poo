package homework1.ejercicion2;

public abstract class Asalariado extends Persona {

    protected Double seguridadSocial;
    protected Integer cedula;

    public Asalariado(String nombre, Double salario, Integer tipo, Double seguridadSocial, Integer cedula) {
        super(nombre, salario, tipo);
        this.seguridadSocial = seguridadSocial;
        this.cedula = cedula;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Tipo: " + tipo);
        System.out.println("seguridaSocial: " + seguridadSocial);
        System.out.println("Cédula: " + cedula);
    }
}

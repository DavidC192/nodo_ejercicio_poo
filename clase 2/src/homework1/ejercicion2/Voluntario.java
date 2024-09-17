package homework1.ejercicion2;

public abstract class Voluntario extends Persona {

    protected Double horas;
    protected Integer cedula;

    public Voluntario(String nombre, Double salario, Integer tipo, Double horas, Integer cedula) {
        super(nombre, salario, tipo);
        this.horas = horas;
        this.cedula = cedula;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Tipo: " + tipo);
        System.out.println("Horas: " + horas);
        System.out.println("Cédula: " + cedula);
    }
}

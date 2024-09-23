package  homework1.ejercicion2;

public abstract class Persona {
    protected String nombre;
    protected Double salario;
    protected Integer tipo;

    public Persona(String nombre, Double salario, Integer tipo) {
        this.nombre = nombre;
        this.salario = salario;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}

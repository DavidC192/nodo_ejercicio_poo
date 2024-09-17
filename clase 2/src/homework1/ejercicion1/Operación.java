package homework1.ejercicion1;

public abstract class Operación {
    protected double número1;
    protected double número2;

    public Operación(double número1, double número2) {
        this.número1 = número1;
        this.número2 = número2;
    }

    public abstract double calcular(); // Método abstracto que debe ser implementado por las subclases
}

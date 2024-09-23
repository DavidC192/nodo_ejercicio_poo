package homework2.ejercicio2;

public class Multiplicación extends Operación {

    public Multiplicación(double número1, double número2) {
        super(número1, número2);
    }

    @Override
    public double calcular() {
        return número1 * número2;
    }
}

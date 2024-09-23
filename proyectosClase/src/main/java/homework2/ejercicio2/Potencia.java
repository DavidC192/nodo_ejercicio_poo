package homework2.ejercicio2;

public class Potencia extends Operación {

    public Potencia(double número1, double número2) {
        super(número1, número2);
    }

    @Override
    public double calcular() {
        return Math.pow(número1,número2);
    }
}
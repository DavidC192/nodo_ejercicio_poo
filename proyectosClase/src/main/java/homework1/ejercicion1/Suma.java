package homework1.ejercicion1;

import homework2.ejercicio2.Operación;

public class Suma extends Operación {

    public Suma(double número1, double número2) {
        super(número1, número2);
    }

    @Override
    public double calcular() {
        return número1 + número2;
    }
}
package homework1.ejercicion1;

import homework2.ejercicio2.Operación;

public class División extends Operación {

    public División(double número1, double número2) {
        super(número1, número2);
    }

    @Override
    public double calcular() {
        if (número2 != 0) {
            return número1 / número2;
        } else {
            throw new ArithmeticException("División por cero no permitida.");
        }
    }
}

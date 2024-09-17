package homework1.ejercicion1;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double número1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double número2 = scanner.nextDouble();

            System.out.println("Seleccione la operación:");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División");

            int opción = scanner.nextInt();
            Operación operación = null;

            switch (opción) {
                case 1:
                    operación = new Suma(número1, número2);
                    break;
                case 2:
                    operación = new Resta(número1, número2);
                    break;
                case 3:
                    operación = new Multiplicación(número1, número2);
                    break;
                case 4:
                    operación = new División(número1, número2);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            double resultado = operación.calcular();
            System.out.println("El resultado es: " + resultado);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Asegúrese de ingresar números válidos.");
        } finally {
            scanner.close();
        }
    }
}

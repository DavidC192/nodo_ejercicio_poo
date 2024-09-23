package homework2.ejercicio1;

import homework2.ejercicio1.persona.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "david", "marlondo", "2003/2/5", "Calle verde 23",2);

        cliente.introducirDestino("paris");
        cliente.introducirDestino("berlin");

        System.out.println(cliente);
        System.out.println(cliente.getDestinos());
    }
}

package homework2.ejercicio1.persona;

import homework2.ejercicio1.Dependencias;
import homework2.ejercicio1.Personar;

import java.util.List;

public class Cliente extends Personar {

    private Dependencias dependencias;

    public Cliente(Integer id, String name, String apellido, String fechaNacimiento, String direccion, Integer telefono) {
        super(id, name, apellido, fechaNacimiento, direccion, telefono);
        this.dependencias = new Dependencias();
    }

    public void introducirDestino(String destino) {
        dependencias.introducirDestino(destino);
    }

    public List<String> getDestinos() {
        return dependencias.getDestinos(); //
    }
}

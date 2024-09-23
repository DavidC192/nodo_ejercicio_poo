package homework2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Dependencias {

    private List<String> destinos;

    public Dependencias() {
        this.destinos = new ArrayList<>();
    }

    public void introducirDestino(String destino) {
        if (destino != null) {
            destinos.add(destino);
        }
    }

    public List<String> getDestinos() {
        return new ArrayList<>(destinos);
    }
}


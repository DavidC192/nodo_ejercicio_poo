package homework2.ejercicio1.persona;

import homework2.ejercicio1.Personar;

public class administrador extends Personar {

    public String areaLider;
    
    public administrador(Integer id, String name, String apellido, String fechaNacimiento, String direccion, Integer telefono){
        super(id, name, apellido, fechaNacimiento, direccion, telefono);

        this.areaLider=areaLider;
    }
    
}

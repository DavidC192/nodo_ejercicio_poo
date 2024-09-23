package homework2.ejercicio1.persona;

import homework2.ejercicio1.Personar;

public class gestorViajes extends Personar {

        public String lugaresPopulares;
    
    public gestorViajes(Integer id, String name, String apellido, String fechaNacimiento, String direccion, Integer telefono){
        super(id, name, apellido, fechaNacimiento, direccion, telefono);

        this.lugaresPopulares= lugaresPopulares;
    }
    
}

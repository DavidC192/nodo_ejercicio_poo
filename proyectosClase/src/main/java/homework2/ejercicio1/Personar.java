package homework2.ejercicio1;

import lombok.Data;

@Data
public abstract class Personar {

    private Integer id;
    private String name;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private Integer telefono;
    private boolean fechaNacimientoEstablecida = false;

    public Personar(Integer id, String name, String apellido, String fechaNacimiento, String direccion, Integer telefono) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        setFechaNacimiento(fechaNacimiento);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Personar(Integer id) {
        this.id = id;
    }

    public Personar(String fechaNacimiento) {
        setFechaNacimiento(fechaNacimiento);
    }

    public void setAttributes(Integer id, String name, String apellido, String direccion, Integer telefono) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (!fechaNacimientoEstablecida) {
            this.fechaNacimiento = fechaNacimiento; // Asigna si no ha sido establecido
            fechaNacimientoEstablecida = true; // Marca que ya se ha establecido
        } else {
            System.out.println("La fecha de nacimiento ya ha sido establecida y no se puede cambiar.");
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento; // Retorna la fecha de nacimiento
    }
}

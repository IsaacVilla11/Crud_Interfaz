package Clases;

/**
 *
 * @author IV
 */
public class Estudiante extends Persona {

    private String materia;

    public Estudiante() {
        super();
    }

    public Estudiante(String materia, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}

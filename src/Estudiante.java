/**
 * Representa un estudiante registrado en el sistema académico.
 */
public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Determina si el estudiante aprueba según su nota final.
     *
     * @param promedio corresponde al promedio obtenida por el estudiante
     * @return true si la nota es igual o superior a 4.0
     */
    public boolean estaAprobado(double promedio){
        return promedio >=4;
    }
}

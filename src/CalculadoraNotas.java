/**
 * Gestiona operaciones básicas relacionadas con
 * las notas de un estudiante.
 */
public class CalculadoraNotas {
    /**
     * Calcula el promedio de tres evaluaciones.
     *
     * @param nota1 primera nota
     * @param nota2 segunda nota
     * @param nota3 tercera nota
     * @return promedio de las tres notas
     */
    public double calcularPromedio(
            // Las tres evaluaciones tienen la misma ponderación.
            double nota1,
            double nota2,
            double nota3){
        return (nota1+nota2+nota3)/3;
    }
    public boolean estaAprobado(double promedio){
        /*
         * La escala utilizada considera 4.0
         * como nota mínima de aprobación.
         */
        return promedio >=4;
    }

}

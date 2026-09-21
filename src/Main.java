public class Main {
    public static void main(String[] args) {
        // Edad utilizada para evaluar una regla del sistema.
        int edad = 20;
        double descuento = 0.10;
        /*
         * El cálculo aplica el descuento definido
         * antes de obtener el total final.
         */
        double total = 50000;
        double totalFinal = total - (total * descuento);
        System.out.println("El usuario tiene "+edad+"\npor lo que tiene un descuento de "+descuento+"\npor lo que da un total de $"+totalFinal+".");
        Estudiante estudiante = new Estudiante("Pepe",41);
        CalculadoraNotas calculadora = new CalculadoraNotas();
        double promedio =calculadora.calcularPromedio(7.0,5.5,4.2);
        if (calculadora.estaAprobado(promedio)){
            System.out.println("El promedio es: "+promedio+"\n"+estudiante.getNombre()+" es aprobado");
        }
    }
}

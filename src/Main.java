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
        float nota1 = 5;
        float nota2 =3;
        float nota3 =7;
        float nota4 =6;
        float promedio = (nota1+nota2+ nota3+nota4)/4;
        if (estudiante.validaPromedio(promedio)){
            System.out.println("El promedio es: "+promedio+"\n"+estudiante.getNombre()+" es aprobado");
        }
    }
}

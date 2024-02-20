package ejercicio_01;

public class FuncionAlgebraica {

    // Función que calcula el valor de f(x, y)
    public static double calcularFuncion(double x, double y) {
        return x * x + 2 * x * y + y * y;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la función
        double x = 3.0;
        double y = 4.0;

        // Calcular el valor de la función
        double resultado = calcularFuncion(x, y);

        // Mostrar el resultado
        System.out.println("El valor de la función f(" + x + ", " + y + ") es: " + resultado);
    }
}

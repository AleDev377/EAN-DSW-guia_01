package ejercicio_04;

import java.util.Scanner;

public class GastosPedro {

    // Función que calcula el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        // El 40% del sueldo se destina al arriendo
        return 0.4 * sueldo;
    }

    // Función que calcula el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        // El 15% del sueldo se destina a comida
        return 0.15 * sueldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo de Pedro
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldoPedro = scanner.nextDouble();

        // Calcular el gasto en arriendo
        double gastoArriendo = calcularGastoArriendo(sueldoPedro);

        // Calcular el gasto en comida
        double gastoComida = calcularGastoComida(sueldoPedro);

        // Calcular el dinero que le queda a Pedro después del arriendo y la comida
        double dineroRestante = sueldoPedro - gastoArriendo - gastoComida;

        // Mostrar los resultados
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

        // Cerrar el scanner
        scanner.close();
    }
}

package ejercicio_05;

import java.util.Scanner;

public class AreaCoronaCircular {

    // Función que calcula el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Función que calcula el área de la corona circular utilizando la diferencia de áreas de dos círculos
    public static double calcularAreaCorona(double radioExterno, double radioInterno) {
        double areaCirculoExterno = calcularAreaCirculo(radioExterno);
        double areaCirculoInterno = calcularAreaCirculo(radioInterno);

        return areaCirculoExterno - areaCirculoInterno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el radio externo (R) de la corona
        System.out.print("Ingrese el radio externo (R) de la corona: ");
        double radioExterno = scanner.nextDouble();

        // Leer el radio interno (r) de la corona
        System.out.print("Ingrese el radio interno (r) de la corona: ");
        double radioInterno = scanner.nextDouble();

        // Calcular el área de la corona circular
        double areaCorona = calcularAreaCorona(radioExterno, radioInterno);

        // Mostrar el resultado
        System.out.println("El área de la corona circular es: " + areaCorona);

        // Cerrar el scanner
        scanner.close();
    }
}

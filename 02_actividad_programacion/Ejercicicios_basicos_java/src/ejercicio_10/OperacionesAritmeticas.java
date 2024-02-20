package ejercicio_10;

import java.util.Scanner;

public class OperacionesAritmeticas {

    // Función que realiza operaciones aritméticas según el operador dado
    public static double realizarOperacion(double num1, double num2, String operador) {
        double resultado = 0.0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: Módulo por cero no permitido.");
                }
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Error: Operador no válido.");
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números enteros
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Leer el operador
        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Realizar la operación usando la función
        double resultado = realizarOperacion(numero1, numero2, operador);

        // Mostrar el resultado
        System.out.println("El resultado de la operación es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}

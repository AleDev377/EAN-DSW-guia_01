package ejercicio_13;

import java.util.Scanner;

public class AumentoSueldo {

    // Función que calcula el valor del aumento del sueldo según las condiciones dadas
    public static double calcularAumentoSueldo(double sueldoActual) {
        double aumento;

        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10;
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08;
        } else {
            aumento = sueldoActual * 0.05;
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        // Calcular el aumento utilizando la función
        double aumentoSueldo = calcularAumentoSueldo(sueldoActual);

        // Calcular el nuevo salario
        double nuevoSalario = sueldoActual + aumentoSueldo;

        // Mostrar el resultado
        System.out.println("El aumento de sueldo es: $" + aumentoSueldo);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);

        // Cerrar el scanner
        scanner.close();
    }
}

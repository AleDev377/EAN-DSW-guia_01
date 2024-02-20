package ejercicio_09;

import java.util.Scanner;

public class MayorDeDosNumeros {

    // Función que retorna el mayor de dos números enteros
    public static int obtenerMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Obtener el mayor de los dos números usando la función
        int mayor = obtenerMayor(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El mayor de los dos números es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}

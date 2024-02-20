package ejercicio_11;

import java.util.Scanner;

public class NumeroRomano {

    // Función que retorna la cifra de las decenas de un número de dos cifras
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función que retorna la cifra de las unidades de un número de dos cifras
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función que retorna el equivalente en romano de un número de un dígito
    public static String obtenerRomanoUnidades(int digit) {
        switch (digit) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }

    // Función que retorna el equivalente en romano de las decenas de un número de un dígito
    public static String obtenerRomanoDecenas(int digit) {
        switch (digit) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero
        System.out.print("Ingrese un número entero (entre 1 y 99): ");
        int numero = scanner.nextInt();

        // Validar que el número tiene menos de 3 cifras y no es negativo
        if (numero > 0 && numero < 100) {
            // Obtener las decenas y unidades del número
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            // Convertir las unidades y decenas a romano
            String romanoUnidades = obtenerRomanoUnidades(unidades);
            String romanoDecenas = obtenerRomanoDecenas(decenas);

            // Imprimir el resultado
            System.out.println("Número en romano: " + romanoDecenas + romanoUnidades);
        } else {
            // Mostrar mensaje de error
            System.out.println("Error: El número debe estar entre 1 y 99 y no puede ser negativo.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}


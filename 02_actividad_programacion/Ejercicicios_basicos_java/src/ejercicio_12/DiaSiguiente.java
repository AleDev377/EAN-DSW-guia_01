package ejercicio_12;

import java.util.Scanner;

public class DiaSiguiente {

    // Función que retorna el nombre del día siguiente
    public static String obtenerDiaSiguiente(String dia) {
        // Convertir el nombre del día a minúsculas para hacer la comparación insensible a mayúsculas
        String diaMinusculas = dia.toLowerCase();

        switch (diaMinusculas) {
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día no válido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el nombre de un día
        System.out.print("Ingrese el nombre de un día: ");
        String nombreDia = scanner.nextLine();

        // Obtener el nombre del día siguiente usando la función
        String diaSiguiente = obtenerDiaSiguiente(nombreDia);

        // Mostrar el resultado
        System.out.println("El día siguiente a " + nombreDia + " es " + diaSiguiente);

        // Cerrar el scanner
        scanner.close();
    }
}

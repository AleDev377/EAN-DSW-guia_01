package ejercicio_02;

import java.util.Scanner;

public class AlquilerBuses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de sillas en un bus
        System.out.print("Ingrese el número de sillas en un bus: ");
        int sillasPorBus = scanner.nextInt();

        // Solicitar el número de estudiantes gordos y flacos
        System.out.print("Ingrese el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();

        System.out.print("Ingrese el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();

        // Calcular el número total de estudiantes y buses necesarios
        int totalEstudiantes = (estudiantesGordos * 2) + estudiantesFlacos;
        int busesNecesarios = (int) Math.ceil((double) totalEstudiantes / sillasPorBus);

        // Mostrar el resultado
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses para llevar a todos los estudiantes al paseo.");

        // Cerrar el scanner
        scanner.close();
    }
}

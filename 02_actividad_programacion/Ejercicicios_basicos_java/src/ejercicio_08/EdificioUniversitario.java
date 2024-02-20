package ejercicio_08;

import java.util.Scanner;

public class EdificioUniversitario {

    // Función que calcula el número de salones del nuevo edificio
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        // Redondear hacia arriba para asegurarse de tener suficientes salones
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función que obtiene el número de pisos del nuevo edificio
    public static int obtenerNumeroPisos(int numeroSalones, int salonesPorPiso) {
        // Calcular el número de pisos necesario
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de estudiantes de la universidad
        System.out.print("Ingrese el número de estudiantes de la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        // Leer la capacidad de un salón
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        // Leer el número de salones por piso
        System.out.print("Ingrese el número de salones que tendrá un piso del edificio: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones del nuevo edificio
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

        // Calcular el número de pisos del nuevo edificio
        int numeroPisos = obtenerNumeroPisos(numeroSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.println("El número de salones del nuevo edificio es: " + numeroSalones);
        System.out.println("El número de pisos del nuevo edificio es: " + numeroPisos);

        // Cerrar el scanner
        scanner.close();
    }
}

package ejercicio_06;

import java.util.Scanner;

public class TerrenoInmobiliario {

    // Función que calcula el área de un rectángulo a partir de su base y altura
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función que calcula la hipotenusa de un triángulo rectángulo a partir de los catetos
    public static double calcularHipotenusaTriangulo(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función que calcula el área de un triángulo a partir de su base y altura
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Función que calcula el perímetro del terreno a partir de los lados A, B, C
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusaTriangulo(ladoA - ladoC, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones de los lados A, B y C
        System.out.print("Ingrese la longitud del lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C: ");
        double ladoC = scanner.nextDouble();

        // Calcular el área del terreno
        double areaTerreno = calcularAreaRectangulo(ladoB, ladoA) +
                calcularAreaTriangulo(ladoB, ladoA - ladoC) +
                calcularAreaRectangulo(ladoB, ladoC);

        // Calcular el perímetro del terreno
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        // Mostrar los resultados
        System.out.println("El área del terreno es: " + areaTerreno);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);

        // Cerrar el scanner
        scanner.close();
    }
}

package ejercicio_03;

import java.lang.Math;

public class LongitudEscalera {

    // Función que calcula la longitud de la escalera en función de la altura y el ángulo de inclinación
    public static double calcularLongitudEscalera(double altura, double anguloInclinacion) {
        // Convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(anguloInclinacion);

        // Calcular la longitud de la escalera utilizando la fórmula y = x / cos(α)
        double longitudEscalera = altura / Math.cos(anguloRadianes);

        return longitudEscalera;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la función
        double alturaEscalera = 5.0; // Cambiar según la altura de la escalera
        double anguloInclinacion = 45.0; // Cambiar según el ángulo de inclinación

        // Calcular la longitud de la escalera
        double longitudCalculada = calcularLongitudEscalera(alturaEscalera, anguloInclinacion);

        // Mostrar el resultado
        System.out.println("La longitud de la escalera es: " + longitudCalculada);
    }
}

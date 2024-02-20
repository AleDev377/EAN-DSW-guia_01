public class Proyectil {
    private double velocidad;
    private double angulo;
    
    // Constructor
    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    
    // Método para obtener la distancia alcanzada
    public double getDistancia() {
        double g = 9.81; // Aceleración debido a la gravedad en m/s^2
        double distancia = (Math.pow(velocidad, 2) * Math.sin(2 * Math.toRadians(angulo))) / g;
        return distancia;
    }
    
    // Métodos para obtener y establecer la velocidad y el ángulo
    public double getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public double getAngulo() {
        return angulo;
    }
    
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
}

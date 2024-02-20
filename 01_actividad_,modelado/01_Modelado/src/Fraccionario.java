public class Fraccionario {
    private int numerador;
    private int denominador;
    
    // Constructor
    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    // Métodos para obtener y establecer el numerador y el denominador
    public int getNumerador() {
        return numerador;
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public int getDenominador() {
        return denominador;
    }
    
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getFraccionario(){
        return numerador/denominador;
    }
}

public class Fecha {
    private int año;
    private int mes;
    private int dia;
    
    // Constructor
    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    
    // Método para obtener la fecha completa
    public String getFechaCompleta() {
        return dia + "/" + mes + "/" + año;
    }
    
    // Métodos para obtener y establecer el año, mes y día
    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
}

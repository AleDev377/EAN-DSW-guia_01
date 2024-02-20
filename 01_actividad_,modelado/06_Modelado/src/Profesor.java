public class Profesor extends Persona {
    private int codigoProfesor;
    private String departamento;

    public Profesor(String nombre, int edad, int codigoProfesor, String departamento) {
        super(nombre, edad);
        this.codigoProfesor = codigoProfesor;
        this.departamento = departamento;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
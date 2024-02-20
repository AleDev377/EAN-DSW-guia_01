public class App {
    public static void main(String[] args) throws Exception {
         // Crear instancia de Estudiante
         Estudiante estudiante = new Estudiante("Juan", 20, 12345, "Ingeniería");
        
         // Crear instancia de Profesor
         Profesor profesor = new Profesor("María", 35, 98765, "Matemáticas");
         
         // Imprimir datos del estudiante
         System.out.println("Datos del estudiante:");
         System.out.println("Nombre: " + estudiante.getNombre());
         System.out.println("Edad: " + estudiante.getEdad());
         System.out.println("Código de estudiante: " + estudiante.getCodigoEstudiante());
         System.out.println("Carrera: " + estudiante.getCarrera());
         
         // Imprimir datos del profesor
         System.out.println("\nDatos del profesor:");
         System.out.println("Nombre: " + profesor.getNombre());
         System.out.println("Edad: " + profesor.getEdad());
         System.out.println("Código de profesor: " + profesor.getCodigoProfesor());
         System.out.println("Departamento: " + profesor.getDepartamento());
 
    }
}

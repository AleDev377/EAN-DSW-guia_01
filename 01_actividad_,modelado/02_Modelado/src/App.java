public class App {
    public static void main(String[] args) throws Exception {

        Reloj reloj = new Reloj(10, 20, 33);
        
        System.out.println("Hora: " + reloj.getHoraCompleta());
    }
}

import java.util.Scanner;

public class Saludo {

    public static void saludar(String nombreEntrada) {
        System.out.println("Bienvenid@ " + nombreEntrada);
    }

    public static void main (String [] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = lector.nextLine();
        saludar(nombre);
    }

}

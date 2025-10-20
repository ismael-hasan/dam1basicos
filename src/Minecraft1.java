import java.util.Scanner;

public class Minecraft1 {
    public static void main(String [] args) {

  /*      El minero de Minecraft
        Pide al usuario cuántos bloques quiere picar.
                Usa un bucle for para simular que los va picando uno a uno e imprime mensajes como:
        "Picando bloque 1...", "Picando bloque 2...", etc.
                Al final, imprime "Has terminado de picar X bloques!".*/

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce cuantos bloques quieres picar");
        int numeroAPicar = lector.nextInt();

        for (int bloqueActual = 1; bloqueActual<=numeroAPicar; bloqueActual++) {
            System.out.println("Picando bloque " + bloqueActual);
        }
        System.out.println("Has terminado de picar " + numeroAPicar + " bloques.");
    }

}

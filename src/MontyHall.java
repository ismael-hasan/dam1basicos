import java.util.Random;
import java.util.Scanner;

public class MontyHall {
    public static void main (String [] args) {
        // Inicializamos los parámetros de la simulación
        int numeroRepeticiones;
        System.out.println("¿Cuantas partidas simulamos?");
        Scanner lector = new Scanner(System.in);
        numeroRepeticiones = lector.nextInt();
        Random generador = new Random();

        // Inicializamos el contador de victorias
        int totalVictorias = 0;

        for (int i=0; i<numeroRepeticiones; i++) {
            // Asignammos el premio a una puerta aleatoria
            int puertaPremio = generador.nextInt(1,4);
            // El usuario elige una puerta aleatoria
            int puertaElegidaConcursante = generador.nextInt(1,4);
            int puertaAbierta = 1;
            // El presentador abre una puerta que NO es la del concursante y NO es la del premio
            while (puertaAbierta== puertaPremio ||  puertaAbierta==puertaElegidaConcursante) {
                puertaAbierta++;
            }

            int puertaACambiar;
            // Si la puerta abierta es la 1 y elige la 2, le dejamos cambiar a la 3; si no, a la 2.
            if (puertaAbierta == 1) {
                if (puertaElegidaConcursante==2) {
                    puertaACambiar = 3;
                } else {
                    puertaACambiar = 2;
                }
            } else if (puertaAbierta == 2) {
                // Si la puerta abierta es la 2 y elige la 1, le dejamos cambiar a la 3; si no, a la 1.

                if (puertaElegidaConcursante==1) {
                    puertaACambiar = 3;
                } else {
                    puertaACambiar = 1;
                }
            } else {
                // Si la puerta abierta es la 3 y elige la 1, le dejamos cambiar a la 2; si no, a la 1.

                if (puertaElegidaConcursante==1) {
                    puertaACambiar = 2;
                } else {
                    puertaACambiar = 1;
                }
            }
            System.out.println("El concursante ha elegido la puerta " + puertaElegidaConcursante);
            System.out.println("El presentador abre la puerta " + puertaAbierta + ", y está vacía");
            System.out.println("El concursante decide cambiar su puerta por la puerta " + puertaACambiar);
            if (puertaACambiar == puertaPremio) {
                System.out.println("El concursante ha ganado! ");
                totalVictorias++;
            } else {
                System.out.println("El concursante ha perdido... ");
            }
        }
        System.out.println("EL concursante ha ganado " +
                totalVictorias + " de un total de " +
                numeroRepeticiones + " partidas. ");
    }
}

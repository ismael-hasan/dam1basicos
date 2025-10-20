import java.util.Scanner;

public class BatallaPokemonSimple {
    public static void main(String [] args) {
        /*

Batalla pokémon simplificada

Pide al usuario los puntos de vida (HP) de su Pokémon y los del rival.
Mientras ambos tengan vida (while), resta daño en cada turno y muestra el resultado.
No tienes que elegir tipo de ataque; simplemente, resta un daño concreto que has guardado en una variable previamente.
Usa condicionales para determinar quién gana: "Tu Pokémon ha ganado!" o "Has perdido...".
         */


        boolean esTurnoJugador = true;
        int hpJugador;
        int hpRival;
        int danhoPorAtaque;

        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuanta vida tiene el jugador?");
        hpJugador = lector.nextInt();
        System.out.println("¿Cuanta vida tiene el rival?");
        hpRival = lector.nextInt();
        System.out.println("¿Cuanto daño se hace por ataque?");
        danhoPorAtaque = lector.nextInt();

        // Mientras ambos estén vivos, seguimos pegando, un turno cada uno.

        int numeroRonda = 0;
        while (hpJugador>0 && hpRival > 0 ) {
            numeroRonda++;
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX\nComienza la rond120a " + numeroRonda);
            if (esTurnoJugador) {
                System.out.println("El jugador hace " + danhoPorAtaque + " a su rival.");
                hpRival = hpRival - danhoPorAtaque;
                System.out.println("Al rival le quedan " + hpRival + " puntos de vida. ");
                esTurnoJugador = !esTurnoJugador;
            } else {
                System.out.println("El rival hace " + danhoPorAtaque + " al jugador.");
                hpJugador = hpJugador - danhoPorAtaque;
                System.out.println("Al jugador le quedan " + hpJugador + " puntos de vida. ");
                esTurnoJugador = !esTurnoJugador;
            }
        }
        System.out.println("La batalla termina!");
        if (hpJugador>0) {
            System.out.println("El jugador ha ganado");
        } else {
            System.out.println("El jugador ha perdido");
        }

    }

}

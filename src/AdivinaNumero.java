import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main (String[] args) {
/*        Genera un número aleatorio del 1 al 10.
        Pide al usuario que lo adivine usando un bucle while.
        Si el número es mayor o menor, muestra una pista con un if.
        Cuando acierte, imprime "¡Correcto! Has adivinado el número en X intentos!".

 */
        // Generamos un número aleatorio con la clase java.util.Random que puede ser cualquiera de 1 a 10
        Random random = new Random();
        int numeroParaAdivinar = random.nextInt(1,11);

        Scanner lector = new Scanner(System.in);

        // Almacenamos cuantos intentos tiene el usuario. Cada vez que el usuario pone un número, es un intento.
        // También utlizamos una variable de control para el bucle.
        int intentos = 0;
        boolean haAcertado = false;

        // Mientras NO acierte el número, le vamos pidiendo uno nuevo.
        while (!haAcertado) {
            System.out.println("Introduce un número del 1 al 10");
            int numeroActual = lector.nextInt();
            intentos ++;
            if (numeroActual==numeroParaAdivinar) {
                // si acertamos, cambiamos el valor de la variable de control para no ejecutar más el bucle.
                System.out.println("Has acertado! ");
                haAcertado = true;
            } else {
                if (numeroActual>numeroParaAdivinar) {
                    System.out.println("Te has pasado ");
                } else {
                    System.out.println("Te has quedado cort@ ");
                }
            }
        }
        System.out.println("Has acertado en " + intentos + " intentos.");
    }
}

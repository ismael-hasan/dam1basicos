import java.util.Random;
import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
  /*      Pide al usuario cuántas veces quiere lanzar una moneda.
                Usa un bucle for para generar resultados aleatorios (“cara”o “cruz”);
        Cuenta cuántas veces salió cada uno y muestra el total al final.
        */

        // Inicializamos el lector y el generador de valores aleatorios con el que simularemos los lanzamientos de moneda.
        // El generador aleatorio tiene varios métodos a los que accedemos con un punto después de su nombre. Uno de ellos,
        // nos genera un booleano aleatorio - un TRUE o FALSE.
        Scanner lector = new Scanner(System.in);
        Random generadorAleatorio = new Random();

        // inicializamos 2 contadores, uno para saber cuanto ha salido cara, y otro cuanto ha salido cruz.
        int numeroCaras = 0;
        int numeroCruces = 0;

        // preguntamos al usuario cuantas tiradas quiere hacer
        System.out.println("¿Cuantas veces quieres lanzar la moneda?");
        int numeroTiradas = lector.nextInt();


        // Hacemos un bucle que se va a repetir exactamente el número de tiradas pedido

        for (int numeroTiradaActual = 1; numeroTiradaActual<=numeroTiradas; numeroTiradaActual++) {
            // Tiramos la moneda. Consideramos que si el generador devuelve TRUE es cara, y si no es cruz.
            System.out.println("Tiramos la moneda. Es la tirada número " + numeroTiradaActual);
            boolean haSalidoCara = generadorAleatorio.nextBoolean();

            // Imprimimos el resultado
            if (haSalidoCara) {
                // Ha salido cara. Imprimimos eso, y sumamos uno al contador de cuantas caras llevamos.
                System.out.println("En la tirada número " + numeroTiradaActual + " ha salido cara.");
                numeroCaras++;
            } else {
                System.out.println("En la tirada número " + numeroTiradaActual + " ha salido cruz.");
                numeroCruces++;
            }

        }
        // Al salid del bucle...
        System.out.println("Ha habido " + numeroCaras + " caras y " + numeroCruces + " cruces en total.");
    }

}
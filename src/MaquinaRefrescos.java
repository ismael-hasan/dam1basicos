import java.util.Scanner;

public class MaquinaRefrescos {
    public static void main (String [] args) {
/*        Pide al usuario su saldo y el precio del refresco.
        Si tiene dinero suficiente, calcula el cambio y muestra "Aquí tienes tu refresco y tu cambio: X €".
                Si no, muestra "Saldo insuficiente 😞".
                Permite repetir la compra con un bucle while hasta que el usuario introduzca saldo suficiente.

 */
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuanto dinero tienes");
        int dinero = lector.nextInt();
        System.out.println("¿Cuanto vale el refresco que quieres comprar?");
        int precioRefresco = lector.nextInt();

        // repetiremos el bucle hasta que el usuario se quede sin dinero.
        while (dinero>=precioRefresco) {
            System.out.println("Has comprado el refresco.");
            dinero = dinero - precioRefresco;
            System.out.println("Te quedan: " + dinero);
        }
        System.out.println("Te quedan " + dinero + " euros. Ya no puedes comprar más refrescos.");
    }
}

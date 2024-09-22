
package semana6;
import java.util.Scanner;
//entrada de datos
public class ejercicio2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        int intento;
        //proceso de datos
        System.out.println("Adivina el numero secreto entre 1 al 10:");
        intento = scanner.nextInt();
        
        while (intento != numeroSecreto) {
            System.out.println("Incorrecto. Intenta nuevamente: ");
            intento = scanner.nextInt();
        }
        //salida de datos
        System.out.println(" Adivinaste el numero.");

    }
}  



package semana6;
import java.util.Scanner;
//entrada de datis
public class ejercicio3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        int factorial = 1;
        //proceso de datos
        while (numero > 0) {
            factorial *= numero;
            numero--;
        }
        //salida de datos
        System.out.println("El factorial es: " + factorial);

    }
}  


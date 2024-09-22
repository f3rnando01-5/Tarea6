package semana6;

import java.util.Scanner;
//entrada de datos
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        //proceso de datos
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        //salida de datos
        System.out.println("El numero tiene " + contador + " digitos.");
  
    }
}
package ej10;
import java.util.Scanner;
public class ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero no negativo: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Error: El número debe ser no negativo.");
        } else {
            long factorial = 1; 

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + num + " es: " + factorial);
        }

        sc.close();
    }

}

package ej10;

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero no negativo: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Error: El numero debe ser no negativo.");
        } else {
            long factorial = 1;

            // Calcula el factorial del numero ingresado
            for (int i = 1; i <= num; i++) {
                factorial *= i; // Multiplica el factorial por cada numero desde 1 hasta num
            }

            System.out.println("El factorial de " + num + " es: " + factorial);
        }

        sc.close();
    }

}

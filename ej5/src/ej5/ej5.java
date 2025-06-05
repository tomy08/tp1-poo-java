package ej5;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero del 1 al 10: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 10) { // Verifica que el numero este en el rango de 1 a 10
            System.out.println("Tabla de multiplicar del " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i)); // Imprime la tabla de multiplicar.
            }
        } else {
            System.out.println("Error: Introduce un numero entre 1 y 10.");
        }

        scanner.close();

    }
}

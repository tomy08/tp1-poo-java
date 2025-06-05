package ej8;

import java.util.Scanner;
import java.util.Random;

public class ej8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random(); // Crea una instancia de Random para generar números aleatorios
        int numAAdivinar = rnd.nextInt(100) + 1;
        int guess = 0;
        int guesses = 0;

        do {
            System.out.println("Ingresar numero entre 1 y 100:");
            guess = sc.nextInt();

            // Verifica que el número ingresado esté dentro del rango permitido
            if (guess < 1 || guess > 100) {
                System.out.println("Número invalido, debe estar entre 1 y 100.");
                continue;
            }

            // Compara el número a adivinar con el número ingresado
            if (numAAdivinar > guess) {
                System.out.println("El numero a adivinar es mayor.");
            } else if (numAAdivinar < guess) {
                System.out.println("El numero a adivinar es menor.");
            }

            // Incrementa el contador de intentos
            guesses++;

        } while (numAAdivinar != guess);

        System.out.println("¡Adivinaste el número en " + guesses + " intentos.");

        sc.close();
    }

}

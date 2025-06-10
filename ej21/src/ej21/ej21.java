package ej21;
import java.util.Scanner;
public class ej21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Arreglo de 10 numeros enteros
        int[] numeros = {5, 12, 7, 3, 18, 9, 2, 15, 6, 10};

        System.out.print("Ingresa un número X: ");
        int x = scanner.nextInt();

        int contador = 0;

        for (int num : numeros) {
            if (num > x) {
                contador++;
            }
        }

        System.out.println("Cantidad de elementos mayores que " + x + ": " + contador);

        scanner.close();
	}

}

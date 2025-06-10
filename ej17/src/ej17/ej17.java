package ej17;
import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Elimina espacios al inicio y final, y divide por espacios
        String[] palabras = frase.trim().split("\\s+");
        int cantidad = (frase.trim().isEmpty()) ? 0 : palabras.length;

        System.out.println("La cantidad de palabras es: " + cantidad);

        scanner.close();
	}

}

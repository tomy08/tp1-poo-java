package ej6;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar una frase/palabra: ");
		String texto = sc.nextLine(); // Lee la frase o palabra ingresada por el usuario

		String textoInvertido = new StringBuilder(texto).reverse().toString(); // Invierte el texto usando StringBuilder
																				// y su metodo reverse

		System.out.println("El texto convertido es: " + textoInvertido);

		sc.close();
	}
}

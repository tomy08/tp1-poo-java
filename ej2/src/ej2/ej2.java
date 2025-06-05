package ej2;

public class ej2 {

	public static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) { // Busca si hay algun divisor distinto de 1 y de si mismo
			if (num % i == 0) { // Si encuentra un divisor exacto
				return false;
			}
		}
		return true;
	}

	public static void mostrarDivisores(int num) {
		System.out.print("Divisores de: " + num + ": "); // Muestra los divisores del numero
		for (int i = num; i > 0; i--) { // Recorre desde el numero hasta 1
			if (num % i == 0) { // Si es divisor
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) { // Recorre los numeros del 50 al 100
			if (esPrimo(i)) { // Si es primo
				System.out.println(i + " es primo");
				continue;
			}
			mostrarDivisores(i); // Si no es primo, muestra sus divisores
		}
	}
}
package ej1; // Define el paquete donde esta la clase

public class ej1 { // Declaracion de la clase principal

	// Metodo que determina si un numero es par
	public static boolean esPar(int num) {
		if (num % 2 == 0) { // Si el resto de dividir num por 2 es 0
			return true; // El numero es par
		}
		return false; // El numero no es par
	}

	// Metodo principal que se ejecuta al iniciar el programa
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // Bucle desde 1 hasta 100 inclusive
			if (esPar(i)) { // Si el numero es par
				System.out.println("Par"); // Imprime "Par"
				continue; // Salta a la siguiente iteracion del bucle
			}
			System.out.println(i); // Si no es par, imprime el numero
		}
	}
}
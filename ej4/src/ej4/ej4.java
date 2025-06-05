package ej4;

import java.util.Scanner;

public class ej4 {

	private static boolean esPar(int num) {
		if (num % 2 == 0) { // Devuelve true si el numero es par
			return true;
		}
		return false;
	}

	public static int sumaNums(int res) {
		if (esPar(res) && res < 2)
			return 0; // Caso base para pares
		if (!esPar(res) && res < 1)
			return 0; // Caso base para impares
		return res + sumaNums(res - 2); // Suma recursiva de pares o impares
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresar un numero: ");
		int num = sc.nextInt(); // Lee el numero ingresado
		int resSumaPares, resSumaImpares;

		if (esPar(num)) { // Si el numero es par
			resSumaPares = sumaNums(num); // Suma los pares hasta num
			resSumaImpares = sumaNums(num - 1); // Suma los impares hasta num-1
		} else {
			resSumaPares = sumaNums(num - 1); // Suma los pares hasta num-1
			resSumaImpares = sumaNums(num); // Suma los impares hasta num
		}

		System.out.println("La suma de pares es: " + resSumaPares);
		System.out.println("La suma de impares es: " + resSumaImpares);
		sc.close();
	}

}
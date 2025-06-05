package ej3;

import java.util.Scanner; // Importa la clase Scanner para leer datos del usuario

public class ej3 {

	public static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) { // Busca si hay algun divisor distinto de 1 y de si mismo
			if (num % i == 0) { // Si encuentra un divisor exacto
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer desde teclado
		int num = 0;

		do {
			System.out.println("Ingresar numero mayor a 100 y primo"); // Pide un numero al usuario
			num = sc.nextInt(); // Lee el numero ingresado

		} while (!(esPrimo(num) && num > 100)); // Repite hasta que sea primo y mayor a 100
		System.out.println("El numero " + num + " es primo y mayor a 100"); // Confirma el resultado

		sc.close(); // Cierra el Scanner
	}

}
package ej2;

public class ej2 {

	public static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void mostrarDivisores(int num) {
		System.out.print("Divisores de: " + num + ": ");
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			if (esPrimo(i)) {
				System.out.println(i +" es primo");
				continue;
			}
			mostrarDivisores(i);
		}
	}
}

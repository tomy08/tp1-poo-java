package ej14;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();
		
		System.out.print("Secuencia Fibonacci: 0, 1, ");
		int lastNum = 0;
		int numActual  = 1;
		int res = 0;
		
		// Ciclo for hasta n
		for (int i = 2; i < n; i++) {
			res = lastNum + numActual; 
			
			// Intercambio de variables para proximo resultado
			lastNum = numActual;
			numActual = res;
			
			System.out.print(res); // imprime el resultado
			if (i + 1 != n) { // si no es el ultimo numero
				System.out.print(", ");
			}
		}

		sc.close();
	}
	
}

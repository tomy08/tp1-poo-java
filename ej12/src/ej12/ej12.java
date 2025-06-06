package ej12;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
		int num = sc.nextInt();
		int res = 0;

		// Convertir el numero a String
		String numStr = Integer.toString(num); 
		
		// Sumar los digitos
		for(int i = 0; i < numStr.length(); i++) {
			int n = Character.getNumericValue(numStr.charAt(i));
			res += n;
		}

		System.out.println("La suma de los dígitos es: " + res);
		
		sc.close();
	}

}

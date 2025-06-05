package ej4;

import java.util.Scanner;

public class ej4 {
	
	private static boolean esPar(int num) {
		if (num%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static int sumaNums(int res) {
	    if (esPar(res) && res < 2) return 0;
	    if (!esPar(res) && res < 1) return 0;  
	    return res + sumaNums(res - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar un numero: ");
		int num = sc.nextInt();
		int resSumaPares,resSumaImpares;
		
		if (esPar(num)) {
			resSumaPares = sumaNums(num);
			resSumaImpares = sumaNums(num-1);
		}else {
			resSumaPares = sumaNums(num-1);
			resSumaImpares = sumaNums(num);
		}
		
		System.out.println("La suma de pares es: " + resSumaPares);
		System.out.println("La suma de impares es: " + resSumaImpares);
		sc.close();
	}

}

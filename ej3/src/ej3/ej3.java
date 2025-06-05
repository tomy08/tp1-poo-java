package ej3;
import java.util.Scanner;

public class ej3 {
	
	public static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("Ingresar numero mayor a 100 y primo");
			num = sc.nextInt();
			
		}
		while (!(esPrimo(num) && num>100));
		System.out.println("El numero " + num + " es primo y mayor a 100");
		
		sc.close();
	}

}

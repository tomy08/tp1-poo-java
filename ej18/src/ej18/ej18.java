package ej18;
import java.util.Scanner;

public class ej18 {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa la cantidad de filas: ");
	        int n = scanner.nextInt();
	        
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	        
	        scanner.close();
	}

}

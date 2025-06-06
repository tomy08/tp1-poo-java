package ej11;
import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	
	        System.out.print("Introduce un año: ");
	        int year = sc.nextInt();

	        // Verifica que el año sea biciesto
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " es un año bisiesto.");
	        }
	        else {
	            System.out.println(year + " no es un año bisiesto.");
	        }

	        sc.close();
	}

}

package ej22;
import java.util.Scanner;
public class ej22 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        double[] calificaciones = new double[5];
	        
	        // Pide al usuario que ingrese las calificaciones
	        System.out.println("Ingresa las 5 calificaciones:");
	        for (int i = 0; i < calificaciones.length; i++) {
	            System.out.print("Calificación " + (i + 1) + ": ");
	            calificaciones[i] = scanner.nextDouble();
	        }

	        // Calcula el promedio 
	        double suma = 0;
	        for (double calificacion : calificaciones) {
	            suma += calificacion;
	        }

	        double promedio = suma / calificaciones.length;

	        // Mostrar el resultado
	        System.out.println("El promedio de las calificaciones es: " + promedio);

	        scanner.close();
	}

}

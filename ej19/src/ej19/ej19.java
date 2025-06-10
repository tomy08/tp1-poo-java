package ej19;
import java.util.Random;
public class ej19 {

	public static void main(String[] args) {
		 Random random = new Random();

	        // Genera dos numeros entre 1 y 6 (inclusive)
	        int dado1 = random.nextInt(6) + 1;
	        int dado2 = random.nextInt(6) + 1;

	        // Calcula la suma de los dos dados
	        int suma = dado1 + dado2;

	        // Muestra los resultados
	        System.out.println("Dado 1: " + dado1);
	        System.out.println("Dado 2: " + dado2);
	        System.out.println("Suma total: " + suma);
	}

}

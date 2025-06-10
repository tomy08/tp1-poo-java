package ej23;
import java.util.Scanner;
public class ej23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
  
        String[] ciudades = {"Madrid", "Barcelona", "Lisboa", "Buenos Aires", "Mexico"};
       
        System.out.print("Ingresa el nombre de una ciudad para buscar: ");
        String ciudadBuscada = scanner.nextLine();

        // Usar un bucle for-each para buscar la ciudad en el arreglo
        boolean encontrada = false;
        for (String ciudad : ciudades) {
            if (ciudad.toLowerCase().contains(ciudadBuscada.toLowerCase())) {
                encontrada = true;
                break;
            }
        }

   
        if (encontrada) {
            System.out.println("La ciudad " + ciudadBuscada + " ha sido encontrada");
        } else {
            System.out.println("La ciudad " + ciudadBuscada + " no esta en la lista.");
        }

        scanner.close();
	}

}

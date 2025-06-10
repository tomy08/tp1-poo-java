package ej15;
import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        double saldo = 1000.0;
	        int opcion;

	        do {
	        	
	        	// llama al menu
	            opcion = menu(scanner);

	            // switch con cada caso posible del menu
	            switch (opcion) {
	                case 1:
	                    System.out.println("Tu saldo actual es: $" + saldo);
	                    break;
	                case 2:
	                    System.out.print("Cuanto deseas depositar? $");
	                    double deposito = scanner.nextDouble();
	                    if (deposito > 0) {
	                        saldo = saldo + deposito;
	                        System.out.println("Deposito realizado correctamente.");
	                    } else {
	                        System.out.println("Cantidad invalida.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Cuanto deseas retirar? $");
	                    double retiro = scanner.nextDouble();
	                    if (retiro > 0 && retiro <= saldo) {
	                        saldo = saldo - retiro;
	                        System.out.println("Retiro realizado correctamente.");
	                    } else if (retiro > saldo) {
	                        System.out.println("Fondos insuficientes.");
	                    } else {
	                        System.out.println("Cantidad invalida.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Gracias por usar el cajero!");
	                    break;
	                default: // si no selecciono ninguna opcion valida, imprime un mensaje de error.
	                    System.out.println("Opcion no valida.");
	            }
	        } while (opcion != 4);

	        scanner.close();
	}

    private static int menu(Scanner scanner) {
        System.out.println("\n--- Cajero Automatico ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
        int opcion = scanner.nextInt();
        return opcion;
    }
}

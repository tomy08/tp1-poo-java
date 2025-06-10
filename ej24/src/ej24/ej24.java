package ej24;

public class ej24 {

	public static void main(String[] args) {
		// Arreglo de numeros
        int[] numeros = {10, 20, 30, 40, 50};

        // Variable para almacenar la suma
        int suma = 0;

        // Utilizamos un bucle for-each para recorrer el arreglo y sumar sus elementos
        for (int numero : numeros) {
            suma += numero;
        }

        // Mostrar el resultado
        System.out.println("La suma de los numeros es: " + suma);
	}

}

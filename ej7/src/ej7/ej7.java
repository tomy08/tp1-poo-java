package ej7;

import java.util.Scanner;

public class ej7 {
	
	public static boolean esVocal(char letra, char[] vocales) {
        for (char v : vocales) {
            if (letra == v) {
                return true;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		char vocales[] = {'a', 'e', 'i', 'o', 'u'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar una frase/palabra: ");
		String texto = sc.nextLine().toLowerCase();
		int cantVocales = 0;
		int cantConsonantes = 0;
		
        for (char letra : texto.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (esVocal(letra, vocales)) {
                    cantVocales++;
                } else {
                    cantConsonantes++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + cantVocales);
        System.out.println("Cantidad de consonantes: " + cantConsonantes);
        
        sc.close();
	}

}

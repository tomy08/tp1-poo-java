package ej1;

public class ej1 {
	
	public static boolean esPar(int num) {
		if (num%2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (esPar(i)) {
				System.out.println("Par");
				continue;
			}
			System.out.println(i);
		}

	}

}

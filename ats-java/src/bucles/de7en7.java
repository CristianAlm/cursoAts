package bucles;

/*
 * Escribir todos los numeros de 100 a 0 de 7 en 7
 * */

public class de7en7 {
	
	public static final int MAX = 100;
	public static final int MIN = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int indice = MAX;
		
		while (indice > MIN) {
			System.out.print(indice + "|");
			indice -= 7;
		}

	}

}

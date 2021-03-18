package bucles;

/*
 * Leer un numero y decir si es positivo y negativo, repetir el proceso hasta que se ingrese 0
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class positivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num; 
		
		num = pedirValor();
		
		while (num !=0) {
			if(num < 0){
				System.out.println("El numero es negativo");
			}else {
				System.out.println("El numero es positivo");
			}
			num = pedirValor();
		}

	}

	public static int pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}

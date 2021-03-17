package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir nota de 0 a 10 y mostrar si: Insuficente, suficiente, bien, notable, sobresaliente.
 * */

public class resultadoNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota = pedirValor();
		
		procesarNota(nota);

	}

	private static void procesarNota(float nota) {
		// TODO Auto-generated method stub
		if (nota > 9) {
			System.out.println("Sobresaliente");
		}else if (nota > 7) {
			System.out.println("Notable");
		}else if (nota > 5) {
			System.out.println("Bien");
		}else if (nota >= 4) {
			System.out.println("Suficiente");
		}else {
			System.out.println("Insuficiente");
		}
	}

	private static float pedirValor() {
		// TODO Auto-generated method stub
		float variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese la nota: ");
			variableLocal=Float.parseFloat(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}

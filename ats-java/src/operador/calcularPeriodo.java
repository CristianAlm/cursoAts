package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que, dado un numero total de horas,
 * devuelve el numero de semanas, dias, y horas equivalentes.
 * Ejemplo: dado un total de 1000 horas debe mostrar 5 semanas,
 * 6 dias y 16 horas.
 * */

public class calcularPeriodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horaSolicitada, semanas = 0, dias = 0, horas = 0;
		
		horaSolicitada = pedirValor();
		
		calculoPrograma(horaSolicitada, semanas, dias, horas);
		
	}
	private static void calculoPrograma(int horaSolicitada, int semanas,
			int dias, int horas) {
		// TODO Auto-generated method stub
		semanas = horaSolicitada/168;
		dias = horaSolicitada%168/24;
		horas = horaSolicitada%24;
		
		imprimirPrograma(semanas, dias, horas);
		 
		
	}
	private static void imprimirPrograma(int semanas, int dias, int horas) {
		// TODO Auto-generated method stub
		System.out.println("Las semanas son: " + semanas + " los dias son: " + dias + " y las horas son: " + horas);
		
	}
	private static int pedirValor() {
		// TODO Auto-generated method stub
		
		int valorLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			valorLocal = Integer.valueOf(entrada.readLine());
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		return valorLocal;
	}

}

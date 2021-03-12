package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Un trabajador quiere calcular su salario semanal
 * Si trabaja 40 horas o menos se las pagan a 16
 * Y si trabaja mas de 40 horas, las primeras 40 a 16 y las restantes a 20
 * 
 * */

public class salarioSemanal {
	
	public static final int HASTA = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horasTrabajadas, salarioS, normal = 16, extra = 20;
		
		horasTrabajadas = pedirValor();
		
		salarioS = calcularSalario(horasTrabajadas, normal, extra);
		
		System.out.println("El salario semanal es: " + salarioS);
		
		

	}

	private static int calcularSalario(int horasTrabajadas, int normal,
			int extra) {
		// TODO Auto-generated method stub
		int variableLocal = 0;
		 
		if (horasTrabajadas > HASTA ) {
			variableLocal = (horasTrabajadas - HASTA)*extra;
			variableLocal += (HASTA * normal);
			
		} else {
			variableLocal = horasTrabajadas * normal; 
		}
		
		return variableLocal;
	}

	private static int pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Introduzca la cantidad de horas trabajadas: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}

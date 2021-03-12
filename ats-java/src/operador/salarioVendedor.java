package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Una compañia de venta de autos usados, paga un salario mensual de 1000
 * mas 150 por auto vendido mas el 5% de la venta del auto vendido.
 * Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario nebsual de un vendedor dado.
 * */

public class salarioVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salarioBase = 1000, salarioMensual = 0, cantVendida;
		int auto1 = 5000, auto2 = 10000, auto3 = 15000;
		int canAuto1 = 0, canAuto2 = 0, canAuto3 = 0;
		String coche1 = "uno", coche2 = "dos", coche3 = "tres";
		
		cantVendida = cuantosAutos();
		
		if (cantVendida > 0) {
			canAuto1 = cuantasUnidades(coche1);
			canAuto2 = cuantasUnidades(coche2);
			canAuto3 = cuantasUnidades(coche3);
		}
		
		salarioMensual = determinarSalario(canAuto1, canAuto2, canAuto3, auto1, auto2, auto3, salarioMensual, salarioBase, cantVendida);
		
		System.out.println("El salario mensual es: "+ salarioMensual);
	}

	private static int determinarSalario(int canAuto1, int canAuto2,
			int canAuto3, int auto1, int auto2, int auto3, int salarioMensual,
			int salarioBase, int cantVendida) {
		// TODO Auto-generated method stub
		int salarioLocal = 0;
		
		if (canAuto1 > 0) {
			salarioLocal += (auto1)*0.05;
		}
		if (canAuto2 > 0) {
			salarioLocal += (auto2)*0.05;
		}
		if (canAuto3 > 0) {
			salarioLocal += (auto3)*0.05;
		}
		
		salarioLocal += salarioBase;
		
		salarioLocal += cantVendida*150;
		
		return salarioLocal;
	}

	private static int cuantasUnidades(String coche) {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			if (coche == "uno") {
				System.out.println("cuantos del auto 1: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			}else if (coche == "dos") {
				System.out.println("cuantos del auto 2: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			}
			else {
				System.out.println("cuantos del auto 3: ");
				variableLocal=Integer.valueOf(entrada.readLine());
			}
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

	private static int cuantosAutos() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Introduzca la cantidad de autos vendidos: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}

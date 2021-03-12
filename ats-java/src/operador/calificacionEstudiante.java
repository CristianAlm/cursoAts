package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * La calificacion de un estudiante de informatica se calcula en base a las calificaciones de cuatro aspectos
 * de su rendimiento academico: participaciones, primer examen, segundo examen y examen final.
 * Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderacion del 10%, 25%, 25% y 40%
 * Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.
 * */

public class calificacionEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float participacion = 0, priExa = 0, seExa = 0, exaFinal = 0, notaFinal = 0;
		
		notaFinal = pedirNotas(participacion, priExa, seExa, exaFinal,notaFinal);
		
		System.out.println("La nota final es: "+notaFinal);

	}

	private static float pedirNotas(float participacion, float priExa,
			float seExa, float exaFinal, float notaFinal) {
		// TODO Auto-generated method stub
		float notaLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				
		try {
			System.out.println("Ingrese la nota de participacion: ");
			participacion = Float.parseFloat(entrada.readLine());
			System.out.println("Ingrese la nota del primer examen: ");
			priExa = Float.parseFloat(entrada.readLine());
			System.out.println("Ingrese la nota del segundo examen: ");
			seExa = Float.parseFloat(entrada.readLine());
			System.out.println("Ingrese la nota del examen final: ");
			exaFinal= Float.parseFloat(entrada.readLine());
			
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		/*
		
		participacion *= 0.1f;
		priExa *= 0.25f;
		seExa *= 0.25f;
		exaFinal *= 0.4f;
		
		notaLocal = participacion + priExa + seExa + exaFinal;
		*/
		notaLocal = calcularNota(participacion, priExa, seExa, exaFinal);
		
		return notaLocal;
	}

	
	private static float calcularNota(float participacion, float priExa, float seExa, float exaFinal) {
		// TODO Auto-generated method stub
		
		float local;
		
		participacion *= 0.1f;
		priExa *= 0.25f;
		seExa *= 0.25f;
		exaFinal *= 0.4f;
		
		local = participacion + priExa + seExa + exaFinal;
		
		return local;
	}
}

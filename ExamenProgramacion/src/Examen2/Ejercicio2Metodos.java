package Examen2;

import java.util.Scanner;

public class Ejercicio2Metodos {
	public static int input(int a, int b) {
		/*Valida que un valor introducido por teclado este 
		 * comprendido en un tramo determinado.
		 * Valores limites incluidos.
		 * 
		 * @param: int a: valor inicial
		 * @param:int b: valor final
		 * @return:int input: Valor comprendido entre esos 2.
		 */
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

		input = s.nextInt();
		if (input < a || input > b) {
			System.out.println("valor no valido");

		}
		} while (input<a||input>b);
		return input;
	}
	
	
	public static void pregunta1 () {
		System.out.println("¿Cuándo inició los estudios del ciclo?");
	}
	
	
public static void pregunta2 () {
		System.out.println("¿Dedicas diariamente en tu casa más de 2 horas al ciclo?\n"
				+ "1.-Si.\n"
				+ "2.-No.\n");
	}
	
	
public static void pregunta3 () {
		System.out.println("¿Está trabajando?\n"
				+ "1.-Si.\n"
				+ "2.-No.\n");
	}
	
	
public static int reduccionMedia( int curso, int horas, int trabajo) {
		/*realiza el descuento necesario a la media del curso en funcion de
		 * las respuestas dadas.
		 * @param: int curso: lo que estudia el alumno
		 *  @param:int horas, int trabajo: las respuestas dadas.
		 * @return: int curso con los años descontados.
		 */
		if (horas==1) {
			curso-=2;
		}
		if (trabajo==1) {
			curso+=1;
		}
		return curso;
	}

	public static void resultado(int anio, int curso) {
		/*suma el curso al año de comienzo e imprime la respuesta indicada*/
		
		anio+=curso;
		
		if(anio<2023) {
			System.out.println("Acorde con los datos aportados, usted debería haber terminado en el año "+anio);
		} else {
			System.out.println("Acorde con los datos aportados, usted terminará el ciclo en el año "+anio);
		}
	}

	public static void preguntaFinal() {
		/*Preguntamos al usuario si desea continuar*/
		System.out.println("Quiere repetir de nuevo el test?\n"
				+ "1.-Si.\n"
				+ "2.-No.\n");
	}
}

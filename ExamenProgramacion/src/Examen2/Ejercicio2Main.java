package Examen2;

public class Ejercicio2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MEDIA = 6;
		int anio, horas, trabajo;//variables para las respuestas de las preguntas
		int input4 = 0;//variable para salir del programa
		int curso = MEDIA;//para calcular los años del curso
		
		do {//bucle del cuestionario
			
			Ejercicio2Metodos.pregunta1();//Realizamos la primera pregunta y pedimos el valor
			anio=Ejercicio2Metodos.input(2013, 2023);

			Ejercicio2Metodos.pregunta2();//Realizamos la segunda pregunta y pedimos el valor
			horas=Ejercicio2Metodos.input(1, 2);

			Ejercicio2Metodos.pregunta3();//Lo mismo con la 3
			trabajo=Ejercicio2Metodos.input(1, 2);

			curso=Ejercicio2Metodos.reduccionMedia(curso, horas, trabajo);//Aplicamos la reduccion necesaria a la media
			
			Ejercicio2Metodos.resultado(anio,curso);//aplicamos el curso y devolvemos el mensaje correcto
			
			Ejercicio2Metodos.preguntaFinal();//preguntamos si desea continuar
			input4=Ejercicio2Metodos.input(1, 2);
		}while(input4!=2);
	}
}

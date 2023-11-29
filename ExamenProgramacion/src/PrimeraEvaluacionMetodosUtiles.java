import java.util.Scanner;

public class PrimeraEvaluacionMetodosUtiles {
	public static int numeroMayorDe3(int a, int b, int c) {
		/*Devuelve el numero mayor de 3 introducidos.
		 * @param: int a, int b, int c: Los numeros a comparar.
		 * @return: int resultado: Numero mayor.
		 */
		int resultado;

		if (a== b && b == c && a==c) {//en caso de que los 3 num sean iguales
			System.out.println("Los numeros son iguales");
			resultado = 0;

		} else {
			if ( a >= b && a >= c) {
				resultado = a; 
			} else if ( b >= c && b >= a) {
				resultado = b;
			}else {
				resultado = c;
			}
		}
		return resultado;
}
	
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

	public static String concatenacion(String a, String b) {
		/*Concatena 2 strings.
		 * @param: String a, b: Strings a concatenar
		 * @return: String r: String concatenado
		 */
		String r = a + b;//Declaro la string que voy a devolver y digo que es la concatenacion de las 2 string metidas

		return r;//la devolvemos

	}

	public static int numAleatorio(int a, int b) {
		/*Int aleatorio comprendido en un rango, valores limites incluidos.
		 * @param: int a, int b: Valores limites.
		 * @return: int num: Valor a devolver.
		 */
		
		int num;

		num = (int)Math.floor(Math.random()*b)+a;
		return num;
	}

	public static Boolean fechaValida(int dia, int mes,int anio) {
		/*solicite al usuario un día, un mes, y un año,  e indique si dicha fecha es válida.
		*@param:int dia,mes,anio: fecha introducida
		*@return: boolean: fechaValida
		*/

		//banderas:
		boolean bisiesto = false, fechaValida = true;

		if (anio < 1 ) {//comprobamos valor año
			fechaValida = false;
		}
		if (anio % 4 == 0 || anio % 1000 == 0 && anio % 400 == 0) {
			bisiesto = true;
		}
		if (mes < 1 || mes > 12) {//comprobamos mes
			fechaValida = false;
		}

		if (mes == 2) {//comprobacion mes de febrero

			if (bisiesto) {
				if (dia < 1 || dia >29) {//comprobacion febrero bisiesto
					fechaValida = false;
				} 
			} else {
				if (dia < 1 || dia > 28) {
					fechaValida = false;
				}
			}
		} else if(mes ==1 || mes ==3|| mes == 6 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia <1 || dia >31) {
				fechaValida=false;
			}
		} else {
			if (dia <1 || dia >30) {
				fechaValida=false;
			}
		}

		return fechaValida;	
	}

	public static String piramideChunga(int f) {
		String piramide = "";
		int asterisco = f, bloque = 1;

		if (f >9) {
			asterisco+=(f-9);//si tenemos mas de 9 asteriscos
			//sumamos la diferencia a los asteriscos
		}
		
		//loop total
		for (int i = f; i> 0 ; i --) {
if (bloque > 9) {//una vez empecemos con las decimas, restamos el asterisco sobrante del loop
	asterisco -=1;
}
			//pintamos la primera parte asterisco
			for(int u = asterisco; u > 0 ; u--) {
				piramide += "*";
			}
			//pintamos primera parte bloque
			for (int u = 1; u < bloque ; u++) {
				if ( u == 1 && bloque >9) {//como en las decimas los numeros se vuelven impares y los asteriscos quedan pares, agregamos un 0 para igualar el rectangulo
					piramide+=0;
				}
				piramide += u;
			}
			//pintamos segunda parte bloque
			for (int u = bloque; u > 0 ; u--) {
				piramide += u;
			}
			//pintamos segunda parte asterisco
			for(int u = asterisco; u > 0 ; u--) {
				piramide += "*";
			}
			//modificamos los contadores
			bloque++;
			asterisco--;
			//agregamos un salto de linea
			piramide += "\n";
		}
		
		//agregamos el ultimo nivel

		if (f >9) {//Si estamos en decimas, agregamos la diferencia en asteriscos
			for (int i = (((f+(f-9))*2)+1) ; i > 0; i--) {
				piramide += "*";
			}
		}else {
			for (int i = ((f*2)+1) ; i > 0; i--) {
				piramide += "*";
			}
		}
		return piramide;
	}
}
import java.util.Scanner;
public class Examen1 {


	public static void main(String[] args) {
		System.out.println("La prima total del vendedor es de "+Pregunta1()+"$");
		System.out.println(Pregunta2());
	}
	public static double Pregunta1(){
		/*Implemente un programa que calcule las primas para un grupo de vendedores basado en el numero de ventas realizadas y el pais en el que operan. 
		El programa debe solicitar al usuario ingresar el numero de ventas y el pais donde trabaja.*/
		
		//escaners:
			 Scanner sInt = new Scanner(System.in);
			 Scanner sString = new Scanner (System.in);
			 
		//input:
			 int ventas = 0;
			 String pais = "";
		
		//output:
			 double primaTotal = 0;
			 
		//Parametros:
			 int  PRECIO = 5;
			 boolean paisValido = true;//Bandera para el bucle que comprueba el valor "pais"
			 
			do {//con este do-while nos aseguramos que ventas sea un valor positivo
				
	System.out.println("Por favor, ingresa el número de ventas del vendedor:");//pedimos parametro ventas
	ventas = sInt.nextInt();
	
		if (ventas <= 0) {//comprobamos que ventas sea valido
			System.out.println("Valor \"numero de ventas\" no valido.");
		}
		} while(ventas<=0);
			
			
	
	do {
		System.out.println("Por favor, ingresa el país (EEUU/Canadá/México):");//pedimos parametro pais
		pais = sString.next();
	
	switch (pais) {
	case "EEUU":
		if ( ventas <= 5) {
			primaTotal = ventas * 2;
			paisValido=true;//este boolean reestablece la bandera en caso de que se encuentre en "falso"
		} else {
			primaTotal = ventas  * 3;
			paisValido=true;
		}
		break;
	
	case "Canadá":
		if ( ventas <= 5) {
			primaTotal =(ventas * PRECIO)*0.05;
			paisValido=true;
		} else {
			primaTotal =(ventas * PRECIO)*0.06;
			paisValido=true;
		}
		break;
		
	case "México":
		if (ventas <= 5) {
			primaTotal =(ventas * PRECIO)*0.07;
			paisValido=true;
			
		} else {
			primaTotal =(ventas * PRECIO)*0.08;
			paisValido=true;
		}
		break;
		
		default:
			System.out.println("Valor \"pais\" no valido");		
		paisValido= false;//caso equivocado
			break;
		
			}
	} while (!paisValido);//bucle para el caso equivocado
		
	return primaTotal;//devolvemos la prima total al metodo main
	}

	public static String Pregunta2(){
		Scanner s = new Scanner ( System.in);
		
		int n1, n2;//declaramos los parametros
		String resultado= "Resultado: ";
		
		do {
		System.out.println("Introduzca el primer numero:");//los pedimos
		n1 = s.nextInt();
		
		System.out.println("Introduzca el segundo numero:");
		n2 = s.nextInt();
		
		if(n1>n2) {
			System.out.println("Valores introducidos no validos");
		}
		} while (n1>n2 || n1==n2);//bucle hasta que tengamos valores validos
		
		for (int  i = n2; i >= n1; i--) {//bucle en el que concatenamos los numeros
			if (i % 5 == 0) {
				resultado += "AA ";
			} else {
				resultado += i+" ";
			}
			
		}
		return resultado;//devolvemos el string resultante al metodo main
		}
}

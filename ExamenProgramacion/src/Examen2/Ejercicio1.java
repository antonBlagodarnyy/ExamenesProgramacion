package Examen2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printLetterH(5);
System.out.println();
printLetterH(6);
System.out.println();
printLetterH(7);
System.out.println();
printLetterH(8);
System.out.println();
printLetterH(9);
	}
	public static void printLetterH(int tamanio) {
		if(tamanio<5 || tamanio > 9) { // en caso de valor no valido
			System.out.println("Valor no valido");
		} else {
			
			
			if (tamanio == 5) {//en caso de que sea 5
				for (int i = 1; i<= tamanio; i++) {//recorre altura
					
					if(i==(tamanio/2)+1) {
						/*creo que usando math.floor o math.round correctamente se puede redondear
						hacia arriba para pintar la linea en el numero correcto, sin embargo esta solucion tambien cumple
						con el enunciado.*/
						for (int u=1; u <= tamanio; u++) {
							System.out.print(i);
						}
						}else {
					for (int u=1; u <= tamanio; u++) {//recorre anchura
						
						if(u==1 ||u==tamanio) {//pinta o espacio blanco o numero
							System.out.print(i);
						}else {
						System.out.print(" ");
						}
					}
				}
					System.out.println("\n");
				}
			}
			else {//en caso de que no sea 5
				for (int i = 1; i<= tamanio; i++) {//recorre altura
					if(i==tamanio/2) {
						for (int u=1; u <= tamanio; u++) {//pinta linea horizontal
							System.out.print(i);
						}
						}else {
					for (int u=1; u <= tamanio; u++) {//recorre anchura
						
						if(u==1 ||u==tamanio) {//pinta o espacio blanco o numero
							System.out.print(i);
						}else {
						System.out.print(" ");
						}
					}
				}
					System.out.println("\n");
				}
			}
	}
	}
}

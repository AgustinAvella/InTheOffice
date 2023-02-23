package tareasEnLaOficina;

import java.util.Scanner;

public class TareaImprimirElementos {

	public static void main(String[] args) {
		int numero;
		int[] numeros;
		int mayor = 0;
		numeros = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 10 numeros:");
		for(int i=0; i<numeros.length; i++) {
		   numero=scanner.nextInt();
		   if(numero>mayor) {
			   mayor=numero;
		   }
		}
		System.out.println("El mayor es: "+mayor);

	}

}

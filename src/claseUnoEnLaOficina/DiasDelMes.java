package claseUnoEnLaOficina;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int anio= 0;
		System.out.println("Ingrese año: ");
		scanner.nextInt();
		
		
		int numeroMes = 0;
		System.out.println("Ingrese número de mes: ");
		scanner.nextInt();
		
		/// OR ||
		
		
		if (numeroMes == 11 || numeroMes == 4 || numeroMes == 6 || numeroMes == 9) {
			System.out.println("El mes tiene 30 dias!");
		} else if(numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes== 8 || numeroMes == 10 || numeroMes == 12 || numeroMes == 7) {
			System.out.println("El mes tiene 31 dias!");
		} else if(anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
			System.out.println("El mes tiene 29 dias!");
		} else {
			System.out.println("El mes tiene 28 dias!");
		}
		
		/// % 400 == 0
		/// O que sea divisible por 4 pero no por 100

	}

}

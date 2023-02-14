package tareasEnLaOficina;

import java.util.Scanner;

public class tareaSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa número de mes: ");
		int meses = scanner.nextInt();
		
		switch(meses) {
		case 1:
			System.out.println("Es enero");
			break;
		case 2:
			System.out.println("Es febrero");
			break;
		case 3:
			System.out.println("Es marzo");
		    break;
		case 4:
			System.out.println("Es abril");
			break;
		case 5:
			System.out.println("Es mayo");
			break;
		case 6:
			System.out.println("Es junio");
			break;
		case 7:
			System.out.println("Es julio");
			break;
		case 8:
			System.out.println("Es agosto");
		    break;
		case 9:
			System.out.println("Es septiembre");
			break;
		case 10:
			System.out.println("Es octubre");
			break;
		case 11:
			System.out.println("Es noviembre");
			break;
		case 12:
			System.out.println("Es diciembre");
			break;
		}
	}

}

package tareasEnLaOficina;

import javax.swing.JOptionPane;

public class MesesDelAnio {

	public static void main(String[] args) {
		int meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de mes: "));
		
		switch(meses) {
		case 1:
			System.out.println("Mes número 1 y nombre Enero");
			break;
		case 2:
			System.out.println("Mes número 2 y nombre Febrero");
			break;
		case 3:
			System.out.println("Mes número 3 y nombre Marzo");
		    break;
		case 4:
			System.out.println("Mes número 4 y nombre Abril");
			break;
		case 5:
			System.out.println("Mes número 5 y nombre Mayo");
			break;
		case 6:
			System.out.println("Mes número 6 y nombre Junio");
			break;
		case 7:
			System.out.println("Mes número 7 y nombre Julio");
			break;
		case 8:
			System.out.println("Mes número 8 y nombre Agosto");
		    break;
		case 9:
			System.out.println("Mes número 9 y nombre Septiembre");
			break;
		case 10:
			System.out.println("Mes número 10 y nombre Octubre");
			break;
		case 11:
			System.out.println("Mes número 11 y nombre Noviembre");
			break;
		case 12:
			System.out.println("Mes número 12 y nombre Diciembre");
			break;
		}
	}

}

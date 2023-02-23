package claseUnoEnLaOficina;

import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

	public static void main(String[] args) {
		
		double[] claseMatematicas, claseHistoria, claseLengua;
		double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLengua = 0;
		claseMatematicas = new double [7];
		claseHistoria = new double[7];
		claseLengua = new double [7];
		
		//Instancia de Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese 7 notas de estudiantes para matematicas:");
		for(int i=0; i < claseMatematicas.length; i++) {
			claseMatematicas[i]= scanner.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas de estudiantes para historia:");
		for(int i=0; i < claseHistoria.length; i++) {
			claseHistoria[i]= scanner.nextDouble();
		}

		System.out.println("Ingrese 7 notas de estudiantes para lengua:");
		for(int i=0; i < claseLengua.length; i++) {
			claseLengua[i]= scanner.nextDouble();
		}
		
		for(int i= 0; i<7; i++) {
			sumNotasMatematicas += claseMatematicas[i];
			sumNotasHistoria += claseHistoria[i];
			sumNotasLengua += claseLengua[i];
		}
		double promedioMatematicas = (sumNotasMatematicas/claseMatematicas.length);
		double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
		double promedioLengua = (sumNotasLengua/claseLengua.length);
		System.out.println("Promedio clase Matematicas: "+ promedioMatematicas);
		System.out.println("Promedio clase Historia: "+ promedioHistoria);
		System.out.println("Promedio clase Lengua: "+promedioLengua);
		System.out.println("Promedio total del curso: "+ (promedioMatematicas + promedioHistoria+ promedioLengua)/3);
		
		System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
		int id = scanner.nextInt();
		double promedioAlumno = (claseHistoria[id] + claseLengua[id]+ claseMatematicas[id])/3;
		System.out.println("Promedio alumno Nro "+id+":"+promedioAlumno);


	}

}

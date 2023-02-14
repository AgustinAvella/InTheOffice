package claseUnoEnLaOficina;

public class EstructuraDeControlELSEIF {

	public static void main(String[] args) {
		float promedio = 5.5f;
		
		if(promedio > 6) {
			System.out.println("Excelente promedio!");
		} else if(promedio > 5.5) {
			System.out.println("Promedio bueno!");
		} else if(promedio > 5.0) {
			System.out.println("Promedio ok!");
		} else {
			System.out.println("Promedio malo!");
		}

	}

}

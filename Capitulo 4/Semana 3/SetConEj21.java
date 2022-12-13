import java.util.Scanner;

/*
* Este programa dice cual es la primera cifra de un número hasta un valor de 5 cifras en total.
*
* MiguelBlanco
*/
public class SetConEj21 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double priNota;
		double segNota;
		String resultado;
		double media;
		double recNota;
		
		System.out.print("Nota del primer Examen: ");
		priNota = s.nextDouble();
		
		System.out.print("Nota del segundo Examen: ");
		segNota = s.nextDouble();
		
		media = ( priNota + segNota ) / 2;
		
		
		if ( media >= 5 ){
			System.out.printf("La nota de su control es de: %.1f \n",media);
			System.out.println(" Bien hecho ");
		} else {
			System.out.println("¿Cual ha sido la nota de tu examen de recuperación?: ");
			recNota = s.nextInt();
		if ( recNota >= 5 ){
			resultado = "Apto";
		} else {
			resultado = "No apto";
		}
		if ( resultado.equals("Apto") ){
			System.out.println("Tu nota de programación es: 5");
			}
		if ( resultado.equals("No apto") ){
		System.out.printf("La nota de su control es de: %.1f \n",media);
		}
	}
}
}	
	

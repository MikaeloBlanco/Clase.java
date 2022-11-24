import java.util.Scanner;

/*
* Este programa te dice el horoscopo de tu nacimiento.
*
* MiguelBlanco
*/
public class SetConEj10 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int dia;
		int mes;
		
		System.out.print("Introduce tu més de nacimiento(En numérico): ");
		mes = s.nextInt();
		System.out.print("Introduce tu día de nacimiento: ");
		dia = s.nextInt();
		
		if ( mes == 1 ){
			if ( dia >= 21 && dia <= 31 ){
				System.out.println("Usted es Acuario");
			}
			if ( dia <= 20 && dia >= 1) {
				System.out.println("Usted es Capricornio");
			}
		}
		if ( mes == 2 ){
			if ( dia >= 20 && dia <= 28 || dia  == 29 ){
				System.out.println("Usted es Piscis");
			} 
			if ( dia <= 19 && dia >= 1) {
				System.out.println("Usted es Acuario");
			}
		}
		if ( mes == 3 ){
			if ( dia >= 21 && dia <= 31 ){
				System.out.println("Usted es Aries");
			}
			if ( dia <= 20 && dia >= 1) {
				System.out.println("Usted es Piscis");
			}
		}
		if ( mes == 4 ){
			if ( dia >= 21 && dia <= 30 ){
				System.out.println("Usted es Tauro");
			}
			if ( dia <= 20 && dia >= 1) {
				System.out.println("Usted es Aries");
			}
		}
		if ( mes == 5 ){
			if ( dia >= 21 && dia <= 31 ){
				System.out.println("Usted es Géminis");
			}
		}
			if ( dia <= 20 && dia >= 1) {
				System.out.println("Usted es Tauro");
			}
		if ( mes == 6 ){
			if ( dia >= 22 && dia <= 30 ){
				System.out.println("Usted es Cáncer");
			}
			if ( dia <= 21 && dia >= 1) {
				System.out.println("Usted es Géminis");
			}
		}
		if ( mes == 7 ){
			if ( dia >= 22 && dia <= 31 ){
				System.out.println("Usted es Leo");
			}
			if ( dia <= 21 && dia >= 1) {
				System.out.println("Usted es Cáncer");
			}
		}
		if ( mes == 8 ){
			if ( dia >= 23 && dia <= 31 ){
				System.out.println("Usted es Virgo");
			}
			if ( dia <= 22 && dia >= 1) {
				System.out.println("Usted es Leo");
			}
		}
		if ( mes == 9 ){
			if ( dia >= 23 && dia <= 31 ){
				System.out.println("Usted es Libra");
			}
			if ( dia <= 22 && dia >= 1) {
				System.out.println("Usted es Virgo");
			}
		}
		if ( mes == 10 ){
			if ( dia >= 23 && dia <= 31 ){
				System.out.println("Usted es Escorpio");
			}
			if ( dia <= 22 && dia >= 1) {
				System.out.println("Usted es Libra");
			}
		}
		if ( mes == 11 ){
			if ( dia >= 23 && dia <= 31 ){
				System.out.println("Usted es Sagitario");
			}
			if ( dia <= 22 && dia >= 1) {
				System.out.println("Usted es Escorpio");
			}
		}
		if ( mes == 12 ){
			if ( dia >= 22 && dia <= 31 ){
				System.out.println("Usted es Capricornio");
			}
			if ( dia <= 21 && dia >= 1) {
				System.out.println("Usted es Acuario");
			}
		}
}
}


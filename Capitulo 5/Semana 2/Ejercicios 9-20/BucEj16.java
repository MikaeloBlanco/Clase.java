import java.util.Scanner;

/*
*
*Este programa trata de calcular un número primo
*
*Miguel Blanco Fernandez
*
*/
public class BucEj16 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int aux2;
		int aux3;
		int aux5;
		int aux7;
		int num;
		int cont;
		num = 1;
		cont = 0;
		
		while ( num > 0 ){
			System.out.print("Introduce un número(menos el 2, 3, 5, y 7): ");
			num = s.nextInt();
		
			aux = num % 1;
			aux2 = num % 2;
			aux3 = num % 3;
			aux5 = num % 5;
			aux7 = num % 7;
		
			if ( aux == 0 && ( aux2 == 0 || aux3 == 0 || aux5 == 0 || aux7 == 0 ) ){
				cont++;
				System.out.println("No es un número primo");
			} else {
				System.out.println("Es un número primo");
		}
	}
}
}		

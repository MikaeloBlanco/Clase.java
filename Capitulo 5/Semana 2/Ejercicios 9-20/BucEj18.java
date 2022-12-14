import java.util.Scanner;

/*
*
*Este programa trata de calcular un rango de unidades de 7 en 7
*
*Miguel Blanco Fernandez
*
*/
public class BucEj18 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int rango;
		int rango2;
		
		System.out.print("Introduce un número: ");
		rango = s.nextInt();
		System.out.print("introduce otro número: ");
		rango2 = s.nextInt();
		
		if ( rango > rango2 && !( rango == rango2 ) ){
			while ( rango > rango2 ){
		
				System.out.print(rango2 + ", ");
				rango2 = rango2 + 7;
		
			}
		}
		if ( rango2 > rango && !( rango == rango2 ) ){
			while ( rango2 > rango ){
		
				System.out.print(rango + ", ");
				rango = rango + 7;
		
			}
		}
	}
}

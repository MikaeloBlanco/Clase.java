import java.util.Scanner;

/*
*
*Este programa trata de calcular de 10 números enteres cual es positivo y cual negativo
*
*Miguel Blanco Fernandez
*
*/
public class BucEj13 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int num;
		int sum;
		int auxNeg;
		int cont;
		aux = 0;
		auxNeg = 0;
		
		
		cont = 10;
		
		while( cont >= 1){
			
			System.out.print("Introduzca un número: ");
			num = s.nextInt();
			
			if ( num >= 0 ){
			
				aux++;
			
			} else {
				
				auxNeg++;
			
			}
			
			cont--;
		}
		System.out.println("El total de números positivos es de: " + aux);
		System.out.println("El total de números negativos es de: " + auxNeg);
	}
}		

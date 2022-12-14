import java.util.Scanner;

/*
*
*Este programa trata de calcular una suma de 100 números consecutivos
*
*Miguel Blanco Fernandez
*
*/
public class BucEj17 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int num;
		int cont;
		cont = 0;
		
		System.out.print("Introduce un número: ");
		num = s.nextInt();
		
		aux = num;
		
		while ( num < 0 ){
		
		System.out.print("Por favor escriba un número positivo: ");
		num = s.nextInt();
		
		}
		
		while ( cont <= 100 ){
		
		aux++;
		num = aux + num;
		cont++;
		
		}
		System.out.println("El total de la suma consecutiva de los 100 números a partir del introducido es de: " + num );
		}
	}	

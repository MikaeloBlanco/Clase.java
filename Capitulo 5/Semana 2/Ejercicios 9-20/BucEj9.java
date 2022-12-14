import java.util.Scanner;

/*
*
*Este programa trata de calcular los digitos de un número por teclado
*
*Miguel Blanco Fernandez
*
*/
public class BucEj9 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int cont;
		long num;

		
		System.out.print("Introduzca el número que desee analizar: ");
		num = s.nextLong();
		
		cont = 0;
		
		while ( num > 0){
			
			num = num/10;
			cont++;
			
		}
		System.out.println("El número introducido tiene un total de " + cont + " dígitos");
		}
	}

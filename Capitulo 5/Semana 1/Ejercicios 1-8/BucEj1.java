import java.util.Scanner;

/*
*
*Este programa muestra por pantalla los múltiplos de 5 del 0 al 100
*
*Miguel Blanco Fernandez
*
*/
public class BucEj1{
	public static void main(String[] args){
		
		int b;
		int mult;
		b = 5;
		mult = 0;
		
		for( int a = 1; a <= 20; a++){
			
			System.out.println(mult);
			
			mult = b * a;
			
		}
		System.out.println(mult);
	}
}

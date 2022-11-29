import java.util.Scanner;

/*
*
*Este programa muestra por pantalla los múltiplos de 5 del 0 al 100
*
*Miguel Blanco Fernandez
*
*/
public class BucEj2{
	public static void main(String[] args){
		
		int b;
		int mult;
		int a;
		a = 1;
		b = 5;
		mult = 0;
		
		while(a <= 20){
			
			System.out.println(mult);
			
			mult = b * a;
			a++;
			
		}
		System.out.println(mult);
	}
}

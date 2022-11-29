import java.util.Scanner;

/*
*
*Este programa muestra por pantalla los numeros del 320 al 160 en intevalos de 20.
*
*Miguel Blanco Fernandez
*
*/
public class BucEj5 {
	public static void main(String[] args){

		int a;
		a = 320;
		
		while( a >= 160){
			
			System.out.println(a);
			a = a - 20;
			
		}
	}
}

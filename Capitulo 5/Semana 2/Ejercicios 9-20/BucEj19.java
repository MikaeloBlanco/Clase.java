import java.util.Scanner;

/*
*
*Este programa trata de crear una piramide con simbolos a la que tu determines la altura pero hueca e invertí sin querer el orden de los ejercicios.
*
*Miguel Blanco Fernandez
*
*/
public class BucEj19 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x;
		int cont;
		int redund;
		String blank;
		String simbol;
		int repSimbol;
		int repBlanck;
		cont = 1;
		
		simbol = "";
		blank = " ";
		
		System.out.print("Introduce la altura que desea de la piramide: ");
		x = s.nextInt();
		System.out.print("Introduce el simbolo que desee introducir como pintura de su piramide: ");
		simbol = s.next();
		
		repBlanck = x;
		redund = 0;
		repSimbol = 1;
		
		while ( cont < x )
		{
			
			while ( repBlanck >= cont )
			{
				System.out.print(blank);
				repBlanck--;
			}
			
			System.out.print(simbol);
			
			while ( repSimbol < redund )
			{
				System.out.print(blank);
				repSimbol++;
			}
			
			if ( cont > 1 ){
			
				System.out.print(simbol);
			
			}
			
			System.out.println("");
			redund = redund + 2;
			repSimbol = 1;
			repBlanck = x;
			cont++;
		}
		System.out.print(" ");
		while ( repSimbol <= redund )
			{
				System.out.print(simbol);
				repSimbol++;
			}
		System.out.print(simbol);
	}	
}

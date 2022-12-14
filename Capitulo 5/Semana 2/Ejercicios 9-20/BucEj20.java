import java.util.Scanner;

/*
*
*Este programa trata de crear una piramide con simbolos a la que tu determines la altura.
*
*Miguel Blanco Fernandez
*
*/
public class BucEj20 {
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
		redund = 1;
		repSimbol = 1;
		
		while ( cont <= x )
		{
			
			while ( repBlanck > cont )
			{
				System.out.print(blank);
				repBlanck--;
			}
			while ( repSimbol <= redund )
			{
				System.out.print(simbol);
				repSimbol++;
			}
			System.out.println("");
			redund = redund + 2;
			repSimbol = 1;
			repBlanck = x;
			cont++;
		}
	}	
}

import java.util.Scanner;

/*
*
*Este programa trata de calcular la media a traves de numeros introducidos por teclado en un bucle
*
*Miguel Blanco Fernandez
*
*/
public class BucEj10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		double primNot;
		double nextNot;
		double med;
		double medTot;
		
		System.out.print("Introduce tu primera nota: ");
		primNot = s.nextDouble();
		System.out.print("Introduce la siguiente nota: ");
		nextNot = s.nextDouble();
		
		aux = 2;
		med = ( primNot + nextNot );
		medTot = med / aux;
		
		while (nextNot > 0){
		
			System.out.printf("%.2f \n",medTot);
			System.out.print("Introduce otra nota (Para salir introduce un número negativo): ");
			nextNot = s.nextDouble();
			aux++;
			med = ( med + nextNot);
			medTot = med / aux;
		
		}
	}
}
		
		

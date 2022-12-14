import java.util.Scanner;

/*
*
*Este programa trata de calcular una potencia
*
*Miguel Blanco Fernandez
*
*/
public class BucEj14 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int aux2;
		int num;
		int cont;
		
		System.out.print("Introduce la base de tu número: ");
		num = s.nextInt();
		System.out.print("Introduce su exponente: ");
		aux = s.nextInt();
		
		cont = 1;
		aux2 = num;
		
		while( cont < aux ){
		
			num = num * aux2;
			cont++;
		
		}
	System.out.println("La potencia de su número es de: " + num);
		}
	}

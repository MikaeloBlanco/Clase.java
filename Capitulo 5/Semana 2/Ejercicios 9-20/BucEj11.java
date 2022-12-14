import java.util.Scanner;

/*
*
*Este programa trata de calcular el cuadrado y el cubo de 5 números siendo el primero introducido por teclado;
*
*Miguel Blanco Fernandez
*
*/
public class BucEj11 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int num;
		int cont;
		cont = 0;
		aux = 0;
		
		System.out.print("Introduce un número por teclado: ");
		num = s.nextInt();
		
		cont = num;
		aux = num + 5;
		
		while( cont < aux ){
		
			System.out.print(cont + "	");
			num = num * cont;
			System.out.print(num + "	");
			num = num * cont;
			System.out.println(num);
			System.out.println("__________________________");
			cont++;
			num = cont;
		}
	}
}

import java.util.Scanner;

/*
*
*Este programa trata de calcular La sucesion de Fibonacci
*
*Miguel Blanco Fernandez
*
*/
public class BucEj12 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aux;
		int num;
		int sum;
		int fibonacci;
		int cont;
		cont = 1;
		aux = 1;
		num = 0;
		sum = 0;
		
		System.out.print("Introduce las veces que quieras que se repita la sucesión de Fibonacci: ");
		fibonacci = s.nextInt();
		
		System.out.print(sum + ", ");
		sum = num + aux;
		
		while( cont < fibonacci ){
			System.out.print(sum + ", ");
			sum = num + aux;
			num = aux;
			aux = sum;
			cont++;
		}
}
}

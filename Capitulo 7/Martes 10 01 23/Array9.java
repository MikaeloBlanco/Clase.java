import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array9{
	public static void main(String[] args){
		
		int tam;
		tam = 8;
		Scanner s = new Scanner(System.in);
		int[] num = new int[tam];

		System.out.print("Introduce 8 números por teclado: ");
		
		for(int i = 0; i < tam; i++){
		
			num[i] = s.nextInt();
		
		}
		
		System.out.print("");//Espacios para la mejor visualización del programa
		System.out.print("");
		
		for(int i = 0; i < tam; i++){
		
			if(num[i] % 2 == 0){
			
				System.out.print(num[i] + " par ");
			
			} else {
				
				System.out.print(num[i] + " impar ");
		
		}
}
}
}

import java.util.Scanner;

/*
*
*Este programa trata de verificar el control de acceso de una caja fuerte.
*
*Miguel Blanco Fernandez
*
*/
public class BucEj8 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int cont;
		int num;
		int mult;
		int salida;
		
		System.out.print("Introduce un número para crear su tabla de multiplicación: ");
		num = s.nextInt();
		
		cont = 0;
		salida = 1;
		while( !( salida == 0) 
		){
			do{	
				
				mult = num * cont;
				System.out.println(mult);
				
				cont++;
			}while(cont < 11);
		System.out.println("-----------");
		System.out.print("Introduce un nuevo número que desee crear una tabla de( Introduzca 0 para salir ): ");
		salida = s.nextInt();
		num = salida;
		cont = 0;
		}
	}
}
			
			

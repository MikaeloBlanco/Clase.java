import java.util.Scanner;

/*
*
*Este programa trata de hacer un array que haga tres funciones;
*
*Miguel Blanco Fernandez
*
*/
public class Array2{
	public static void main(String[] args){
	
		int aux; //sirve para preguntar una posición del array
		Scanner s = new Scanner(System.in);
		char[] simbolo = new char[10];//Array de caracteres
		
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
		
		for(int i = 0; i < 10; i++){
		
			System.out.println(simbolo[i]);
		
		}
	}
}		

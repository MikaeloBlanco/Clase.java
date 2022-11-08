public class PruebaCodigo3{//Hora de introducir y operar numeros desde un String. MiguelBlanco//
	public static void main (String[] args){
		String linea;
		
		System.out.print("Por favor, introduce un número x ");//Muestra por pantalla la linea de texto Por favor, introduce un numero x//
		linea = System.console().readLine();//Introduce el texto al String linea//
		int priNum;//Declaro la variable de numero entero priNum//
		priNum = Integer.parseInt(linea);//Transforma el String linea en un número entero//
		
		System.out.print("Por favor, introduzca un numero y ");//Muestra por pantalla otra linea de texto similar a la primera//
		linea = System.console().readLine();//Introduce el texto al String linea//
		int segNum;//Declaro la variable numerica entera segNum//
		segNum = Integer.parseInt(linea);//Transforma el String linea en un número entero//
		
		int total;//declaro la variable numerica entera total//
		total = ( 2 * priNum ) + segNum;//coloco el valor que deseo que tenga la variable total//
		
		System.out.print("El primer número introducido es " + priNum);//Muestra por pantalla la variable priNum con un texto introductorio//
		System.out.println(" y el segundo es " + segNum );//Muestra por pantalla la segunda variable//
		System.out.print("El doble del primer número más el segundo es ");//En este caso esta mostrando el texto por pantalla sin ninguna variable aplicada//
		System.out.print(total);//La linea se une con la siguiente, uniendo el valor total con el respectivo texto de arriba.//
	} 
}

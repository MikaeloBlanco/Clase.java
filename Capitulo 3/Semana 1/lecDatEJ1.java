public class lecDatEJ1{//Multiplicación de dos numeros introducidos. MiguelBlanco//
	public static void main (String[] args){
		String linea;
		
		System.out.print("Por favor, introduce un número x ");
		linea = System.console().readLine();
		double priNum;
		priNum = Double.parseDouble(linea);
		
		System.out.print("Por favor, introduzca un numero y ");
		linea = System.console().readLine();
		double segNum;
		segNum = Double.parseDouble(linea);
		
		double total;
		total = priNum * segNum;
		
		System.out.print("La multiplicación resultante de los dos numeros es de " + total);
	} 
}

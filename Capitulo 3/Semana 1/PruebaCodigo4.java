//Hora de introducir y operar numeros desde un String pero con decimales. MiguelBlanco//
public class PruebaCodigo4{
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
	total = ( 2 * priNum ) + segNum;
		
	System.out.print("El primer número introducido es " + priNum);
	System.out.println(" y el segundo es " + segNum );
	System.out.print("El doble del primer número más el segundo es ");
	System.out.print(total);
  } 
}

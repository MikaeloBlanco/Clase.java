/*Este programa es de trnasformar Pesetas a euros.
*
* 
* Miguel Blanco Fernandez
*/
public class lecDatEJ3{
	public static void main (String[] args){
		String linea;
		
		double euro;
		euro = 0.006 ;
		
		System.out.print("Por favor, introduce un número de pesetas que desee convertir ");
		linea = System.console().readLine();
		int peseta ;
		peseta = Integer.parseInt(linea);
		
		double total;
		total = euro * (double)peseta;
		
		System.out.printf("La cantidad de pesetas que obtiene de las pesetas introducidas es de %.2f Euros",total);
  } 
}

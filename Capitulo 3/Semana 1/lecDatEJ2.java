public class lecDatEJ2{//Calculadora de euros a pesetas. MiguelBlanco//
  public static void main (String[] args){
	String linea;
		
	double peseta;
	peseta = 166.386;
		
	System.out.print("Por favor, introduce un número de euros que desee convertir ");
	linea = System.console().readLine();
	double euro ;
	euro = Double.parseDouble(linea);
		
	double total;
	total = euro * peseta;
		
	System.out.print("La cantidad de pesetas que obtiene de los euros introducidos es de " + total);
  } 
}

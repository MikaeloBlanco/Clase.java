//Calculadora de euros a pesetas. MiguelBlanco//
public class lecDatEJ2{
  public static void main (String[] args){
	String linea;
		
	double peseta;
	peseta = 166.386;
		
	System.out.print("Por favor, introduce un número de euros que desee convertir ");
	linea = System.console().readLine();
	int euro ;
	euro = Integer.parseInt(linea);
		
	int total;
	total = euro * (int)peseta;
		
	System.out.print("La cantidad de pesetas que obtiene de los euros introducidos es de " + total);
  } 
}

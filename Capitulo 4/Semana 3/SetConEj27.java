import java.util.Scanner;

/*
*
*Este programa trata de calcular el precio de una tarta de un sabor
*
*
*MiguelBlanco
*/
public class SetConEj27{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String sabor;
		String chocolate;
		double preTart;
		String nata;
		String tarta;
		String nombre;
		double precNata;
		double precNom;
		double total;
		tarta = "";
		preTart = 0;
		precNata = 0;
		precNom = 0;
		
		System.out.print("Elija el sabor (manzana, fresa o chocolate): ");
		sabor = s.next();
		
		sabor = sabor.toLowerCase();
		
		switch(sabor){
			
			case "fresa":
				
				preTart = 16;
				tarta = "Tarta de fresa: ";
				break;
			
			case "manzana":
			
				preTart = 18;
				tarta = "Tarta de manzana: ";
				break;
			
			case "chocolate":
			
				System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
				chocolate = s.next();
					
					chocolate = chocolate.toLowerCase();
					
					switch(chocolate){
						
						case "negro":
							preTart = 14;
							tarta = "Tarta de chocolate negro: ";
							break;
						
						case "blanco":
							preTart = 15;
							tarta = "Tarta de chocolate blanco: ";
							break;
						
					}
		}
		System.out.print("¿Quiere nata? (si o no): ");
		nata = s.next();
		
		nata = nata.toLowerCase();
					
			switch(nata){
								
				case "si":
					precNata = 2.5;
					break;
				
				case "no":
					break;
					
					}
		System.out.print("¿Quiere ponerle un nombre? (si o no): ");
		nombre = s.next();						
		
				
		nombre = nombre.toLowerCase();
					
			switch(nombre){
								
				case "si":
					precNom = 2.75;
					break;
				
				case "no":
					break;
				}
			
		
		System.out.print(tarta);
		System.out.printf("%.2f euros \n",preTart);
		if ( nata.equals("si")){
			System.out.print("Con nata: ");
			System.out.printf("%.2f euros \n",precNata);
		}
		if ( nombre.equals("si")){
			System.out.print("Con nombre: ");
			System.out.printf("%.2f euros \n",precNom);
		}
		total = precNom + preTart + precNata;
		System.out.print("Total: ");
		System.out.printf("%.2f euros \n",total);
		}
	}

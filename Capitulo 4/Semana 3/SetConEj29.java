import java.util.Scanner;

/*
*
*Este programa trata de calcular el precio de una tarta de un sabor
*
*
*MiguelBlanco
*/
public class SetConEj29{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String bebida;
		String comida;
		String nomComida;
		String nomBebida;
		double precCom;
		double precBeb;
		double total;
		nomComida = "";
		nomBebida = "";
		precCom = 0;
		precBeb = 0;
		
		System.out.print("¿Que ha tomado de comer? ( palmera, donut o pitufo ): ");
		comida = s.next();
		
		comida = comida.toLowerCase();
		
		switch(comida){
		
			case "palmera":
				precCom = 1.4;
				nomComida = "Palmera: ";
				break;
			
			case "donut":
				precCom = 1;
				nomComida = "Donut: ";
				break;
			
			case "pitufo":
				System.out.print("¿Con qué se ha tomado el pitufo? ( aceite o tortilla ): ");
				comida = s.next();
				
				switch(comida){
					
					case "aceite":
						precCom = 1.2;
						nomComida = "Pitufo con aceite: ";
						break;
					
					case "tortilla":
						precCom = 1.6;
						nomComida = "Pitufo con tortilla: ";
						break;
					
					}
			}
		System.out.print("¿Que ha tomado de beber? ( zumo o café ): ");
		bebida = s.next();
		
		bebida = bebida.toLowerCase();
		
		switch(bebida) {
			
			case "zumo":
				precBeb = 1.5;
				nomBebida = "Zumo: ";
				break;

			case "cafe":
				precBeb = 1.2;
				nomBebida = "Café: ";
				break;
				
			}
		System.out.print(nomComida);
		System.out.printf("%.2f \n",precCom);
		System.out.print(nomBebida);
		System.out.printf("%.2f \n",precBeb);
		System.out.print("Total desayuno: ");
		total = precCom + precBeb;
		System.out.printf("%.2f \n",total);
		}
	}

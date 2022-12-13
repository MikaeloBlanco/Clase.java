import java.util.Scanner;

/*
* Este programa calcula la nómina de un empleado.
*
* MiguelBlanco
*/
public class SetConEj26 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int entrada;
		double precEntrad;
		String tarjeta;
		double precEntradPar;
		int entradPar;
		double total;
		String dia;
		double descuento;
		String entText;
		String entTextPar;
		double pago;
		int aux;
		tarjeta = "";
		dia = "";
		precEntradPar = 0;
		entradPar = 0;
		entTextPar = " ";
		descuento = 0;
		entText = "Entradas Individuales:			";
		
		System.out.println("Venta de entradas CineCampa");
		System.out.print("Número de entradas: ");
		entrada = s.nextInt();
		System.out.print("Dia de la semana: ");
		dia = s.next();
		
		System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
		tarjeta = s.next();
		
		dia = dia.toLowerCase();
		tarjeta = tarjeta.toLowerCase();
		
		
		switch(dia){
			
			case "miercoles":
				precEntrad = 5;
				break;
			case "jueves":
				precEntrad = 8;
				precEntradPar = 11;
				aux = ( entrada/2 );
				entradPar = entrada % 2;
				entrada = entradPar;
				entradPar = aux;
				entTextPar = "Entradas Parejas:			";
				break;
				
			default:
				precEntrad = 8;
				break;
			
			}
		
		total = precEntrad * (double)entrada + precEntradPar * (double)entradPar;
		
		switch(tarjeta){
			
			case "s":
				descuento = ( total * 10 )/100;
				break;
			
			case "n":
				descuento = 0;
				break;
				
	  }
	  switch(dia){
			case "jueves":
				System.out.println("Aquí estan sus entradas. Gracias por la compra.");
				System.out.print(entTextPar);
				System.out.println(entradPar);
				System.out.print("Precio por entrada de pareja:			");
				System.out.printf("%.2f euros \n",precEntradPar);
				if ( entrada == 1 ){
					System.out.print(entText);
					System.out.println(entrada);
					System.out.print("Precio por entrada individual:			");
					System.out.printf("%.2f euros \n",precEntrad);
				}
				System.out.print("Total:			");
				System.out.printf("%.2f euros \n",total);
				if ( !( descuento == 0 ) ){
					System.out.print("Descuento:			");
					System.out.printf("%.2f \n",descuento);
				}
				pago = total - descuento;
				System.out.print("A pagar:			");
				System.out.printf("%.2f \n",pago);
				break;
					
			case "miercoles":
					System.out.println("Aquí estan sus entradas. Gracias por la compra.");
					System.out.print(entText);
					System.out.println(entrada);
					System.out.print("Precio por entrada individual:			");
					System.out.printf("%.2f euros \n",precEntrad);
					System.out.print("Total:			");
					System.out.printf("%.2f euros \n",total);
					if ( !( descuento == 0 ) ){
						System.out.print("Descuento:			");
						System.out.printf("%.2f \n",descuento);
				}
				pago = total - descuento;
				System.out.print("A pagar:			");
				System.out.printf("%.2f \n",pago);
				break;
				
			default:
					System.out.println("Aquí estan sus entradas. Gracias por la compra.");
					System.out.print(entText);
					System.out.println(entrada);
					System.out.print("Precio por entrada individual:			");
					System.out.printf("%.2f euros \n",precEntrad);
					System.out.print("Total:			");
					System.out.printf("%.2f euros \n",total);
					if ( !( descuento == 0 ) ){
						System.out.print("Descuento:			");
						System.out.printf("%.2f \n",descuento);
				}
					pago = total - descuento;
					System.out.print("A pagar:			");
					System.out.printf("%.2f \n",pago);
					break;
				}
}
}


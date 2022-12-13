import java.util.Scanner;

/*
* Este programa calcula el precio final de un producto.
*
* MiguelBlanco
*/
public class SetConEj23 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		double base;
		String iva;
		String codPro;
		
		System.out.print("Introduzca la base imponible: ");
		base = s.nextInt();
		System.out.print("Introduzca el tipo de IVA ( general, reducido o superreducido ): ");
		iva = s.next();
		System.out.print("Introduza el código promocional ( nopro, mitad, meno5, 5porc ): ");
		codPro = s.next();
		
		iva = iva.toLowerCase();
		codPro = codPro.toLowerCase();
		double ivaPorc;
		double codProNum;
		double total;
		double precIva;
		
		ivaPorc = 0;
		codProNum = 0;
		precIva = 0;
		
		switch(iva){
		
			case "general":
				ivaPorc = ( base * 21 ) /100;
				precIva = ivaPorc + base;
				iva = "IVA(21%)	";
				break;
				
			case "reducido":
				ivaPorc = ( base * 10 ) /100;
				precIva = ivaPorc + base;
				iva = "IVA(10%)	";
				break;
			
			case "superreducido":
				ivaPorc = ( base * 4 ) /100;
				precIva = ivaPorc + base;
				iva = "IVA(4%)	";
				break;
				
			default:
				System.out.println("Error del sistema");
				System.exit(0);
			}
		switch(codPro){
			
			case "nopro":
				codPro = "Cód. promo. ( nopro ): ";
				break;
			
			case "mitad":
				codPro = "Cód. promo. ( mitad ): ";
				codProNum = -base /  2;
				break;
			
			case "meno5":
				codPro = "cód. promo. ( meno5 ): ";
				codProNum = -5;
				break;
			
			case "5porc":
				codPro = "Cód. promo. ( 5porc ): ";
				codProNum = -( base / 5 ) /100;
				break;
				
			default:
				System.out.println("Error del sistema");
				System.exit(0);
			}
			
			System.out.print("Base imponible	");
			System.out.printf("%.2f \n",base);
			System.out.print(iva			);
			System.out.printf("%.2f \n",ivaPorc);
			System.out.print("Precio con IVA	");
			System.out.printf("%.2f \n",precIva);
			System.out.print(codPro			);
			System.out.printf("%.2f \n",codProNum);
			
			total = precIva + codProNum;
			System.out.print("TOTAL			");
			System.out.printf("%.2f \n",total);
			
		}
	}
				
				

package misFunciones;

import java.util.Scanner;
/*
*
*Recopilación de diferentes Funciones geometricas.
*
*
*
*@author Miguel Blanco
*/

public class Geometria{
	static Scanner s = new Scanner(System.in);

	public static double perimetroRectangulo (double x, double h){
	
		double perim;
		
		perim = (x * 2) + (h * 2);
		
		return perim;
		
	}

	public static double areaRectangulo(double x, double h){
	
		double area;
		
		area = x * h;
		
		return area;
	
	}

	public static void piramide(int x, String simbol){
		int cont;
		int redund;
		String blank;
		int repSimbol;
		int repBlanck;
		cont = 1;
		
		blank = " ";
		
		repBlanck = x;
		redund = 1;
		repSimbol = 1;
		
		while ( cont <= x )
		{
			
			while ( repBlanck > cont )
			{
				System.out.print(blank);
				repBlanck--;
			}
			while ( repSimbol <= redund )
			{
				System.out.print(simbol);
				repSimbol++;
			}
			System.out.println("");
			redund = redund + 2;
			repSimbol = 1;
			repBlanck = x;
			cont++;
		}
	}	
	public static void menu(int x){
		do{
			double r;
			System.out.println("1.Circunsfernecia");
			System.out.println("2.Area");

			System.out.print("Introduce una opción(Para salir use 0): ");
			x = s.nextInt();
			System.out.print("Introduce un radio: ");
			r = Geometria.pideRadio();
			System.out.println("\n");

			switch(x){
				case 0:
				System.out.println("Saliendo del sistema");
				break;
				case 1:
				System.out.println("Resultado de la circunferencia");
				System.out.println(misFunciones.Geometria.circunferencia(r));
                break;
				case 2:
				System.out.println("Resultado del area");
				System.out.println((int)Geometria.area(r));
                break;
				default:
				System.out.println("Número incorrecto reintentelo");
				break;
			}
		}while(x != 0);
		System.out.println(x);
	}
	public static double circunferencia(double r){
		double pi = 3.14;
		double circunferencia;
		circunferencia = pi * 2 * r;
		return circunferencia;
	}
	public static double area(double r){
		double pi = 3.14;
		double area;
		area = pi * r * r;
		return area;
	}
	public static double pideRadio(){
		double r;
		r = s.nextDouble();
		return r;
	}
}




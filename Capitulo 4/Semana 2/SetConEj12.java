import java.util.Scanner;

/*
* Este programa pregunta en tipo test para comprobar tu conocimiento.
*
* MiguelBlanco
*/
public class SetConEj12 {
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int punto;
		
		punto = 0;
		
		System.out.println("¿Cual es el primer programa que se realiza para empezar a programar?:");
		System.out.println("1) HolaMundo");
		System.out.println("2) BuenasTardes");
		System.out.println("3) Adios");
		System.out.println("4) RecetaDeCocina");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta incorrecta");
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("¿Que tipo de función nos permite crear un archivo .java y compilarlo?:");
		System.out.println("1) public static void main");
		System.out.println("2) Scanner");
		System.out.println("3) public class");
		System.out.println("4) String");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("¿Que salida de datos es la correcta?:");
		System.out.println("1) Ssytem.out.print");
		System.out.println("2) System.out.prinl");
		System.out.println("3) Sytem.out.print");
		System.out.println("4) System.out.print");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta incorrecta");
				break;
			case 4:
        System.out.println("Respuesta correcta");
				punto++;
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("La salida formateda sirve para:");
		System.out.println("1) Reducir decimales");
		System.out.println("2) Reducir decimales y modificar la salida de datos");
		System.out.println("3) Modificar toda variable");
		System.out.println("4) Modificar variables numéricas");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("¿Cual de todas estas varibles permite la entrada de decimales?:");
		System.out.println("1) Int");
		System.out.println("2) Double y Float");
		System.out.println("3) Float");
		System.out.println("4) String");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 3:
				System.out.println("Respuesta incorrecta");
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("¿Cual de estos NO es un caracter booleano?:");
		System.out.println("1) &&");
		System.out.println("2) ||");
		System.out.println("3) !");
		System.out.println("4) //");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta incorrecta");
				break;
			case 4:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("Si tuvieramos que crear un rango de tiempo, ¿cual de estos funcionaria?: ");
		System.out.println("1) if (hora == 0 && hora == 24)");
		System.out.println("2) if (hora => 0 && hora >= 24)");
		System.out.println("3) if (hora >= 0 && hora <= 24)");
		System.out.println("4) if (hora >= 0 || hora <= 24)");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("Preguntas rapidas: ¿cuantas opciones son necesarias para tener un switch?");
		System.out.println("1) 3");
		System.out.println("2) 2");
		System.out.println("3) 5");
		System.out.println("4) Ninguna");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta incorrecta");
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("Preguntas rapidas: ¿Cuando es necesario un else?");
		System.out.println("1) Depende de la situación");
		System.out.println("2) Nunca");
		System.out.println("3) Después de un if");
		System.out.println("4) Antes de un switch");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta incorrecta");
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta imposible, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("Preguntas rapidas: ¿Puede un if no ser booleano?");
		System.out.println("1) No");
		System.out.println("2) Si");
		System.out.println("3) Depende del problema");
		System.out.println("4) Solo si se requiere de usar boolenaos");
		System.out.println("");
		a = s.nextInt();
		System.out.println("");
		
		
		switch(a){
			case 1:
				System.out.println("Respuesta incorrecta");
				break;
			case 2:
				System.out.println("Respuesta incorrecta");
				break;
			case 3:
				System.out.println("Respuesta correcta");
				punto++;
				break;
			case 4:
				System.out.println("Respuesta incorrecta");
				break;
			default:
				System.out.print("Respuesta incorrecta, reiniciando");
				System.exit(0);
			}
		System.out.println("");
		System.out.println("La puntación total ha sido de " + punto);
		}
	}

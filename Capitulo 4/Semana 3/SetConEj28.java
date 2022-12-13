import java.util.Scanner;

/*
*
*Este programa trata de recrear en ordenador el piedra papel tijeras
*
*
*MiguelBlanco
*/
public class SetConEj28{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String jugador1;
		String jugador2;
		String resultado;
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		jugador1 = s.next();
		
		jugador1 = jugador1.toLowerCase();
		
		switch(jugador1){
		
			case "piedra":
				System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
				jugador2 = s.next();
					
				switch(jugador2){
					
					case "piedra":
						System.out.print("Empate");
						System.exit(0);
						break;
					
					case "papel":
						System.out.print("Gana el Jugador 2");
						System.exit(0);
						break;
					
					case "tijeras":
						System.out.print("Gana el Jugador 1");
						System.exit(0);
						break;
						
					default:
					System.out.print("Siguiendo la normativa creada por el juego, usted ha usado una imposible jugada. Solo puede usar la poderosa piedra, el intrepido papel o las afiladas tijeras para ganar");
					System.exit(0);
					break;
				}
				
			case "papel":
				System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
				jugador2 = s.next();
					
				switch(jugador2){
					
					case "piedra":
						System.out.print("Gana el Jugador 1");
						System.exit(0);
						break;
					
					case "papel":
						System.out.print("Empate");
						System.exit(0);
						break;
					
					case "tijeras":
						System.out.print("Gana el Jugador 2");
						System.exit(0);
						break;
						
					default:
					System.out.print("Siguiendo la normativa creada por el juego, usted ha usado una imposible jugada. Solo puede usar la poderosa piedra, el intrepido papel o las afiladas tijeras para ganar");
					System.exit(0);
					break;
				}
				
			case "tijeras":
				System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
				jugador2 = s.next();
					
				switch(jugador2){
					
					case "piedra":
						System.out.print("Gana el Jugador 2");
						System.exit(0);
						break;
					
					case "papel":
						System.out.print("Gana el Jugador 1");
						System.exit(0);
						break;
					
					case "tijeras":
						System.out.print("Empate");
						System.exit(0);
						break;
						
					default:
					System.out.print("Siguiendo la normativa creada por el juego, usted ha usado una imposible jugada. Solo puede usar la poderosa piedra, el intrepido papel o las afiladas tijeras para ganar");
					System.exit(0);
					break;
				}
				
				default:
					System.out.print("Siguiendo la normativa creada por el juego, usted ha usado una imposible jugada. Solo puede usar la poderosa piedra, el intrepido papel o las afiladas tijeras para ganar");
					System.exit(0);
					break;
		}
	}
}

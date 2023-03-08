package Orientación_a_objetos;
import java.util.Scanner;

public class Ejercicio2POO {
    public static void main(String[] args){
        int opcion = 0;
        int km;
        String gasolina;
        Scanner s = new Scanner(System.in);

        Bicicleta Vespiquen = new Bicicleta(12);
        
        Coche SeatGranada = new Coche(1950);

        while (opcion != 9) {

            System.out.println("1. Anda con la bicicleta");

            System.out.println("2. Haz el caballito con la bicicleta");

            System.out.println("3. Anda con el coche");

            System.out.println("4. Quema rueda con el coche");

            System.out.println("5. Ver kilometraje de la bicicleta");

            System.out.println("6. Ver kilometraje del coche");

            System.out.println("7. Ver kilometraje total");

            System.out.println("8. Comprobar el tipo de gasolina del coche");

            System.out.println("9. Salir");

            System.out.println("Elige una opción (1-9): ");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {

                case 1:

                System.out.print("¿Cuántos kilómetros quiere recorrer? ");

                km = Integer.parseInt(System.console().readLine());

                Vespiquen.recorre(km);

                break;

                case 2:

                Vespiquen.hazCaballito();

                break;

                case 3:

                System.out.print("¿Cuántos kilómetros quiere recorrer? ");

                km = Integer.parseInt(System.console().readLine());

                SeatGranada.recorre(km);

                break;

                case 4:

                SeatGranada.quemaRueda();

                break;

                case 5:

                System.out.println("La bicicleta lleva recorridos ");

                System.out.println(Vespiquen.getKmRecorridos() + " Km");

                break;

                case 6:

                System.out.println("El coche lleva recorridos ");

                System.out.println(SeatGranada.getKmRecorridos() + " Km");

                break;

                case 7:

                System.out.println("Los vehículos llevan recorridos ");

                System.out.println(Vehiculo.getKmTotales() + " Km");

                case 8:

                System.out.println("¿Que tipo de carburante usa su coche? ");

                gasolina = s.next();

                SeatGranada.esDiesel(gasolina);

                break;

                case 9:

                break;

                default:

                System.out.println("Error de introduccion de numero, incluya uno que se encuentre en el menú");
                
                break;

            } // switch

        } // while

    }

}


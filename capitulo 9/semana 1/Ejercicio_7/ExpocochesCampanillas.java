package Ejercicio_7;

import java.util.Scanner;

public class ExpocochesCampanillas {
    public static void main(String[] args){
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona VIP = new Zona(25);

        int opcion = 0;

        int opcion2 = 0;

        int n = 0;

        Scanner s = new Scanner(System.in);

        while(opcion < 3){

            System.out.println("\n\nEXPOCOCHES CAMPANILLAS");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");

            opcion = s.nextInt();

            if(opcion == 1){

                System.out.println("\n\nPara la zona principal hay a la venta " + principal.getEntradasPorVender() + " entradas");

                System.out.println("En la zona de compra venta hay en total: " + compraVenta.getEntradasPorVender() + " entradas restantes");

                System.out.println("En la zona VIP quedan sin reservar un total de " +  VIP.getEntradasPorVender() + " entradas");

            } else if(opcion == 2){

                System.out.println("\n\n1. Principal");
                
                System.out.println("2. Compra-venta ");

                System.out.println("3. Vip");

                System.out.print("Elige la zona para la que quieres comprar las entradas: ");

                opcion2 = s.nextInt();

                System.out.print("¿Cuantas entradas quieres? ");
                n = s.nextInt();

                switch(opcion2) {

                    case 1:
                        principal.vender(n);
                        break;
                    case 2:
                        compraVenta.vender(n);
                        break;
                    case 3:
                        VIP.vender(n);
                        break;
                    default:

                }

            }

    }

}

}

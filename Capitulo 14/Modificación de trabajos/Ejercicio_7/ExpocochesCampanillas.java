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

        do{

            System.out.println("\n\nEXPOCOCHES CAMPANILLAS");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");
            try{
            opcion = Integer.parseInt(System.console().readLine());
            } 
            catch(Exception e){
                System.out.println("Excepcion: " + e.getClass());
                System.out.println("Error: " + e.getMessage());
                System.out.println("Introducción de un número decimal o un caracter ilegal");
            }
            switch(opcion){
            case 1:
                System.out.println("\n\nPara la zona principal hay a la venta " + principal.getEntradasPorVender() + " entradas");
                System.out.println("En la zona de compra venta hay en total: " + compraVenta.getEntradasPorVender() + " entradas restantes");
                System.out.println("En la zona VIP quedan sin reservar un total de " +  VIP.getEntradasPorVender() + " entradas");
                break; 
            case 2:
                System.out.println("\n\n1. Principal");
                System.out.println("2. Compra-venta ");
                System.out.println("3. Vip");
                System.out.print("Elige la zona para la que quieres comprar las entradas: ");
                try{
                opcion2 = Integer.parseInt(System.console().readLine());
                }
                catch(Exception e){
                    System.out.println("Excepcion: " + e.getClass());
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Introducción de un número decimal o un caracter ilegal");
                }
                switch(opcion2) {
                    case 1:
                        System.out.print("¿Cuantas entradas quieres? ");
                        try{
                        n = Integer.parseInt(System.console().readLine());
                        }
                        catch(Exception e){
                        System.out.println("Excepcion: " + e.getClass());
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Introducción de un número decimal o un caracter ilegal");
                        }
                        principal.vender(n);
                        break;
                    case 2:
                        System.out.print("¿Cuantas entradas quieres? ");
                        try{
                        n = Integer.parseInt(System.console().readLine());
                        }
                        catch(Exception e){
                        System.out.println("Excepcion: " + e.getClass());
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Introducción de un número decimal o un caracter ilegal");
                        }
                        compraVenta.vender(n);
                        break;
                    case 3:
                        System.out.print("¿Cuantas entradas quieres? ");
                        try{
                        n = Integer.parseInt(System.console().readLine());
                        }
                        catch(Exception e){
                        System.out.println("Excepcion: " + e.getClass());
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Introducción de un número decimal o un caracter ilegal");
                        }
                        VIP.vender(n);
                        break;
                    default:

                }//switch 2
                break;
            case 3:
                break;
            }//Switch 1
    }while(opcion != 3);

    }
}


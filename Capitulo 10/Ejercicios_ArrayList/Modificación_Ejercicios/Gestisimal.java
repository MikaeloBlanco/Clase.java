package Tema_10.Ejercicios_ArrayList.Modificación_Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestisimal {
    public static void main(String[] args){
        //Variables
        ArrayList<Articulo> articulo = new ArrayList<>();  
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        int disponibilidad;
        String disponibilidadCodigo;
        boolean existeCodigo;
        String nuevoCodigo = "DISPONIBLE";
        double precioCompraIntroducido;
        double precioVentaIntroducido;
        int stockIntroducido;
        String nuevaDescripcion;
        String precioCompraString;
        String precioVentaString;
        String stockString;
        int i;
        //Articulo experimento
            articulo.add(new Articulo("DISPONIBLE"));
        

        while(opcion != 7){
        //Menu
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
        System.out.print("Introduce una opción que desee seleccionar: ");
        opcion = s.nextInt();

            switch(opcion){
                case 1:
                System.out.println("\nListado de articulos");
                    for(i = 0; i < articulo.size(); i++){
                    if(!articulo.get(i).getCodigo().equals("DISPONIBLE")){
                        System.out.println(articulo);
                    }
                }
                break;

                case 2:
                System.out.println("\nNuevo articulo en almacen");
                disponibilidad = 0;
                disponibilidadCodigo = articulo.get(disponibilidad).getCodigo();
                while((disponibilidad < articulo.size()) && (!(disponibilidadCodigo.equals("DISPONIBLE")))){
                    disponibilidad++;
                    if(disponibilidad < articulo.size()){
                        disponibilidadCodigo = articulo.get(disponibilidad).getCodigo(); 
                    }
                }
    
                if (disponibilidad == articulo.size()){
                    System.out.println("Actualmente la base de datos se encuentra completamnete llena");
                } else {
                    System.out.println("Introduzca los datos del articulo que desee incorporar: ");
                    System.out.print("Codigo del producto: ");
                    existeCodigo = true;

                    while (existeCodigo) {
                        existeCodigo = false;
                        nuevoCodigo = s.next();
                        for (i = 0; i < articulo.size(); i++) {
                        if (nuevoCodigo.equals(articulo.get(i).getCodigo())) {
                        existeCodigo = true;
                        }
                    }

                        if (existeCodigo) {
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        }
                    }
                
                articulo.get(disponibilidad).setCodigo(nuevoCodigo);
                System.out.print("Descripcion: ");
                nuevaDescripcion = s.next();
                articulo.get(disponibilidad).setDescripcion(nuevaDescripcion);
                System.out.print("Precio de compra: ");
                precioCompraIntroducido = s.nextDouble();
                articulo.get(disponibilidad).setPrecioCompra(precioCompraIntroducido);
                System.out.print("Precio de venta: ");
                precioVentaIntroducido = s.nextDouble();
                articulo.get(disponibilidad).setPrecioVenta(precioVentaIntroducido);
                System.out.print("Stock: ");
                stockIntroducido = s.nextInt();
                articulo.get(disponibilidad).setStock(stockIntroducido);
                }
                break;

                case 3:
                System.out.println("\nEliminación de un articulo en almacen");
                System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
                nuevoCodigo = s.next();
                i = -1;
                disponibilidadCodigo = "";
                do {
                    i++;
                    if (i < articulo.size()) {
                        disponibilidadCodigo = articulo.get(i).getCodigo();
                    }
                } while (!(disponibilidadCodigo.equals(nuevoCodigo)) && (i < articulo.size()));
                if (i == articulo.size()) {
                    System.out.println("Lo siento, el código introducido no existe.");
                } else {
                    articulo.set(i,new Articulo("LIBRE"));
                    System.out.println("articulo borrado.");
                }
                break;

                case 4:
                System.out.println("\nModificación de articulo de almacen");
                System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
                nuevoCodigo = System.console().readLine();
                i = -1;
                boolean isValid = false;
                do{
                    i++;
                    if(!((articulo.get(i).getCodigo()).equals(nuevoCodigo))){
                        isValid = true;
                    }
                } while (!isValid && i < articulo.size());
                System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
                System.out.println("Código anterior: " + articulo.get(i).getCodigo());
                System.out.print("Nuevo código: ");
                nuevoCodigo = s.next();
                if (!nuevoCodigo.equals("")) {
                articulo.get(i).setCodigo(nuevoCodigo);
                }
                System.out.println("Descripción: " + articulo.get(i).getDescripcion());
                System.out.print("Nueva descripción: ");
                nuevaDescripcion = s.next();
                if (!nuevaDescripcion.equals("")) {
                    articulo.get(i).setDescripcion(nuevaDescripcion);
                }
                System.out.println("Precio de compra: " + articulo.get(i).getPrecioCompra());
                System.out.print("Nuevo precio de compra: ");
                precioCompraString = s.next();
                if (!precioCompraString.equals("")) {
                    articulo.get(i).setPrecioCompra(Double.parseDouble(precioCompraString));
                }
                System.out.println("Precio de venta: " + articulo.get(i).getPrecioVenta());
                System.out.print("Nuevo precio de venta: ");
                precioVentaString = s.next();
                if(!precioVentaString.equals("")) {
                    articulo.get(i).setPrecioVenta(Double.parseDouble(precioVentaString));
                }
                System.out.println("Stock: " + articulo.get(i).getStock());
                System.out.print("Nuevo stock: ");
                stockString = s.next();
                if (!stockString.equals("")) {
                    articulo.get(i).setStock(Integer.parseInt(stockString));
                }
                break;

                case 5:
                System.out.println("\nEntrada mercancía al almacen");
                System.out.print("Por favor, introduzca el código del artículo: ");
                nuevoCodigo = s.next();
                i = -1;
                disponibilidadCodigo = "";
                do {
                    i++;
                    if (i < articulo.size()) {
                        disponibilidadCodigo = articulo.get(i).getCodigo();
                    }
                } while (!(disponibilidadCodigo.equals(nuevoCodigo)) && (i < articulo.size()));
                if (i == articulo.size()) {
                    System.out.println("Lo siento, el código introducido no existe.");
                } else {
                    System.out.println("Entrada de mercancía del siguiente artículo: ");
                    System.out.println(articulo.get(i));
                    System.out.print("Introduzca el número de unidades que entran al almacén: ");
                    stockString = s.next();
                    articulo.get(i).setStock(Integer.parseInt(stockString) + articulo.get(i).getStock());
                    System.out.println("La mercancía ha entrado en el almacén.");
                }
                break;

                case 6:
                System.out.println("\nSalida de mercancía de almacen");
                System.out.print("Por favor, introduzca el código del artículo: ");
                disponibilidadCodigo = s.next();
                i = -1;
                disponibilidadCodigo = "";
                do {
                    i++;
                    if (i < articulo.size()) {
                        disponibilidadCodigo = articulo.get(i).getCodigo();
                    }
                } while (!(disponibilidadCodigo.equals(nuevoCodigo)) && (i < articulo.size()));
                if (i == articulo.size()) {
                    System.out.println("Lo siento, el código introducido no existe.");
                } else {
                    System.out.println("Salida de mercancía del siguiente artículo: ");
                    System.out.println(articulo.get(i));
                    System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                    stockIntroducido = s.nextInt();
                    if (articulo.size() - stockIntroducido > 0) {
                        articulo.get(i).setStock(articulo.size() - stockIntroducido);
                        System.out.println("La mercancía ha salido del almacén.");
                    } else {
                        System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                    }
                }
                break;

                case 7:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Error en el sistema, reintentando");
                    break;
            }
        }
    }
}
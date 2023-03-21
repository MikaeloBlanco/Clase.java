package Array_objetos.Ejercicio_3;

import java.util.Scanner;

public class Gestisimal {
    public static void main(String[] args){
        //Variables
        int cant = 50;
        Articulo[] articulo = new Articulo[cant];  
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

        //Celdas de cada articulo
        for(int o = 0; o < cant; o++){
            articulo[o] = new Articulo();
        }

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
                for(i = 0; i < cant; i++){
                    if(!articulo[i].getCodigo().equals("DISPONIBLE")){
                        System.out.println(articulo[i]);
                    }
                }
                break;

                case 2:
                System.out.println("\nNuevo articulo en almacen");
                disponibilidad = 0;
                disponibilidadCodigo = articulo[disponibilidad].getCodigo();
                while((disponibilidad < cant) && (!(disponibilidadCodigo.equals("DISPONIBLE")))){
                    disponibilidad++;
                    if(disponibilidad < cant){
                        disponibilidadCodigo = articulo[disponibilidad].getCodigo(); 
                    }
                }
    
                if (disponibilidad == cant){
                    System.out.println("Actualmente la base de datos se encuentra completamnete llena");
                } else {
                    System.out.println("Introduzca los datos del articulo que desee incorporar: ");
                    System.out.print("Codigo del producto: ");
                    existeCodigo = true;

                    while (existeCodigo) {
                        existeCodigo = false;
                        nuevoCodigo = s.next();
                        for (i = 0; i < cant; i++) {
                        if (nuevoCodigo.equals(articulo[i].getCodigo())) {
                        existeCodigo = true;
                        }
                    }

                        if (existeCodigo) {
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        }
                    }
                
                articulo[disponibilidad].setCodigo(nuevoCodigo);
                System.out.print("Descripcion: ");
                nuevaDescripcion = s.next();
                articulo[disponibilidad].setDescripcion(nuevaDescripcion);
                System.out.print("Precio de compra: ");
                precioCompraIntroducido = s.nextDouble();
                articulo[disponibilidad].setPrecioCompra(precioCompraIntroducido);
                System.out.print("Precio de venta: ");
                precioVentaIntroducido = s.nextDouble();
                articulo[disponibilidad].setPrecioVenta(precioVentaIntroducido);
                System.out.print("Stock: ");
                stockIntroducido = s.nextInt();
                articulo[disponibilidad].setStock(stockIntroducido);
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
                    if (i < cant) {
                        disponibilidadCodigo = articulo[i].getCodigo();
                    }
                } while (!(disponibilidadCodigo.equals(nuevoCodigo)) && (i < cant));
                if (i == cant) {
                    System.out.println("Lo siento, el código introducido no existe.");
                } else {
                    articulo[i].setCodigo("LIBRE");
                    System.out.println("articulo borrado.");
                }
                break;

                case 4:
                System.out.println("\nModificación de articulo de almacen");
                System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
                nuevoCodigo = System.console().readLine();
                i = -1;
                do {
                    i++;
                } while (!((articulo[i].getCodigo()).equals(nuevoCodigo)));
                System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
                System.out.println("Código anterior: " + articulo[i].getCodigo());
                System.out.print("Nuevo código: ");
                nuevoCodigo = s.next();
                if (!nuevoCodigo.equals("")) {
                articulo[i].setCodigo(nuevoCodigo);
                }
                System.out.println("Descripción: " + articulo[i].getDescripcion());
                System.out.print("Nueva descripción: ");
                nuevaDescripcion = s.next();
                if (!nuevaDescripcion.equals("")) {
                    articulo[i].setDescripcion(nuevaDescripcion);
                }
                System.out.println("Precio de compra: " + articulo[i].getPrecioCompra());
                System.out.print("Nuevo precio de compra: ");
                precioCompraString = s.next();
                if (!precioCompraString.equals("")) {
                    articulo[i].setPrecioCompra(Double.parseDouble(precioCompraString));
                }
                System.out.println("Precio de venta: " + articulo[i].getPrecioVenta());
                System.out.print("Nuevo precio de venta: ");
                precioVentaString = s.next();
                if(!precioVentaString.equals("")) {
                    articulo[i].setPrecioVenta(Double.parseDouble(precioVentaString));
                }
                System.out.println("Stock: " + articulo[i].getStock());
                System.out.print("Nuevo stock: ");
                stockString = s.next();
                if (!stockString.equals("")) {
                    articulo[i].setStock(Integer.parseInt(stockString));
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
                    if (i < cant) {
                        disponibilidadCodigo = articulo[i].getCodigo();
                    }
                } while (!(disponibilidadCodigo.equals(nuevoCodigo)) && (i < cant));
                if (i == cant) {
                    System.out.println("Lo siento, el código introducido no existe.");
                } else {
                    System.out.println("Entrada de mercancía del siguiente artículo: ");
                    System.out.println(articulo[i]);
                    System.out.print("Introduzca el número de unidades que entran al almacén: ");
                    stockString = s.next();
                    articulo[i].setStock(Integer.parseInt(stockString) + articulo[i].getStock());
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
                    if (i < cant) {
                        disponibilidadCodigo = articulo[i].getCodigo();
                    }
                } while (!(disponibilidadCodigo.equals(nuevoCodigo)) && (i < cant));
                if (i == cant) {
                    System.out.println("Lo siento, el código introducido no existe.");
                } else {
                    System.out.println("Salida de mercancía del siguiente artículo: ");
                    System.out.println(articulo[i]);
                    System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                    stockIntroducido = s.nextInt();
                    if (articulo[i].getStock() - stockIntroducido > 0) {
                        articulo[i].setStock(articulo[i].getStock() - stockIntroducido);
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

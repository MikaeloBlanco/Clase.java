package Tema_14.Ejercicio_PruebaExcepciones_Tema_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Parte 1 de la tarea 2. Prueba de Excepciones en una funcion main con sub funciones dentro.
 * 
 * @author Miguel Blanco Fernández
 */

public class PruebaExcepciones {
    public static void main(String[] args){
        //Variables
        int num1 = 0;
        int num2 = 0;
        int opc = 0;
        Scanner s = new Scanner(System.in);

        //menu;
        do{
        System.out.println("Menú de errores de ejecución");
        System.out.println("1. Error de sobrecarga de Pila");
        System.out.println("2. Error de aritmetica");
        System.out.println("3. Array fuera de ancho");
        System.out.println("4. Error de Fichero inexistente");
        System.out.println("5. Error de mala introducción de número por teclado");
        System.out.println("6. Salida");
        opc = LeerTeclado(opc);
        switch(opc){
            case 1:
                System.out.println("CUIDADO. Este error es un StackOverflow. Puede explotar todo");
                num2 = LeerTeclado(num2);
                try{
                    Factorial(num2);
                } catch(StackOverflowError e){
                    System.out.println("Te lo dije");
                }
                break;
            case 2:
                System.out.println("Para provocarlo introduce el segundo número como cero");
                num1 = LeerTeclado(num1);
                num2 = LeerTeclado(num2);
                try{
                    Division_aritmetica(num1,num2);
                } catch(ArithmeticException ae){
                    System.out.println("Trata con otro divisor");
                }
                break;
            case 3:
                System.out.println("Cualquier número vale");
                num1 = LeerTeclado(num1);
                try{
                Array_largo(num1);
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Dentro del codigo esta puesto para que jamás se llene el espacio adecuado");
                }
                break;
            case 4:
                try {
                    comunismo();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                System.out.println("Trata de introducir mal un número entero");
                num1 = LeerTeclado(num1);
            }
        }while(opc < 6);
    }

    //Clases
    public static int Division_aritmetica(int dividible, int divisor)throws ArithmeticException{
        try{
            return dividible/divisor;
        } catch (ArithmeticException ae){
            System.out.println("El número introducido como divisor vale 0");
            throw ae;
        }

    }
    public static File comunismo() throws FileNotFoundException {
        Scanner texto = new Scanner(new File("textoDeEjemplo.txt"));
        return comunismo();
    }
    public static int[] Array_largo(int dato) throws ArrayIndexOutOfBoundsException{
        int[] array_largo = new int[30];
        
        try{
            array_largo[30] = dato;
            return array_largo;
        } catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Espacio del array completado");
            throw aioobe;
        }
    }
    public static int LeerTeclado(int num1){
        boolean isValid = false;
        System.out.println("introduce un número");
        do{
            try{
                num1 = Integer.parseInt(System.console().readLine());
                isValid = true;
            } catch(NumberFormatException nfe){
                System.out.println("El número tiene un elemento que hace a la variable ilegal");
            }
        }while(!isValid);
        return num1;
    }
    public static int Factorial(int numeroFactorial) throws StackOverflowError{
        try{
            for (int i=numeroFactorial; i > 0; i++ ){
                fact(numeroFactorial);
            }
        }catch(StackOverflowError sofe){
            System.out.println("Error de sobrecarga de datos: ");
            throw sofe;
        } 
        return numeroFactorial;
    }
    public static int fact(int n) throws StackOverflowError{
        if(n < 9999999){
            n = n * fact(n-1);
        }
        return n;
    }
}

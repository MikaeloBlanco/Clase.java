/**
 * Primer ejercicio de construcción de Programas con excepciones
 *   
 * 
 * @author Miguel Blanco Fernández
 */
public class ControlExcepciones1{
    public static void main(String[] args){
        //Variables
        int cont = 0;
        int max = 0;
        int[] num = new int[6];
        boolean isValid = false;
    
    while(cont < 6){
        do{
            try{
            num[cont] = Integer.parseInt(System.console().readLine());
            isValid = true;
            }//try
            catch(Exception e){
                System.out.println("Excepcion: " + e.getClass());
                System.out.println("Error: " + e.getMessage());
                System.out.println("Introducción erronea de un parametro");
            }//catch
        }while(!isValid);//do while

        if(num[cont] > max){
            max = num[cont];
        }//if
        cont++;
    }//Bucle while cont
    System.out.println("Maximo de todos los números introducidos: " + max);
}//main
}//class ControlExcepciones

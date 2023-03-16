package Ejercicio_3;

public class Reptil extends Animal {
    
    private String movimiento;



    public Reptil(Sexo s){

        super(s);

    }

    public void tomaElSol() {
    
        System.out.println("Estoy tomando el Sol");
    
    }

    public void setMovimiento(String movimiento){

        this.movimiento = movimiento;

    }

    public void repta(){

        if(movimiento.equals("camina")){

            System.out.println("Lo siento, yo no repto");

        } else {

            System.out.println("repto sigilosamente");

        }

    }

    public void oler(){

        System.out.println("Aqui huele bastante bien");

    }

}

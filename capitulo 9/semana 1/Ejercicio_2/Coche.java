package Ejercicio_2;

public class Coche extends Vehiculo{

    

    private int cilindrada;
    private String esDiesel;
    

    public Coche(int cil){
        super();

        this.cilindrada = cil;

    }

    void esDiesel(String s){


        if(s.equals("diesel")){

            this.esDiesel = "Es diesel";

            System.out.println(esDiesel);


        } else {

            this.esDiesel = "No es diesel";

            System.out.println(esDiesel);

        }

    }

    public void quemaRueda() {
        System.out.println("Ffrrrrrshhhhhhhhhhiiiiiiiummmmmm");
    }

}

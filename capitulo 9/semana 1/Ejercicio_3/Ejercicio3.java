package Ejercicio_3;

import Ejercicio_3.Animal;

public class Ejercicio3 {   
    public static void main(String[] args) {

            Pinguino tux = new Pinguino(Animal.Sexo.MACHO);

            tux.come("palomitas");

            tux.programa();

            Perro laika = new Perro(Animal.Sexo.HEMBRA);

            laika.duerme();

            laika.dameLaPata();

            laika.amamanta();

            laika.cuidaCrias();

            Lagarto godzilla = new Lagarto(Animal.Sexo.MACHO);

            godzilla.tomaElSol();

            godzilla.duerme();

            godzilla.lanzafuego();

            Gato gordon = new Gato(Animal.Sexo.MACHO);

            gordon.limpiate();

            gordon.caza();

        }


}

package Ejercicio_3;

import Ejercicio_3.Animal.Sexo;

public class Ejercicio3 {


    public class PruebaAnimales {

        public static void main(String[] args) {

            Pinguino tux = new Pinguino(Sexo.MACHO);

            tux.come("palomitas");

            tux.programa();

            Perro laika = new Perro(Sexo.HEMBRA);

            laika.duerme();

            laika.dameLaPata();

            laika.amamanta();

            laika.cuidaCrias();

            Lagarto godzilla = new Lagarto(Sexo.MACHO);

            godzilla.tomaElSol();

            godzilla.duerme();

            godzilla.lanzafuego();

            Gato gordon = new Gato(Sexo.MACHO);

            gordon.limpiate();

            gordon.caza();

        }

    }

}

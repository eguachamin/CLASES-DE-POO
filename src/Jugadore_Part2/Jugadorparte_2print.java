package Jugadore_Part2;

public class Jugadorparte_2print {
        public static void main (String[] args){
            Jugadores persona2 =new Jugadores(1715414171,"Jair",10);
            persona2.ayuda_mostrar();
            System.out .println("------------------");
            Jugadores persona3 =new Jugadores(19151213,"Jonathan",15);
            persona3.ayuda_mostrar();
            System.out .println("------------------");
            Jugadores persona4 =new Jugadores(19151213,"Jonathan");
            persona4.ayuda2_mostrar();
            System.out .println("------------------");
        }
}

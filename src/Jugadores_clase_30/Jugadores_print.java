package Jugadores_clase_30;

public class Jugadores_print {
    public static void main (String[] args){

        Jugadores persona2 =new Jugadores(1715414171,"Jair",10);
        persona2.mostrar_info();
        System.out .println("------------------");
        Jugadores persona3 =new Jugadores(19151213,"Jonathan",15);
        persona3.mostrar_info();
        System.out .println("------------------");
        Jugadores persona4 =new Jugadores(19151213,"Jonathan");
        persona4.info_parcial();
        System.out .println("------------------");
        Defensa persona1= new Defensa(1751253400,"Ariel",9,"Defensa",3,5,8);
        persona1.informacion();
    }
}

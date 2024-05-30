package Jugadores_clase_30;

class Jugadores {
    public int cedula;
    public String nombre;
    public int camiseta;

    public Jugadores(int cedula, String nombre,int camiseta){
        this.cedula=cedula;
        this.nombre=nombre;
        this.camiseta=camiseta;
    }
    public Jugadores(int cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
    }
    public void info_parcial(){
        System.out.println("La infomacion del jugador es: ");
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
    }
    public void mostrar_info(){
        System.out.println("La infomacion del jugador es: ");
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Camiseta: "+camiseta);
    }

}
class Defensa extends Jugadores {
    public String posicion;
    public int tarjetas;
    public int goles;
    public int faltas;

    public Defensa (int cedula, String nombre,int camiseta,String posicion,int tarjetas,int goles,int faltas ){
        super(cedula,nombre,camiseta);
        this.posicion=posicion;
        this.tarjetas=tarjetas;
        this.goles=goles;
        this.faltas=faltas;
    }
    public void informacion(){
        super.mostrar_info();
        System.out.println("Posición: "+posicion);
        System.out.println("Tarjetas: "+tarjetas);
        System.out.println("Goles: "+goles);
        System.out.println("Faltas: "+faltas);
    }

}
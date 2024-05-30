package Jugadore_Part2;

class Jugadores {
    private int cedula;
    private String nombre;
    private int camiseta;

    public Jugadores(int cedula, String nombre, int camiseta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.camiseta = camiseta;
    }

    public Jugadores(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    private void info_parcial() {
        System.out.println("La infomacion del jugador es: ");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
    }

    private void mostrar_info() {
        System.out.println("La infomacion del jugador es: ");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Camiseta: " + camiseta);
    }
    public void ayuda_mostrar (){//Este método llama a los metodos en privado

        mostrar_info();
    }
    public void ayuda2_mostrar (){//Este método llama a los metodos en privado
        info_parcial();
    }
}
package CLASE_31_05;

public class INMUEBLE {
    private String direccion;
    private double tamano;
    private int numHabitaciones;
    private double precio;
    private double precioBase;

    public INMUEBLE(double precioBase){
        this.precioBase=precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public INMUEBLE (String direccion, double tamano, int numHabitaciones, double precio){
        this.direccion=direccion;
        this.tamano=tamano;
        this.numHabitaciones=numHabitaciones;
        this.precio=precio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrarInformacion(){
        System.out.println("Direccion: "+direccion);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Numero de Habitacion: "+numHabitaciones);
        System.out.println("Precio: "+precio);
    }
    public void calcularPrecioFinal(){

    }
}

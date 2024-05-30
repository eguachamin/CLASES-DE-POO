package Clase10mayo;

//Ejercicio de prueba
//Crear una clase llamada Empleadoscon 4 atributos y 2 métodos (marcar tarjeta y registro vacaciones)
class Empleados {
    //Atributos
    private String nombres;
    private String apellido;
    private int edad;
    private int telefono;

    // Constructor:inicializar el objeto o variables

    public Empleados () {
        this.nombres = "Evelyn";
        this.apellido = "Guachamin";
        this.edad = 27;
        this.telefono = 992801667;
    }
    public Empleados (String nombres, String apellido, int edad, int telefono) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    public void mostrar()
    {

        System.out.println("El nombre es "+nombres+apellido+"Con edad de "+edad+" años"+" con el telefono: "+telefono);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}

public class Empleados2{
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados();
        empleado1.mostrar();
        empleado1.setNombres("Andres");
        empleado1.mostrar();
        Empleados objeto2 =new Empleados("Equipo","Sizalima",27,3393346);
        objeto2.mostrar();
    }
}

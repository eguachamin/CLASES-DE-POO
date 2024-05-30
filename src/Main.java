//Ejercicio de prueba
//Crear una clase llamada Empleadoscon 4 atributos y 2 métodos (marcar tarjeta y registro vacaciones)
class Empleados {
    //Atributos
    private String nombres;
    private String apellido;
    private int edad;
    private int telefono;

    // Constructor:inicializar el objeto o variables

    public Empleados (String nombres, String apellido, int edad, int telefono) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    //Método
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //public void marcar_tarjeta()
    //{
       // System.out.println("Para el empleado: " + nombres + " " + apellido +" con edad " +edad +" años "+" y numero de telefono: "+ telefono+"\n Tiene registrado 20 asistencias marcadas");
    //}
    //public void registro_vacaciones()
    {
       // System.out.println("Para el empleado: " + nombres + " " + apellido +"\n Tiene registro de vacacion para el mes de junio");
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Evelyn","Guachamin",27,3393346);
        //empleado1.marcar_tarjeta();
        //empleado1.registro_vacaciones();
        System.out.println("Con el metodo get\n");
        System.out.println("Mi nombre es "+empleado1.getNombres()+"\n");
        System.out.println("Mi apellido es "+empleado1.getApellido()+"\n");
        System.out.println("Mi edad es "+empleado1.getEdad()+"\n");
        System.out.println("Mi telefono es "+empleado1.getTelefono()+"\n");

        empleado1.setEdad(29);
        empleado1.setApellido("Sizalima");
        System.out.println("Con el metodo get incluido el metodo set ya modificado\n");
        System.out.println("Mi nombre es "+empleado1.getNombres()+"\n");
        System.out.println("Mi apellido es "+empleado1.getApellido()+"\n");
        System.out.println("Mi edad es "+empleado1.getEdad()+"\n");
        System.out.println("Mi telefono es "+empleado1.getTelefono()+"\n");

        Empleados empleado2 = new Empleados("Jona","Ramirez",19,2499026);
        //empleado2.marcar_tarjeta();
        //empleado2.registro_vacaciones();
        System.out.println("Con el metodo get\n");
        System.out.println("Mi nombre es "+empleado2.getNombres()+"\n");
        System.out.println("Mi apellido es "+empleado2.getApellido()+"\n");
        System.out.println("Mi edad es "+empleado2.getEdad()+"\n");
        System.out.println("Mi telefono es "+empleado2.getTelefono()+"\n");

        empleado2.setNombres("Ariel");
        empleado2.setTelefono(992801667);
        System.out.println("Con el metodo get incluido el metodo set ya modificado\n");
        System.out.println("Mi nombre es "+empleado2.getNombres()+"\n");
        System.out.println("Mi apellido es "+empleado2.getApellido()+"\n");
        System.out.println("Mi edad es "+empleado2.getEdad()+"\n");
        System.out.println("Mi telefono es "+empleado2.getTelefono()+"\n");


    }

}
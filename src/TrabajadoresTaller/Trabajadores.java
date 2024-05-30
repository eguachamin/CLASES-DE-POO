package TrabajadoresTaller;
public class Trabajadores {
    public int cedula;
    public String nombre;
    public String apellido;
    public int edad;

    public Trabajadores(int cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir_info() {
        System.out.println("Los datos del trabajador son: " + "\n");
        System.out.println("Cédula: " + cedula + "\n");
        System.out.println("Nombre: " + nombre + "\n");
        System.out.println("Apellido: " + apellido + "\n");
        System.out.println("Edad: " + edad + "\n");
    }
}
    class Gerente extends Trabajadores{
        public String fecha_ing_cargo;
        public int anos_exp;

        public Gerente (int cedula,String nombre,String apellido,int edad,String fecha_ing_cargo,int anos_exp)
        {
            super(cedula,nombre,apellido,edad);
            this.fecha_ing_cargo=fecha_ing_cargo;
            this.anos_exp=anos_exp;
        }
        public void info_exp(){
            super.imprimir_info();
            System.out.println("Los datos adicionales del Gerente son: "+"\n");
            System.out.println("Fecha de Ingreso: "+fecha_ing_cargo+"\n");
            System.out.println("Años de experiencia: "+anos_exp+"\n");
        }
    }


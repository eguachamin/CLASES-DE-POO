package PruebaGithub;

public class Clase {
    public String nombre;
    public String apellido;
    public String motivo;

    public Clase(String nombre,String apellido, String motivo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.motivo=motivo;
    }
    public void imprimir(){
        System.out.println("Nombre: "+nombre+" Apellido: "+apellido+" motivo por el cual realiza esto: "+motivo);
    }
    public static void main(String[] args){
        Clase impri1= new Clase("Eve","Guachamin","Prueba GitHub");
        impri1.imprimir();

    }
}

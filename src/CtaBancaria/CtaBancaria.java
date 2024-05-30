package CtaBancaria;
//EJERCICIO 30-05-2023
public class CtaBancaria {
    private int cedula;
    private String nombre;
    private double monto;

    public CtaBancaria(int cedula, String nombre, double monto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.monto = monto;
    }
    public CtaBancaria(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }
    public void mostrar_info() {
        System.out.println("La infomacion del propietario de la cuenta: ");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Monto: " + monto);
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
class CtaAhorros extends CtaBancaria{
    public int telefono;
    public String direccion;
    public double deposito;

    public CtaAhorros (String nombre, double monto, int telefono,String direccion,double deposito){
        super(nombre,monto);
        this.telefono=telefono;
        this.direccion=direccion;
        this.deposito=deposito;
    }
    public void deposito(){
        System.out.println("El monto ingresado es: "+deposito);
        double suma= deposito+getMonto();
        System.out.println("El monto inicial fue: "+getMonto());
        System.out.println("El monto final es: "+suma);
        System.out.println("De la cuenta: "+getNombre());
    }
}
package Clase_Calculos;
//Ejercicio en clase 30-05-2023
public class Class_Calculos {
    private double valor1;
    private double valor2;
    private double valor3;

    public Class_Calculos (double valor1,double valor2,double valor3){
        this.valor1=valor1;
        this.valor2=valor2;
        this.valor3=valor3;
    }
    private void mostrar(){
        System.out.println("Los datos ingresados son: ");
        System.out.println("Valor 1: ");
        System.out.println("Valor 2: ");
        System.out.println("Valor 3: ");
    }
    public void mostrar_inf(){
        mostrar();
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
}
class Sumatoria extends Class_Calculos{

    public Sumatoria (double valor1,double valor2,double valor3){
        super(valor1,valor2,valor3);
    }
    public void sumatoria(){
        double suma=getValor1()+getValor2()+getValor3();
        super.mostrar_inf();
        System.out.println("El valor suma total es de: "+suma);

    }
}

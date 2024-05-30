package Clase_Calculos;
//Ejercicio en clase 30-05-2023
import java.util.Scanner;

public class Suma_Total {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor1: ");
        double valor1 = sc.nextDouble();
        System.out.println("Ingrese valor2: ");
        double valor2 = sc.nextDouble();
        System.out.println("Ingrese valor3: ");
        double valor3 = sc.nextDouble();
        Sumatoria suma1 = new Sumatoria(valor1,valor2,valor3);
        suma1.sumatoria();
    }
}

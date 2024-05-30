package CtaBancaria;

import java.util.Scanner;

public class CtaBancaria_Print {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su cedula: ");
        int cedula = sc.nextInt();
        System.out.println("Ingrese su nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Ingrese su monto: ");
        double monto =sc.nextDouble();
        CtaBancaria persona1 = new CtaBancaria(cedula,nombre,monto);
        persona1.mostrar_info();
        System.out.println("----------------- ");
        System.out.println("Ingrese el monto a depositar ");
        double deposito =sc.nextDouble();
        CtaAhorros persona2 =new CtaAhorros(persona1.getNombre(), persona1.getMonto(), 992801667,"El condado",deposito);
        persona2.deposito();
    }
}

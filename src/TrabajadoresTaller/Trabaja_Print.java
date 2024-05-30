package TrabajadoresTaller;

public class Trabaja_Print {
    public static void main(String[] args)
    {
        Trabajadores empleado1 = new Trabajadores(1751253400,"Fernando","Guachamin",42);
        empleado1.imprimir_info();

        Gerente gerente1 =new Gerente(1715414171,"Fabiola","Guachamin",20,"15-2-2023",8);
        gerente1.info_exp();

    }
}

package CLASE17_05TALLER;

public class Vivienda_print {
    public static void main (String[] args){
        Vivienda v1 = new Vivienda(123,"Fernando");
        v1.imprimir();

        Departamento v2 =new Departamento(56,"Fabiola",52);
        v2.imprimir_de();
        v2.anuncio();

        Casa casa1= new Casa(85,"Joel",35,"Av. 10 de Agosto");
        casa1.imprimir_do();
        casa1.anuncio1();
        }
}

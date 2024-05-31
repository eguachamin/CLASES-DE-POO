package CLASE_31_05;

class CasaIndividual extends INMUEBLE {
    private double tamanoTerreno;
    public double descuento;

    public CasaIndividual(double precioBase,double descuento){
        super(precioBase);
        this.descuento=descuento;
    }
    public  CasaIndividual(String direccion,double tamano,int numHabitaciones,double precio,double tamanoTerreno){
        super(direccion,tamano,numHabitaciones,precio);
        this.tamanoTerreno=tamanoTerreno;
    }

    public double getTamanoTerreno() {
        return tamanoTerreno;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tamaño de Terreno: "+tamanoTerreno);
    }
    @Override
    public void calcularPrecioFinal(){
        super.calcularPrecioFinal();
    }
}

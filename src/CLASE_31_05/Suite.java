package CLASE_31_05;

class Suite extends INMUEBLE {
    private boolean tieneJacuzzi;
    public double descuento;

    public Suite(double precioBase,double descuento){
        super(precioBase);
        this.descuento=descuento;
    }
    public Suite (String direccion,double tamano,int numHabitaciones,double precio,boolean tieneJacuzzi){
        super(direccion,tamano,numHabitaciones,precio);
        this.tieneJacuzzi=tieneJacuzzi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene Jacuzzi: "+tieneJacuzzi);
    }
    @Override
    public void calcularPrecioFinal(){
        super.calcularPrecioFinal();
    }
}

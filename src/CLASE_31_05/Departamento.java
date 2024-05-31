package CLASE_31_05;
class Departamento extends INMUEBLE {
    private int numPiso;
    public double descuento;

    public Departamento(double precioBase,double descuento){
        super(precioBase);
        this.descuento=descuento;
    }

    public Departamento (String direccion,double tamano,int numHabitaciones,double precio,int numPiso){
        super(direccion,tamano,numHabitaciones,precio);
        this.numPiso=numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de Piso: "+numPiso);
    }
    @Override
    public void calcularPrecioFinal(){
    super.calcularPrecioFinal();
    }
}

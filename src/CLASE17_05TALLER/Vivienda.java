package CLASE17_05TALLER;
class Vivienda {
     int numero;
     String propietario;

    public Vivienda (int numero, String propietario){
        this.numero=numero;
        this.propietario=propietario;
    }
    public void imprimir(){
        System.out.println("El número de vivienda es: "+numero+" y el propietario es: "+ propietario);
    }
    }
    class Departamento extends Vivienda {
        private int piso;

        public Departamento(int numero, String propietario, int piso) {
            super(numero, propietario);
            this.piso = piso;
        }

        public void anuncio() {
            System.out.println("Departamento arrendado");
        }

        public void imprimir_de() {
            System.out.println("El número de vivienda es: " + numero + " y el propietario es: " + propietario);
            System.out.println("Se encuentra en el numéro de piso: " + piso);
        }
    }
    class Casa extends Vivienda {
        private int num_habitacion;
        private String ubicacion;

        public Casa(int numero, String propietario, int num_habitacion, String ubicacion) {
            super(numero, propietario);
            this.num_habitacion = num_habitacion;
            this.ubicacion = ubicacion;
        }

        public void imprimir_do() {
            System.out.println("El número de vivienda es: " + numero + " y el propietario es: " + propietario);
            System.out.println("Con el número de habitaciones: " + num_habitacion);
            System.out.println("En la ubicacion: " + ubicacion);
        }

        public void anuncio1() {
            System.out.println("Departamento Disponible");
        }
    }




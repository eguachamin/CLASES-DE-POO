package Semana3_ejercicio1;

class Personas {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private String direccion;
    //Constructor por defecto
    public Personas(){

    }
    //Constructor de copia
    public Personas(Personas persona){
        this.nombre=persona.nombre;
        this.apellidoPaterno=persona.apellidoPaterno;
        this.apellidoMaterno=persona.apellidoMaterno;
        this.sexo=persona.sexo;
        this.edad=persona.edad;
        this.direccion=persona.direccion;
    }

    //Constructor común
    public Personas(String nom, String app, String apm, char sexo, int edad, String dir){
        this.nombre=nom;
        this.apellidoPaterno=app;
        this.apellidoMaterno=apm;
        this.sexo=sexo;
        this.edad=edad;
        this.direccion=dir;
    }
    public void mayorEdad(int edad){
        if(edad>18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

    public String mostrarDatos(Personas persona){
        String datos="Los datos son: \n";
        datos+=persona.nombre+"\n";
        datos+=persona.apellidoPaterno+"\n";
        datos+=persona.apellidoMaterno+"\n";
        datos+=persona.sexo+"\n";
        datos+=persona.edad+"\n";
        datos+=persona.direccion+"\n";
        return datos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public static void main(String[] args) {

        //Guardamos los datos
        Personas persona=new Personas();
        persona.setNombre("Linda");
        persona.setApellidoPaterno("Gómez");
        persona.setApellidoMaterno("Pérez");
        persona.setSexo('M');
        persona.setEdad(28);
        persona.setDireccion("Calle Ariban, Madrid");

        //Obtenemos los datos y los imprimimos
        String nombre=persona.getNombre();
        String app=persona.getApellidoPaterno();
        String apm=persona.getApellidoMaterno();
        char sexo=persona.getSexo();
        int edad=persona.getEdad();
        String direccion=persona.getDireccion();

        System.out.println("Los datos de la persona son: "+nombre+", "+app+", "+apm+", "+sexo+", "+edad+", "+direccion);
    }
}

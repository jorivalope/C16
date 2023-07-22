package co.com.ps.c4;

public class Persona {
    private String nombre;
    int edad;
    String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(){

    }

    public Persona(String cedula){
        this.cedula = cedula;
    }

}

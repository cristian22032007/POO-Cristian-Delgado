package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;

    public Cliente(String nombre, String apellido, String dni, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }
    public String getCorreo() {
        return correo;
    }
    public String toString() {
        return "Cliente{\n" +
                "Nombres: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "ID: " + dni + '\n' +
                "Correo: " + correo + '}';
    }
}


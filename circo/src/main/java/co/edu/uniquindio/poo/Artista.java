package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Artista{
    private String nombre;
    private int edad;
    private String tipodeacto;
    private List<String> historialdeactuaciones;

    public Artista(String nombre, int edad, String tipodeacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipodeacto = tipodeacto;
        this.historialdeactuaciones = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getTipodeacto() {
        return tipodeacto;
    }
    public List<String> getHistorialdeactuaciones() {
        return historialdeactuaciones;
    }

    public void agregarhistorialdeactuacion(String actuacion){
        historialdeactuaciones.add(actuacion);
    }
    public void preguntarAgregarActo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Agregar Acto (1)");
        int resp = entrada.nextInt();
        entrada.nextLine();

        if(resp == 1){
            System.out.println("Ingresar Acto: \n");
            String actuacion = entrada.nextLine();
            agregarhistorialdeactuacion(actuacion);
            System.out.println("\n Acto ingresado exitosamente\n");
        } else {
            System.out.println("\nNo se agrego ningun acto\n");
        }
        entrada.close();
    }
    public String toString() {
        return "Artista{\n"  +
            "Nombre: " + nombre+ "\n" +
            "edad: " + edad + "\n" +
            "Tipo de acto: " + tipodeacto + "\n" +
            "Historial de actuaciones: " + historialdeactuaciones + '}';
    }
}
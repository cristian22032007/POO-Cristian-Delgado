package co.edu.uniquindio;

import java.util.Scanner;
import java.util.ArrayList;

public class ProblemaRaul {
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;

    public ProblemaRaul(String identificacion, String nombres, String apellidos, String correo, String telefono, int edad) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }
}
class GenerarEstudiante {
    public static void main(String[] args) {
        ArrayList<ProblemaRaul> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("\nRESGISTRO DE ESTUDIANTES\n");
            System.out.print("Ingrese el numero de identificacion: ");
            String identificacion = scanner.nextLine();
            System.out.print("Ingrese los nombre del estudiante: ");
            String nombres = scanner.nextLine();
            System.out.print("Ingrese los apellidos del estudiante: ");
            String apellidos = scanner.nextLine();
            System.out.print("Ingrese los correo del estudiante: ");
            String correo = scanner.nextLine();
            System.out.print("Ingrese los telefono de estudiante: ");
            String telefono = scanner.nextLine();
            System.out.print("Ingrese el edad del estudiante: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            ProblemaRaul estudiante = new ProblemaRaul(identificacion, nombres, apellidos, correo, telefono, edad);
            estudiantes.add(estudiante);

            System.out.println("Desea registrar nuevamente(s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")){
                System.out.println("Programa finalizado");
                break;
            }
        }
    }
}
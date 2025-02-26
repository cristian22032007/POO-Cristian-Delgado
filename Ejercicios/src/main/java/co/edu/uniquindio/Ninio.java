package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Scanner;

public class Ninio {
        private String idunic;
        private String nombre;
        private int edad;
        private char genero;
        private String  identificacion;
        private String alergias;
        private String nombredeacudiente;
        private String telefono;

        public Ninio (String idunic, String nombre, int edad, char genero, String identificacion, String alergias, String nombredeacudiente, String telefono) {
            this.idunic = idunic;
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
            this.identificacion = identificacion;
            this.alergias = alergias;
            this.nombredeacudiente = nombredeacudiente;
            this.telefono = telefono;
        }
        public int getEdad(){
        return edad;
        }

        public void mostrarInformacion() {
            System.out.println("--------------------------------");
            System.out.println("ID unico: " + idunic);
            System.out.println("Nombre: "  + nombre);
            System.out.println("edad: "  + edad);
            System.out.println("genero: " + genero);
            System.out.println("identidicacion: " + identificacion);
            System.out.println("alergias: " + alergias);
            System.out.println("nombredeacudiente: " + nombredeacudiente);
            System.out.println("telefono: " + telefono);
        }
    }
    class GenerarMenor2 {
        public static void main(String[] args) {
            ArrayList<Ninio> menores = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("\nRESGISTRO DE ESTUDIANTES\n");
                System.out.print("Ingrese el ID unico: ");
                String idunic = scanner.nextLine();
                System.out.print("Ingrese los nombre del menor: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el edad del menor: ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el genero del menor: ");
                char genero = scanner.nextLine().charAt(0);
                System.out.print("Ingrese el numero de identificacion: ");
                String identificacion = scanner.nextLine();
                System.out.print("Ingrese el alergias: ");
                String alergias = scanner.nextLine();
                System.out.print("Ingrese el nombre de acudiente: ");
                String nombredeacudiente = scanner.nextLine();
                System.out.print("Ingrese el numero de telefono: ");
                String telefono = scanner.nextLine();

                Ninio menor = new Ninio(idunic, nombre, edad, genero, identificacion, alergias, nombredeacudiente, telefono);
                menores.add(menor);

                System.out.println("Desea registrar nuevamente(s/n): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Programa finalizado");
                    break;
                }
            }
            System.out.println("\nLista de menores registrador\n");
            for (Ninio menor : menores) {
                menor.mostrarInformacion();
            }
            System.out.println("\nLista de menores mayores de 5 años\n");
            for (Ninio menor : menores) {
                if (menor.getEdad() > 5) {
                    menor.mostrarInformacion();
                }
            }
        }
    }


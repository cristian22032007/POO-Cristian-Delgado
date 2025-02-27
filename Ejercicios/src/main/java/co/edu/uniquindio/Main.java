package co.edu.uniquindio;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Guarderia guarderia = new Guarderia("Pequeños Gigantes");

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("\n Menu interativo de la guarderia");
            System.out.println("1. Agregar Niño");
            System.out.println("2. Eliminar Niño");
            System.out.println("3. Actualizar Niño");
            System.out.println("4. Mostrar lista de Niños");
            System.out.println("5. Mostrar el niño con el nombre con mas vocales");
            System.out.println("6. Mostrar el niño con el nombre palindromo");
            System.out.println("7. Mostrar el niño con mas consonantes");
            System.out.println("8. Salir");

            //----------------------------------

            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


            if(opcion == 1) {
                System.out.println("Ingrese el nombre del Niño");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del Niño");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese el genero del Niño");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el documento del Niño");
                String documento = scanner.nextLine();
                System.out.println("Ingrese la alergia del Niño");
                String alergia = scanner.nextLine();
                System.out.println("Ingrese el nombre del acudiente del Niño");
                String acudiente = scanner.nextLine();
                System.out.println("Ingrese el numero de contacto del acudiente del Niño");
                String contactoAcudiente = scanner.nextLine();
                System.out.println("Ingrese el ID del Niño");
                String ID = scanner.nextLine();

                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, acudiente, contactoAcudiente, ID);
                guarderia.almacenarNinios(ninio);

            } else if (opcion == 2) {
                System.out.println("Ingrese ID del Niño a elimianr: ");
                String IDEliminarNinio = scanner.nextLine();
                guarderia.eliminarNinio(IDEliminarNinio);

            } else if (opcion == 3) {
                System.out.println("Ingrese el ID del Niño a actualizar: ");
                String IDActualizar = scanner.nextLine();

                System.out.println("Ingrese el nombre del Niño a actualizar: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del Niño a actualizar: ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese el genero del Niño a actualizar: ");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el documento del Niño a actualizar: ");
                String documento = scanner.nextLine();
                System.out.println("Ingrese la alergia del Niño a actualizar: ");
                String alergia = scanner.nextLine();
                System.out.println("Ingrese el nombre del acudiente del Niño a actualizar: ");
                String acudiente = scanner.nextLine();
                System.out.println("Ingrese el numero de contacto del acudiente del Niño a actualizar: ");
                String contactoAcudiente = scanner.nextLine();
                System.out.println("Ingrese el ID del Niño a actualizar: ");
                String ID = scanner.nextLine();

                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, acudiente, contactoAcudiente, ID);
                guarderia.actualizarNinio(IDActualizar, ninio);
            } else if (opcion == 4) {
                for(Ninio ninio : guarderia.getListNinios()){
                    System.out.println(ninio);
                }
            } else if (opcion == 5) {
                String ninioConMasVocales = "";
                int maxVocales = 0;

                for (Ninio ninio : guarderia.getListNinios()) {
                    String nombre = ninio.getNombres();
                    int vocales = Guarderia.contarVocales(nombre);

                    if (vocales > maxVocales) {
                        maxVocales = vocales;
                        ninioConMasVocales = nombre;
                    }
                }

                if (!ninioConMasVocales.isEmpty()) {
                    System.out.println("El niño con más vocales en su nombre es: " + ninioConMasVocales +
                            " con " + maxVocales + " vocales.");

                }
            }else if (opcion == 6) {
                String palindromo = "";

                for (Ninio ninio : guarderia.getListNinios()) {
                    String nombre = ninio.getNombres();

                    if (Guarderia.esPalindromo(nombre)) {
                        if (!palindromo.isEmpty()) {
                            palindromo = palindromo + ", ";
                        }
                        palindromo += nombre;
                    }

                }
                if (!palindromo.isEmpty()) {
                    System.out.println("El niño/s con nombre palindromo es/son: " + palindromo);
                }

            }else if (opcion == 7){
                String ninioConMasConsonantes = "";
                int maxConsonantes = 0;

                for (Ninio ninio : guarderia.getListNinios()) {
                    String nombre = ninio.getNombres();
                    int vocales = Guarderia.contarConsonantes(nombre);

                    if (vocales > maxConsonantes) {
                        maxConsonantes = vocales;
                        ninioConMasConsonantes = nombre;
                    }
                }

                if (!ninioConMasConsonantes.isEmpty()) {
                    System.out.println("El niño con más vocales en su nombre es: " + ninioConMasConsonantes +
                            " con " + maxConsonantes + " vocales.");

                }


            }else if (opcion == 8) {
                System.out.println("Chaooo pues.............. ");
                break;
            }else {
                System.out.println("Opcion no valida");
            }
        }
        scanner.close();
    }
}
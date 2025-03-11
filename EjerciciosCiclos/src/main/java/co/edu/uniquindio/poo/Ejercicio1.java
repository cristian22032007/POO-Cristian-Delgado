package co.edu.uniquindio.poo;

public class Ejercicio1 {
    //Imprimir los primeros 10 numeros naturales
    public static String numerosNaturales (){
        String numeros ="";
        for (int i =0; i<=10; i++){
            numeros += "El numeros es ; " + i + "\n";
        }
        return numeros;
    }
    public static void main(String[] args) {
        System.out.println(numerosNaturales());
    }
}


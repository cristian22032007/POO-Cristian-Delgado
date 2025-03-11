package co.edu.uniquindio.poo;

public class Ejercicio2 {
    public static int sumarNumeros(int numeros) {
        int i = 1;
        int suma = 0;
        while (i <= numeros) {
            suma += i;
            i++;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumarNumeros(10));

    }
}
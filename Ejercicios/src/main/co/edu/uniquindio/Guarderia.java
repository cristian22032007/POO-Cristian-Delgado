package Ejercicios.src.main.co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {

    private String nombres;
    private List<Ninio> listNinios;

    public Guarderia(String nombres) {
        this.nombres = nombres;
        this.listNinios = new ArrayList<>();
    }

    public boolean verificarNinio(Ninio ninio){
        boolean existe = true;
        for(Ninio ninios : listNinios){
            if(ninios.getID().equals(ninio.getID())){
                existe = false;
            }
        }
        return existe;
    }

    public void eliminarNinio(String ID){
        Boolean ninioEliminar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.remove(i);
                ninioEliminar = true;
                break;
            }
        }
    }

    public void actualizarNinio(String ID, Ninio ninio){
        boolean ninioActualizar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.set(i, ninio);
                ninioActualizar = true;
                break;
            }
        }
    }

    public void almacenarNinios(Ninio ninio) {
        if(verificarNinio(ninio)){
            listNinios.add(ninio);
            System.out.println("Niño almacenado com exito");
        }else{
            System.out.println("Niño ya esta almacenado");
        }
    }

    public static int contarVocales(String nombres) {
        int contador = 0;
        nombres = nombres.toLowerCase();
        for (char letra : nombres.toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esPalindromo(String nombre) {
        int longitud = nombre.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (nombre.charAt(i) != nombre.charAt(longitud - 1 - i)) {
                return false; // Si los caracteres no coinciden, no es palíndromo
            }
        }
        return true;
    }

    public static int contarConsonantes(String nombres) {
        int contador = 0;
        nombres = nombres.toLowerCase();
        for (char letra : nombres.toCharArray()) {
            if ("aeiou".indexOf(letra) == -1) {
                contador++;
            }
        }
        return contador;
    }
    @Override
    public String toString() {
        return "Guarderia{" +
                "nombres='" + nombres + '\'' +
                ", listNinios=" + listNinios +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        this.listNinios = listNinios;
    }
}

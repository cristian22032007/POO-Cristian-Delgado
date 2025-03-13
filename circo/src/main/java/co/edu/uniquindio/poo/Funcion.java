package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Acto;
import co.edu.uniquindio.poo.Cliente;
import co.edu.uniquindio.poo.Artista;
import java.util.ArrayList;
import java.util.List;


public class Funcion {
    private String nombre;
    private List<Cliente> listClientes;
    protected List<Acto> listActos;

    public Funcion (String nombre) {
    this.nombre = nombre;
    this.listClientes = new ArrayList<>();
    this.listActos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return "Funcion{\n" +
                "nombre: " + nombre + ", lista de Clientes: " + listClientes + ", lista de Actos: " + listActos +'}';
    }

}

package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Artista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acto{
    private String fecha;
    private String hora;
    private String lugar;
    private List<Artista>listparticipantes;

    public Acto(String fecha, String hora, String lugar){
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.listparticipantes = new ArrayList<>();
    }
    public void registrarArtista (Artista artista){
        this.listparticipantes.add(artista);
    }

    public String toString() {
    String participantes = "";
    for (Artista artista : listparticipantes) {
        participantes += artista.toString() + "\n";
    }
        return "Acto{\n"  +
                "Fecha: " + fecha + "\n" +
                "Hora: " + hora + "\n" +
                "Lugar: " + lugar + "\n" +
                "Lista de participantes: " + participantes + '}';
    }
}
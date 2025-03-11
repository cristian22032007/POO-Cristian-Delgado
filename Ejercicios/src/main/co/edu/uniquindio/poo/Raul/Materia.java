package Ejercicios.src.main.co.edu.uniquindio.poo.Raul;

import co.edu.uniquindio.poo.Docente;
import co.edu.uniquindio.poo.Estudiante;

import java.util.List;

public class Materia {

    private String nombre;
    private String id;
    private co.edu.uniquindio.poo.Docente docente;
    private List<co.edu.uniquindio.poo.Estudiante> listEstudiantes;

    public Materia(String nombre, String id, co.edu.uniquindio.poo.Docente docente, List<co.edu.uniquindio.poo.Estudiante> listEstudiantes) {
        this.nombre = nombre;
        this.id = id;
        this.docente = docente;
        this.listEstudiantes = listEstudiantes;
    }

    public void registrarEstudiantes(co.edu.uniquindio.poo.Estudiante estudiante) {
        listEstudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public co.edu.uniquindio.poo.Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<co.edu.uniquindio.poo.Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", docente=" + docente +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}

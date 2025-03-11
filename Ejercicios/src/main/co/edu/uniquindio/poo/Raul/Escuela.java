package Ejercicios.src.main.co.edu.uniquindio.poo.Raul;

import co.edu.uniquindio.poo.Docente;
import co.edu.uniquindio.poo.Estudiante;
import co.edu.uniquindio.poo.Materia;
import co.edu.uniquindio.poo.Nota;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private String nombre;
    private String id;
    private List<co.edu.uniquindio.poo.Docente> listDocentes;
    private List<Materia> listMaterias;
    private List<Nota> listNotas;
    private List<Estudiante> listEstudiantes;

    /**
     * Metodo constructor de la clase Escuela
     * @param nombre, id
     * @param
     */
    public Escuela(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listDocentes = new ArrayList<>();
        this.listMaterias = new ArrayList<>();
        this.listNotas = new ArrayList<>();
        this.listEstudiantes = new ArrayList<>();
    }

    /**
     * Metodo que permite registrar docentes a la escula
     * @param docente
     */
    public void registrarDocente(co.edu.uniquindio.poo.Docente docente) {
        listDocentes.add(docente);
    }

    /**
     * Metodo que permite registrar materias en la escuela
     * @param materia
     */
    public void registrarMateria(Materia materia) {
        listMaterias.add(materia);
    }

    public void registrarNota(Nota nota) {
        listNotas.add(nota);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        listEstudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public List<Nota> getListNotas() {
        return listNotas;
    }

    public void setListNotas(List<Nota> listNotas) {
        this.listNotas = listNotas;
    }

    public List<Materia> getListMaterias() {
        return listMaterias;
    }

    public void setListMaterias(List<Materia> listMaterias) {
        this.listMaterias = listMaterias;
    }

    public List<co.edu.uniquindio.poo.Docente> getListDocentes() {
        return listDocentes;
    }

    public void setListDocentes(List<Docente> listDocentes) {
        this.listDocentes = listDocentes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", listDocentes=" + listDocentes +
                ", listMaterias=" + listMaterias +
                ", listNotas=" + listNotas +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}

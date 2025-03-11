package Ejercicios.src.main.co.edu.uniquindio.poo.Raul;

import co.edu.uniquindio.poo.Docente;
import co.edu.uniquindio.poo.Escuela;
import co.edu.uniquindio.poo.Estudiante;
import co.edu.uniquindio.poo.Materia;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Escuela escuela = new Escuela("CASD", "123");

        //Creamos a los docentes
        co.edu.uniquindio.poo.Docente docente1 = new co.edu.uniquindio.poo.Docente("Raul Rivera", "Ingeniero");
        co.edu.uniquindio.poo.Docente docente2 = new Docente("Maria Gomez", "Licenciada");

        //Creamos a los estudiantes
        co.edu.uniquindio.poo.Estudiante estudiante1 = new co.edu.uniquindio.poo.Estudiante("Juan Rojas", 16);
        co.edu.uniquindio.poo.Estudiante estudiante2 = new co.edu.uniquindio.poo.Estudiante("Juliana Gonzalez", 17);
        co.edu.uniquindio.poo.Estudiante estudiante3 = new co.edu.uniquindio.poo.Estudiante("Camila Lopez", 15);
        co.edu.uniquindio.poo.Estudiante estudiante4 = new co.edu.uniquindio.poo.Estudiante("Pedro Jaramillo", 16);
        co.edu.uniquindio.poo.Estudiante estudiante5 = new co.edu.uniquindio.poo.Estudiante("Oscar Perez", 16);

        //Vamos agregar docentes a la escuela
        escuela.registrarDocente(docente1);
        escuela.registrarDocente(docente2);

        //Vamos agregar estudiantes a la escuela
        escuela.registrarEstudiante(estudiante1);
        escuela.registrarEstudiante(estudiante2);
        escuela.registrarEstudiante(estudiante3);
        escuela.registrarEstudiante(estudiante4);
        escuela.registrarEstudiante(estudiante5);

        //Asignar estudiantes a la materia
        List<Estudiante> estudiantesCurso = new ArrayList<>();
        estudiantesCurso.add(estudiante1);
        estudiantesCurso.add(estudiante3);
        estudiantesCurso.add(estudiante5);

        //Crear la materia
        co.edu.uniquindio.poo.Materia materia = new Materia("Programación 1", "003R", docente1, estudiantesCurso);

        escuela.registrarMateria(materia);

        System.out.println(materia.toString());

    }
}
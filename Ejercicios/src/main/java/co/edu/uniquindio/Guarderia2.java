package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Scanner;

public class Guarderia2 {
    private String nombreGuarderia;

    public Guarderia2 (String nombreGuarderia) {
        this.nombreGuarderia = nombreGuarderia;
    }
    public String getNombre() {
        return nombreGuarderia;
    }

    class GenerarGuarderia {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Guarderia2> Guarderias = new ArrayList<>();

        public void nombreGuarderia()

        {
            System.out.println("Ingrese el nombre de la Guarderia: ");
            String nombreGuarderia = scanner.nextLine();

            Guarderia2 Guarderia = new Guarderia2(nombreGuarderia);
            Guarderias.add(Guarderia);
        }
    }


}

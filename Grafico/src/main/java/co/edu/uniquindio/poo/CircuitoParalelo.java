package co.edu.uniquindio.poo;

import javax.swing.*;
import java.awt.*;

public class CircuitoParalelo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Nodo superior
        g.drawLine(50, 50, 300, 50);

        // R1
        g.drawRect(100, 40, 20, 20);
        g.drawString("R1", 105, 55);

        // R2
        g.drawLine(160, 50, 160, 100);
        g.drawRect(150, 100, 20, 20);
        g.drawString("R2", 155, 115);

        // Nodo inferior
        g.drawLine(50, 250, 300, 250);

        // R3 y R4 en paralelo
        g.drawLine(200, 50, 200, 150);  // Conexión superior a R3 y R4
        g.drawRect(190, 100, 20, 20);  // R3
        g.drawString("R3", 195, 115);
        g.drawLine(230, 50, 230, 150);  // Conexión superior a R4
        g.drawRect(220, 100, 20, 20);  // R4
        g.drawString("R4", 225, 115);

        // Uniendo R3 y R4 al nodo inferior
        g.drawLine(200, 150, 200, 250);
        g.drawLine(230, 150, 230, 250);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circuito Paralelo");
        CircuitoParalelo panel = new CircuitoParalelo();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
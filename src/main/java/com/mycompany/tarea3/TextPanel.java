/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

import javax.swing.JPanel;
import java.awt.Graphics;

public class TextPanel extends JPanel {

    private int x = 200;
    private int y = 200;
    private String texto = "Hice lo mejpr que pude profe :)";


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(texto, x, y);
    }

    public void moveText(int dx, int dy) {
        x += dx;
        y += dy;
        repaint();  
    }
}

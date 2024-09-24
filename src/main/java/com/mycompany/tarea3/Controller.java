/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener {

    private TextPanel textPanel;

    public Controller(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "UP":
                textPanel.moveText(0, -10); // Mover hacia arriba
                break;
            case "DOWN":
                textPanel.moveText(0, 10); // Mover hacia abajo
                break;
            case "LEFT":
                textPanel.moveText(-10, 0); // Mover hacia la izquierda
                break;
            case "RIGHT":
                textPanel.moveText(10, 0); // Mover hacia la derecha
                break;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    public ButtonPanel(ActionListener controller) {
        setLayout(new GridLayout(2, 2));

     
        JButton upButton = new JButton("Arriba");
        JButton downButton = new JButton("Abajo");
        JButton leftButton = new JButton("Izquierda");
        JButton rightButton = new JButton("Derecha");

    
        upButton.setActionCommand("UP");
        downButton.setActionCommand("DOWN");
        leftButton.setActionCommand("LEFT");
        rightButton.setActionCommand("RIGHT");

   
        upButton.addActionListener(controller);
        downButton.addActionListener(controller);
        leftButton.addActionListener(controller);
        rightButton.addActionListener(controller);

        
        add(upButton);
        add(downButton);
        add(leftButton);
        add(rightButton);
    }
}

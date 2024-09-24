/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea3;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private ButtonPanel buttonPanel;

    public MainFrame() {
        setTitle("Mover Frase");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textPanel = new TextPanel();
        Controller controller = new Controller(textPanel);
        
    
        buttonPanel = new ButtonPanel(controller);

    
        add(textPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

    
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

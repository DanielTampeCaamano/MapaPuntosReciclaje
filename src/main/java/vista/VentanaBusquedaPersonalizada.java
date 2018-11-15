/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel
 */
public class VentanaBusquedaPersonalizada extends JFrame implements ActionListener{
    PanelCentral panelSuperior;
    public VentanaBusquedaPersonalizada() {
        iniciarComponente();
    }

    private void iniciarComponente() {
        
        this.panelSuperior=new PanelCentral();
        this.add(this.panelSuperior,BorderLayout.CENTER);
        this.setSize(400, 400);
        this.setTitle("Busqueda Personalizada...");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
    }
    
}

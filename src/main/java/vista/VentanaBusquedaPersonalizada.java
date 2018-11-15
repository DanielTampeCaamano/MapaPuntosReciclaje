/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class VentanaBusquedaPersonalizada extends JFrame {
    PanelBusquedaPersonalizadaCentral panelSuperior;
    public VentanaBusquedaPersonalizada() {
        iniciarComponente();
    }

    private void iniciarComponente() {
        
        this.panelSuperior=new PanelBusquedaPersonalizadaCentral();
        this.add(this.panelSuperior,BorderLayout.CENTER);
        this.setSize(400, 400);
        this.setTitle("Busqueda Personalizada...");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
}

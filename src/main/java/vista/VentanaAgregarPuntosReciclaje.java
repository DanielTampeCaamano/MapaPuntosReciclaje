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
public class VentanaAgregarPuntosReciclaje extends JFrame  {

    PanelFormularioAgregarPuntosReciclaje panelFormularioPuntosReciclaje;

    public VentanaAgregarPuntosReciclaje() {
        iniciarComponente();
    }

    private void iniciarComponente() {
        this.panelFormularioPuntosReciclaje = new PanelFormularioAgregarPuntosReciclaje();
        this.add(this.panelFormularioPuntosReciclaje, BorderLayout.CENTER);
        this.setSize(400, 400);
        this.setTitle("Agregar Puntos de Reciclaje...");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


}

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
public class VentanaAgregarAdministrador extends JFrame {

    PanelAgregarAdministrador panelAgregarAdministrador;

    public VentanaAgregarAdministrador() {
        inciarComponente();
    }

    private void inciarComponente() {
        this.panelAgregarAdministrador = new PanelAgregarAdministrador();
        this.add(this.panelAgregarAdministrador, BorderLayout.CENTER);
        this.setSize(400, 400);
        this.setTitle("Agregar Administrador...");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

}

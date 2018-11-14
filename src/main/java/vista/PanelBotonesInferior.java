/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class PanelBotonesInferior extends JPanel implements ActionListener {

    JButton botonAgregarPuntoReciclaje;
    JButton botonAgregarAdministrador;
    JButton botonIniciarSesion;

    public PanelBotonesInferior() {
        inicializarComponente1();
    }

    private void inicializarComponente1() {
        this.botonIniciarSesion = new JButton("Iniciar Sesion...");
        this.botonIniciarSesion.addActionListener(this);
        this.add(this.botonIniciarSesion);
        this.botonAgregarAdministrador = new JButton("Agregar Administrador");
        this.botonAgregarAdministrador.addActionListener(this);
        this.botonAgregarAdministrador.setVisible(false);
        this.botonAgregarPuntoReciclaje = new JButton("Agregar Punto de Reciclaje");
        this.botonAgregarPuntoReciclaje.addActionListener(this);
        this.botonAgregarPuntoReciclaje.setVisible(false);
        this.add(this.botonAgregarAdministrador);
        this.add(this.botonAgregarPuntoReciclaje);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonIniciarSesion == evento.getSource()) {
            this.botonAgregarAdministrador.setVisible(true);
            this.botonAgregarPuntoReciclaje.setVisible(true);
            this.botonIniciarSesion.setVisible(false);
        }
    }

}

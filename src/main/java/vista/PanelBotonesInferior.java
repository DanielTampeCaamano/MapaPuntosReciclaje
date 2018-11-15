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

    private JButton botonAgregarPuntoReciclaje;
    private JButton botonAgregarAdministrador;
    JButton botonIniciarSesion;
    private JButton botonDesconectar;
    private VentanaLogin ventanaLogin;

    public PanelBotonesInferior() {
        inicializarComponente(1);
    }

    public PanelBotonesInferior(int caso) {
        inicializarComponente(caso);
    }

    private void inicializarComponente(int caso) {
        switch (caso) {
            case 1:
                this.botonIniciarSesion = new JButton("Iniciar Sesion");
                this.botonIniciarSesion.addActionListener(this);
                this.botonAgregarAdministrador = new JButton("Agregar Administrador");
                this.botonAgregarAdministrador.addActionListener(this);
                this.botonAgregarAdministrador.setVisible(false);
                this.botonAgregarPuntoReciclaje = new JButton("Agregar Punto de Reciclaje");
                this.botonAgregarPuntoReciclaje.addActionListener(this);
                this.botonAgregarPuntoReciclaje.setVisible(false);
                this.botonDesconectar = new JButton("Desconectar");
                this.botonDesconectar.addActionListener(this);
                this.botonDesconectar.setVisible(false);
                this.add(this.botonAgregarAdministrador);
                this.add(this.botonAgregarPuntoReciclaje);
                this.add(this.botonIniciarSesion);
                this.add(this.botonDesconectar);
                break;
            case 2:
                this.botonIniciarSesion = new JButton("Iniciar Sesion");
                this.botonIniciarSesion.addActionListener(this);
                this.botonIniciarSesion.setVisible(false);
                this.botonAgregarAdministrador = new JButton("Agregar Administrador");
                this.botonAgregarAdministrador.addActionListener(this);
                this.botonAgregarAdministrador.setVisible(true);
                this.botonAgregarPuntoReciclaje = new JButton("Agregar Punto de Reciclaje");
                this.botonAgregarPuntoReciclaje.addActionListener(this);
                this.botonAgregarPuntoReciclaje.setVisible(true);
                this.botonDesconectar = new JButton("Desconectar");
                this.botonDesconectar.addActionListener(this);
                this.botonDesconectar.setVisible(true);
                this.add(this.botonAgregarAdministrador);
                this.add(this.botonAgregarPuntoReciclaje);
                this.add(this.botonIniciarSesion);
                this.add(this.botonDesconectar);
                break;
        }

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonIniciarSesion == evento.getSource()) {
            this.ventanaLogin = new VentanaLogin();
            this.ventanaLogin.setVisible(true);
        } else if (this.botonDesconectar == evento.getSource()) {
            this.botonAgregarAdministrador.setVisible(false);
            this.botonAgregarPuntoReciclaje.setVisible(false);
            this.botonDesconectar.setVisible(false);
            this.botonIniciarSesion.setVisible(true);
        }else if(this.botonAgregarPuntoReciclaje==evento.getSource()){
            VentanaAgregarPuntosReciclaje ventanaAgregarPuntosReciclaje=new VentanaAgregarPuntosReciclaje();
            ventanaAgregarPuntosReciclaje.setVisible(true);
        }else if(this.botonAgregarAdministrador==evento.getSource()){
            VentanaAgregarAdministrador ventanaAgregarAdministrador=new VentanaAgregarAdministrador();
            ventanaAgregarAdministrador.setVisible(true);
        }
    }

}

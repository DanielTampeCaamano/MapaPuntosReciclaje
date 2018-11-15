/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class VentanaResultadosBusqueda extends JFrame implements ActionListener {
    PanelResultados panelResultados;
    public VentanaResultadosBusqueda() {
        iniciarComponente();
    }

    private void iniciarComponente() {
        FlowLayout distribucion=new FlowLayout();
        this.setLayout(distribucion);
        this.panelResultados=new PanelResultados(9);
        this.add(this.panelResultados);
        this.setSize(400, 400);
        this.setTitle("Resultados Busqueda");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaMapa ventanaMapa=new VentanaMapa();
        this.setVisible(false);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class VentanaResultadosBusqueda extends JFrame {

    PanelResultados panelResultados;

    public VentanaResultadosBusqueda() {
        iniciarComponente(null, null);
    }

    VentanaResultadosBusqueda(ArrayList<JCheckBox> listaCheckeados) {
        iniciarComponente(listaCheckeados, null);
    }

    VentanaResultadosBusqueda(ArrayList<JCheckBox> listaCheckeados, String direccion) {
        iniciarComponente(listaCheckeados,direccion);    }

    private void iniciarComponente(ArrayList<JCheckBox> listaCheckeados, String direccion) {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        if (listaCheckeados != null) {
            this.panelResultados = new PanelResultados(listaCheckeados);
            this.add(this.panelResultados);
        }else if(!"".equals(direccion)){
            this.panelResultados=new PanelResultados(direccion);
            this.add(this.panelResultados);
        }
        this.setSize(400, 400);
        this.setTitle("Resultados Busqueda");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}

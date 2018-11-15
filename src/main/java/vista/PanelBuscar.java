/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class PanelBuscar extends JPanel implements ActionListener{
    private JButton botonBuscar;
    private VentanaBusquedaPersonalizada ventanaBusquedaPersonalizada;
    public PanelBuscar() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        
        botonBuscar=new JButton("Buscar punto de reciclaje");
        botonBuscar.addActionListener(this);
        this.add(this.botonBuscar);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonBuscar==evento.getSource()) {
            ventanaBusquedaPersonalizada=new VentanaBusquedaPersonalizada();
            ventanaBusquedaPersonalizada.setVisible(true);
        }
    }
    
    
}

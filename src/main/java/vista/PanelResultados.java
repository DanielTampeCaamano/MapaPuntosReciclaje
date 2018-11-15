/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
class PanelResultados extends JPanel implements ActionListener{

    private int filas;

    public PanelResultados(int filas) {
        this.filas = filas;
        inicializarComponente();
    }

    private void inicializarComponente() {
        GridLayout distribucion = new GridLayout(this.filas, 0);
        this.setLayout(distribucion);
        for (int i = 0; i < this.filas; i++) {
            this.add(new JButton("Resultado"));
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

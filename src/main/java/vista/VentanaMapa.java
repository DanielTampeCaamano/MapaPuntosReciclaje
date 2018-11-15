/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel
 */
public class VentanaMapa extends JFrame implements ActionListener {

    public VentanaMapa() {//IMPLEMENTACION PENDIENTE,AUN NO ES MAPA REAL
        iniciarComponente();
    }

    private void iniciarComponente() {
        this.add(new JLabel(new ImageIcon("imagenes/PuntoMapa.jpg")));
        this.setSize(400, 400);
        this.setTitle("Mapa");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

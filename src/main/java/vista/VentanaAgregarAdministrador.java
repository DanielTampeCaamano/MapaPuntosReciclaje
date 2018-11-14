/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class VentanaAgregarAdministrador extends JFrame implements ActionListener{

    public VentanaAgregarAdministrador() {
        inciarComponente();
    }
        
    private void inciarComponente(){
    this.setSize(400, 400);
        this.setTitle("Busqueda Personalizada...");
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
class PanelAgregarAdministrador extends JPanel implements ActionListener{
    private JButton botonAgregar;
    private JButton botonVolver;
    private JLabel labelNombre;
    private JLabel labelApellido;
    private JLabel labelContrasena;
    private JTextField campoTextoNombre;
    private JTextField campoTextoApellido;
    private JTextField campoTextoContrasena;
    public PanelAgregarAdministrador() {
        iniciarComponente();
    }

    private void iniciarComponente() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.labelNombre = new JLabel("Nombre");
        this.campoTextoNombre = new JTextField(35);
        this.labelApellido = new JLabel("Apellido");
        this.campoTextoApellido = new JTextField(35);
        this.labelContrasena = new JLabel("Contrasena");
        this.campoTextoContrasena = new JTextField(35);
        this.botonAgregar=new JButton("Agregar");
        this.botonAgregar.addActionListener(this);
        this.botonVolver=new JButton("Volver");
        this.botonVolver.addActionListener(this);
        this.add(this.labelNombre);
        this.add(this.campoTextoNombre);
        this.add(this.labelApellido);
        this.add(this.campoTextoApellido);
        this.add(this.labelContrasena);
        this.add(this.campoTextoContrasena);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonAgregar==evento.getSource()) {
            
        }else if (this.botonVolver==evento.getSource()) {
            VentanaPrincipal ventanaPrincipal=new VentanaPrincipal();
        }
    }
}

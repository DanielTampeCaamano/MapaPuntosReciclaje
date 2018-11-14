/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Daniel
 */
public class VentanaLogin extends JFrame implements ActionListener {
    private JTextField usuario;
    private JTextField contraseña;
    private JLabel texto;
    private JLabel texto2;
    
    
    public VentanaLogin() {
        iniciarComponente();
    }
    
    private void iniciarComponente(){
    Container contentpane = getContentPane();
    contentpane.setLayout(new FlowLayout());
        
    this.setSize(450,230);
    this.setLocationRelativeTo(null);
    this.setTitle("Login");
    this.setVisible(true);
            
    this.texto= new JLabel("Nombre Y Apellido");
    this.texto.setBounds(10,40, 120, 10);
    this.texto2= new JLabel("Contraseña");
    this.texto2.setBounds(10,100, 120, 10);
    
    this.usuario=new JTextField ();
    this.usuario.setBounds(130,40 ,150, 20);
    this.contraseña=new JTextField();
    this.contraseña.setBounds(130,100 ,150, 20);
    
    contentpane.add(this.texto);
    contentpane.add(this.usuario);
    contentpane.add(this.texto2);
    contentpane.add(this.contraseña);
    
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

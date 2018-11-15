/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Daniel
 */
public class VentanaLogin extends JFrame implements ActionListener {
    private JTextField textFieldUsuario;
    private JTextField textFieldContraseña;
    private JLabel textoUsuario;
    private JLabel textoContraseña;
    private JButton botonIngresar;
    
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
            
    this.textoUsuario= new JLabel("Nombre Y Apellido");
    this.textoUsuario.setBounds(10,40, 120, 10);
    this.textoContraseña= new JLabel("Contraseña");
    this.textoContraseña.setBounds(10,100, 120, 10);
    
    this.textFieldUsuario=new JTextField ();
    this.textFieldUsuario.setBounds(130,40 ,150, 20);
    this.textFieldContraseña=new JTextField();
    this.textFieldContraseña.setBounds(130,100 ,150, 20);
    this.botonIngresar=new JButton("Ingresar");
    this.botonIngresar.addActionListener(this);
    
    contentpane.add(this.textoUsuario);
    contentpane.add(this.textFieldUsuario);
    contentpane.add(this.textoContraseña);
    contentpane.add(this.textFieldContraseña);
    contentpane.add(this.botonIngresar);
    
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonIngresar==evento.getSource()) {
            VentanaPrincipal ventanaPrincipal= new VentanaPrincipal(2);
            ventanaPrincipal.setVisible(true);
            this.dispose();
        }
    }
}

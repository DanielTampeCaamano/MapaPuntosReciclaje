/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class VentanaPrincipal extends JFrame{
    
    private PanelMenu panelMenu;
    private PanelBoton panelBoton;
    public VentanaPrincipal() {
        inicializarCompontente();
    }
    
    private void inicializarCompontente(){
        this.panelMenu=new PanelMenu();
        this.panelBoton=new PanelBoton();
        this.add(panelMenu,BorderLayout.WEST);
        this.add(this.panelBoton,BorderLayout.NORTH);
        
        this.setSize(500, 500);
        this.setTitle("MAPA DE PUNTOS DE RECICLAJE");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

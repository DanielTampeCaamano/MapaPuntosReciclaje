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
    private PanelBuscar panelBuscar;
    private PanelBotonesInferior panelBotonesInferior;
    public VentanaPrincipal() {
        inicializarCompontente();
    }
    
    private void inicializarCompontente(){
        this.panelMenu=new PanelMenu();
        this.panelBuscar=new PanelBuscar();
        this.panelBotonesInferior=new PanelBotonesInferior();
        this.add(this.panelMenu,BorderLayout.WEST);
        this.add(this.panelBuscar,BorderLayout.NORTH);
        this.add(this.panelBotonesInferior,BorderLayout.SOUTH);
        
        
        this.setSize(600, 650);
        this.setTitle("Mapa de Puntos de Reciclaje");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

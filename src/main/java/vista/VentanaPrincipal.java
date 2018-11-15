/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel
 */
public class VentanaPrincipal extends JFrame{
    
    private PanelMenu panelMenu;
    private PanelBuscar panelBuscar;
    private PanelBotonesInferior panelBotonesInferior;
    public VentanaPrincipal() {
        inicializarCompontente(1);
    }

    VentanaPrincipal(int caso) {
        inicializarCompontente(caso);
    }
    
    //public VentanaPrincipal() {
     //   inicializarCompontente();
    //}
    
    private void inicializarCompontente(int caso){
        this.panelMenu=new PanelMenu();
        this.panelBuscar=new PanelBuscar();
        this.panelBotonesInferior=new PanelBotonesInferior(caso);
        this.add(this.panelMenu,BorderLayout.WEST);
        this.add(this.panelBuscar,BorderLayout.NORTH);
        this.add(this.panelBotonesInferior,BorderLayout.SOUTH);
        this.add(new JLabel(new ImageIcon("Imagenes/MapaGeneral.jpg")));//IMPLEMENTACION PENDIENTE,AUN NO ES MAPA REAL
        
        
        this.setSize(600, 650);
        this.setTitle("Mapa de Puntos de Reciclaje");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    

    
    
}

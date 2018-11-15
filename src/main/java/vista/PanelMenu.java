/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Daniel
 */
public class PanelMenu extends JMenuBar implements ActionListener {

    VentanaResultadosBusqueda ventanaResultadosBusqueda;
    private JMenu menuPrincipal;
    private JMenu menuCuentaAdmin;
    private JMenuItem menuItemDesconectar;
    private JMenuItem menuItemVidrio;
    private JMenuItem menuItemMetal;
    private JMenuItem menuItemPapel;
    private JMenuItem menuItemPlastico;
    private JMenuItem menuItemBateriaPila;

    public PanelMenu() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.menuPrincipal = new JMenu("Menu");

        this.menuItemVidrio = new JMenuItem("Vidrio");
        this.menuItemVidrio.addActionListener(this);

        this.menuItemMetal = new JMenuItem("Metal");
        this.menuItemMetal.addActionListener(this);

        this.menuItemPapel = new JMenuItem("Papel");
        this.menuItemPapel.addActionListener(this);

        this.menuItemPlastico = new JMenuItem("Plastico");
        this.menuItemPlastico.addActionListener(this);

        this.menuItemBateriaPila = new JMenuItem("Bateria-Pila");
        this.menuItemBateriaPila.addActionListener(this);
        
        this.menuCuentaAdmin=new JMenu("Cuenta");
        
        this.menuItemDesconectar=new JMenuItem("Desconectar");
        this.menuItemDesconectar.addActionListener(this);

        this.menuPrincipal.add(this.menuItemVidrio);
        this.menuPrincipal.add(this.menuItemMetal);
        this.menuPrincipal.add(this.menuItemPapel);
        this.menuPrincipal.add(this.menuItemPlastico);
        this.menuPrincipal.add(this.menuItemBateriaPila);
        
        this.menuCuentaAdmin.add(this.menuItemDesconectar);

        this.add(this.menuPrincipal);
        this.add(this.menuCuentaAdmin,BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.menuItemVidrio == evento.getSource()) {

            this.ventanaResultadosBusqueda = new VentanaResultadosBusqueda();
            this.ventanaResultadosBusqueda.setVisible(true);

        } else if (this.menuItemMetal == evento.getSource()) {

            this.ventanaResultadosBusqueda = new VentanaResultadosBusqueda();
            this.ventanaResultadosBusqueda.setVisible(true);

        } else if (this.menuItemPapel == evento.getSource()) {

            this.ventanaResultadosBusqueda = new VentanaResultadosBusqueda();
            this.ventanaResultadosBusqueda.setVisible(true);

        } else if (this.menuItemPlastico == evento.getSource()) {

            this.ventanaResultadosBusqueda = new VentanaResultadosBusqueda();
            this.ventanaResultadosBusqueda.setVisible(true);

        } else if (this.menuItemBateriaPila == evento.getSource()) {

            this.ventanaResultadosBusqueda = new VentanaResultadosBusqueda();
            this.ventanaResultadosBusqueda.setVisible(true);

        }else if (this.menuItemDesconectar==evento.getSource()) {
            
        }
    }

}

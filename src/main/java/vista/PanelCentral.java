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
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
class PanelCentral extends JPanel implements ActionListener {
    private JButton botonBuscar;
    private JLabel labelDireccion;
    private JLabel labelPosicion;
    private JLabel labelCategorias;
    private JTextField campoTextoDireccion;
    private JTextField campoTextoCoordenadas;
    private JCheckBox cajaCheckeosCategorias;
    private JCheckBoxMenuItem cajaCheckeoCategoria;

    public PanelCentral() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.labelDireccion = new JLabel("Direccion");
        this.campoTextoDireccion = new JTextField(35);
        this.labelPosicion = new JLabel("Posicion");
        this.campoTextoCoordenadas = new JTextField(35);
        this.labelCategorias = new JLabel("Categorias");
        this.cajaCheckeosCategorias = new JCheckBox();
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria1");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria2");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria3");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria4");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria5");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.botonBuscar=new JButton("Buscar");
        this.botonBuscar.addActionListener(this);
        this.add(this.labelDireccion);
        this.add(this.campoTextoDireccion);
        this.add(this.labelPosicion);
        this.add(this.campoTextoCoordenadas);
        this.add(this.labelCategorias);
        this.add(this.cajaCheckeosCategorias);
        this.add(this.botonBuscar);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonBuscar==evento.getSource()) {
            VentanaResultadosBusqueda ventanaResultadosBusqueda=new VentanaResultadosBusqueda();
            ventanaResultadosBusqueda.setVisible(true);
        }
    }

}

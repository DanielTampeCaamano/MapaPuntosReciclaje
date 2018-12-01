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
import java.util.ArrayList;
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
class PanelBusquedaPersonalizadaCentral extends JPanel implements ActionListener {

    private JButton botonBuscar;
    private JLabel labelDireccion;
    private JLabel labelPosicion;
    private JLabel labelCategorias;
    private JTextField campoTextoDireccion;
    private JTextField campoTextoCoordenadas;
    private JCheckBox cajaCheckeosCategorias1;
    private JCheckBox cajaCheckeosCategorias2;
    private JCheckBox cajaCheckeosCategorias3;
    private JCheckBox cajaCheckeosCategorias4;
    private JCheckBox cajaCheckeosCategorias5;
    private ArrayList<JCheckBox> listaCategorias;
    //private JCheckBoxMenuItem cajaCheckeoCategoria;

    public PanelBusquedaPersonalizadaCentral() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        listaCategorias = new ArrayList<>();
        this.labelDireccion = new JLabel("Direccion");
        this.campoTextoDireccion = new JTextField(35);
        this.labelPosicion = new JLabel("Posicion");
        this.campoTextoCoordenadas = new JTextField(35);
        this.campoTextoCoordenadas.setToolTipText("Ejemplo: 12.3456, -123.4567 ");
        this.botonBuscar = new JButton("Buscar");
        this.labelCategorias = new JLabel("Categorias");
        this.cajaCheckeosCategorias1 = new JCheckBox("Categoria 1");
        this.cajaCheckeosCategorias2 = new JCheckBox("Categoria 2");
        this.cajaCheckeosCategorias3 = new JCheckBox("Categoria 3");
        this.cajaCheckeosCategorias4 = new JCheckBox("Categoria 4");
        this.cajaCheckeosCategorias5 = new JCheckBox("Categoria 5");
        listaCategorias.add(cajaCheckeosCategorias1);
        listaCategorias.add(cajaCheckeosCategorias2);
        listaCategorias.add(cajaCheckeosCategorias3);
        listaCategorias.add(cajaCheckeosCategorias4);
        listaCategorias.add(cajaCheckeosCategorias5);
        /*this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria1");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria2");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria3");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria4");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);
        this.cajaCheckeoCategoria = new JCheckBoxMenuItem("categoria5");
        this.cajaCheckeosCategorias.add(cajaCheckeoCategoria);*/
        this.botonBuscar.addActionListener(this);
        this.add(this.labelDireccion);
        this.add(this.campoTextoDireccion);
        this.add(this.labelPosicion);
        this.add(this.campoTextoCoordenadas);
        this.add(this.labelCategorias);
        for (int i = 0; i < listaCategorias.size(); i++) {
            this.add(listaCategorias.get(i));
        }
        /*this.add(this.cajaCheckeosCategorias1);
        this.add(this.cajaCheckeosCategorias2);
        this.add(this.cajaCheckeosCategorias3);
        this.add(this.cajaCheckeosCategorias4);
        this.add(this.cajaCheckeosCategorias5);*/
        this.add(this.botonBuscar);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonBuscar == evento.getSource()) {
            ArrayList<JCheckBox> listaCheckeados = new ArrayList<>();
            for (int i = 0; i < this.listaCategorias.size(); i++) {
                if (listaCategorias.get(i).isSelected()) {
                    listaCheckeados.add(listaCategorias.get(i));
                }
            }
            String direccion="";
            if (this.campoTextoDireccion.getText() != null) {
                direccion = this.campoTextoDireccion.getText();
            }
            /*if (this.campoTextoCoordenadas.getText() != null) {
                String coordenadas = this.campoTextoCoordenadas.getText();
            }*/
            
            VentanaResultadosBusqueda ventanaResultadosBusqueda
                    = new VentanaResultadosBusqueda(listaCheckeados,direccion);
            ventanaResultadosBusqueda.setVisible(true);
        }
    }

}

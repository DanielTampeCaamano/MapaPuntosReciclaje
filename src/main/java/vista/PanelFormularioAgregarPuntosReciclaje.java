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
class PanelFormularioAgregarPuntosReciclaje extends JPanel implements ActionListener{
    private JButton botonAgregar;
    private JButton botonVolver;
    private JLabel labelDireccion;
    private JLabel labelPosicion;
    private JLabel labelCategorias;
    private JLabel labelNumeroVisitas;
    private JLabel labelCantidadReciclada;
    private JTextField campoTextoDireccion;
    private JTextField campoTextoCoordenadas;
    private JTextField campoTextoNumeroVisitas;
    private JTextField campoTextoCantidadReciclada;
    private JCheckBox cajaCheckeosCategorias;
    private JCheckBoxMenuItem cajaCheckeoItemCategoria1;
    private JCheckBoxMenuItem cajaCheckeoItemCategoria2;
    private JCheckBoxMenuItem cajaCheckeoItemCategoria3;
    private JCheckBoxMenuItem cajaCheckeoItemCategoria4;
    private JCheckBoxMenuItem cajaCheckeoItemCategoria5;
    
    public PanelFormularioAgregarPuntosReciclaje() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.labelDireccion = new JLabel("Direccion");
        this.campoTextoDireccion = new JTextField(35);
        this.labelPosicion = new JLabel("Posicion");
        this.campoTextoCoordenadas = new JTextField(35);
        this.labelNumeroVisitas = new JLabel("Numero Visitas");
        this.campoTextoNumeroVisitas = new JTextField(35);
        this.labelCantidadReciclada = new JLabel("Cantidad Reciclada");
        this.campoTextoCantidadReciclada = new JTextField(35);
        this.labelCategorias = new JLabel("Categorias");
        this.cajaCheckeosCategorias = new JCheckBox();
        this.cajaCheckeoItemCategoria1 = new JCheckBoxMenuItem("categoria1");
        this.cajaCheckeosCategorias.add(cajaCheckeoItemCategoria1);
        this.cajaCheckeoItemCategoria2 = new JCheckBoxMenuItem("categoria2");
        this.cajaCheckeosCategorias.add(cajaCheckeoItemCategoria2);
        this.cajaCheckeoItemCategoria3 = new JCheckBoxMenuItem("categoria3");
        this.cajaCheckeosCategorias.add(cajaCheckeoItemCategoria3);
        this.cajaCheckeoItemCategoria4 = new JCheckBoxMenuItem("categoria4");
        this.cajaCheckeosCategorias.add(cajaCheckeoItemCategoria4);
        this.cajaCheckeoItemCategoria5 = new JCheckBoxMenuItem("categoria5");
        this.cajaCheckeosCategorias.add(cajaCheckeoItemCategoria5);
        this.botonAgregar=new JButton("Agregar");
        this.botonAgregar.addActionListener(this);
        this.botonVolver=new JButton("Volver");
        this.botonVolver.addActionListener(this);
        this.add(this.labelDireccion);
        this.add(this.campoTextoDireccion);
        this.add(this.labelPosicion);
        this.add(this.campoTextoCoordenadas);
        this.add(this.labelNumeroVisitas);
        this.add(this.campoTextoNumeroVisitas);
        this.add(this.labelCantidadReciclada);
        this.add(this.campoTextoCantidadReciclada);
        this.add(this.labelCategorias);
        this.add(this.cajaCheckeosCategorias);
        this.add(this.botonAgregar);
        this.add(this.botonVolver);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.botonVolver==evento.getSource()) {
            VentanaPrincipal VentanaPrincipal = new VentanaPrincipal(2);
            VentanaPrincipal.setVisible(true);
        }else if (this.botonAgregar==evento.getSource()) {
            
        }
    }
    
}

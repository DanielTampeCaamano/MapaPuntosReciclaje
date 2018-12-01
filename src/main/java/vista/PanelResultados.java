/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
class PanelResultados extends JPanel implements ActionListener {

    private int filas;
    private ArrayList<JButton> resultados;
    private JButton resultado1;

    PanelResultados(ArrayList<JCheckBox> listaCheckeados) {
        inicializarComponente(listaCheckeados,null);
    }

    PanelResultados(String direccion) {
        inicializarComponente(null,direccion);    }

    private void inicializarComponente(ArrayList<JCheckBox> listaCheckeados,String direccion) {
        
        filas=1;
        GridLayout distribucion = new GridLayout(this.filas, 0);
        this.setLayout(distribucion);
        /*for (int i = 0; i < filas; i++) {
            JButton resultado = new JButton("Resultado");
            resultado.addActionListener(this);
            //resultados.add(e)
        }*/

        resultado1 = new JButton("Resultado");
        resultado1.addActionListener(this);
        /*resultado3 = new JButton("Resultado");
        resultado3.addActionListener(this);
        resultado4 = new JButton("Resultado");
        resultado4.addActionListener(this);
        resultado5 = new JButton("Resultado");
        resultado5.addActionListener(this);
        resultado6 = new JButton("Resultado");
        resultado6.addActionListener(this);
        resultado7 = new JButton("Resultado");
        resultado7.addActionListener(this);
        resultado8 = new JButton("Resultado");
        resultado8.addActionListener(this);
        resultado9 = new JButton("Resultado");
        resultado9.addActionListener(this);*/
        this.add(resultado1);
        /*this.add(resultado2);
        this.add(resultado3);
        this.add(resultado4);
        this.add(resultado5);
        this.add(resultado6);
        this.add(resultado7);
        this.add(resultado8);
        this.add(resultado9);*/

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (this.resultado1 == evento.getSource()) {
            String[] args = null;
            //VentanaMapa ventanaMapa = new VentanaMapa();
            //ventanaMapa.setVisible(true);
            Launcher.main(args);
        }/* else if (this.resultado2 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado3 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado4 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado5 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado6 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado7 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado8 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        } else if (this.resultado9 == evento.getSource()) {
            VentanaMapa ventanaMapa = new VentanaMapa();
            ventanaMapa.setVisible(true);
        }*/
    }

}

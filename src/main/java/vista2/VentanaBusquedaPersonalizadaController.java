/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class VentanaBusquedaPersonalizadaController implements Initializable {

    @FXML
    private TextField campoTextoDireccion;
    @FXML
    private TextField campoTextoLatitud;
    @FXML
    private TextField campoTextoLongitud;
    @FXML
    private CheckBox checkBoxVidrio;
    @FXML
    private CheckBox checkBoxMetal;
    @FXML
    private CheckBox checkBoxPapel;
    @FXML
    private CheckBox checkBoxPlastico;
    @FXML
    private CheckBox checkBoxBateriaPila;
    @FXML
    private Button botonBuscar;
    @FXML
    private Button botonVolver;

    /**
     * Initializes the controller class.
     *
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        inicializarComponentes();
    }    
    
    public void inicializarComponentes(){
    
    
    }
}

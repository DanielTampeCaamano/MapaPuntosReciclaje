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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class VentanaEditarPuntosReciclajeController implements Initializable {

    @FXML
    private TextField campoTextoDireccion;
    @FXML
    private TextField campoTextoLatitud;
    @FXML
    private TextField campoTextoLongitud;
    @FXML
    private TextField campoTextoNumeroVisitas;
    @FXML
    private TextField campoTextoCantidadReciclada;
    @FXML
    private Text texto;
    @FXML
    private Label labelDireccion;
    @FXML
    private Label labelLatitud;
    @FXML
    private Label labelLongitud;
    @FXML
    private Label labelNumeroVisitas;
    @FXML
    private Label labelCantidadReciclada;
    @FXML
    private Button botonEliminar;
    @FXML
    private Button botonEditar;
    @FXML
    private Button botonAgregar;
    @FXML
    private Button botonVolver;
    @FXML
    private CheckBox checkBoxVidrio;
    @FXML
    private Label labelCategorias;
    @FXML
    private CheckBox checkBoxMetal;
    @FXML
    private CheckBox checkBoxPapel;
    @FXML
    private CheckBox checkBoxPlastico;
    @FXML
    private CheckBox checkBoxBateriaPila;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

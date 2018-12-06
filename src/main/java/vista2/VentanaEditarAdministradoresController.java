/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class VentanaEditarAdministradoresController implements Initializable {

    @FXML
    private ImageView imagenFondo;
    @FXML
    private Text textoTitulo;
    @FXML
    private TextField campoTextoNombre;
    @FXML
    private TextField campoTextoApellido;
    @FXML
    private TextField campoTextoContrasena;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelApellido;
    @FXML
    private Label labelContrasena;
    @FXML
    private Button botonAgregar;
    @FXML
    private Button botonEditar;
    @FXML
    private Button botonBorrar;
    @FXML
    private Button botonVolver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        botonAgregar.setOnMouseClicked((new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {

            }
        }));
    }    
    
}

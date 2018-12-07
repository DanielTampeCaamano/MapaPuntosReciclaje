/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
        botonBuscar.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaResultados.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Resultados Busqueda");
                    ventana.setResizable(false);
                    ventana.show();
                    Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    ventanaActual.close();
                } catch (IOException ex) {
                    Logger.getLogger(MapaVentanaPrincipalController2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }));
        botonVolver.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                ventanaActual.close();
            }
        }));
    }

}

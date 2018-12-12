/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import modelo.PuntoReciclaje;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class VentanaResultadosController implements Initializable {

    @FXML
    private Button botonMostrarMapa;
    @FXML
    private Button botonVolver;
    private GridPane gridPane;
    @FXML
    private ScrollPane ScrollPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
        botonMostrarMapa.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaMapaResultados.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Resultados Busqueda");
                    ventana.setResizable(false);
                    ventana.initOwner(ventanaActual.getOwner());
                    ventana.show();
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
                Stage ventanaAnterior = (Stage) ventanaActual.getOwner();
                ventanaAnterior.show();
                ventanaActual.close();

            }
        }));
    }
}

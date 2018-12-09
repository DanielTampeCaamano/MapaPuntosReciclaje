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
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
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
    private TableView<PuntoReciclaje> vistaTabla;
    @FXML
    private TableColumn<PuntoReciclaje, String> tablaColumnaResultados;
    @FXML
    private Button botonMostrarMapa;
    @FXML
    private Button botonVolver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        ArrayList<PuntoReciclaje> coincidenciasPtosReciclaje = PuntoReciclaje.mostrarCoincidenciasPuntosReciclaje();
        vistaTabla = new TableView<>((ObservableList<PuntoReciclaje>) coincidenciasPtosReciclaje);
        tablaColumnaResultados = new TableColumn<>("Dirección");
        tablaColumnaResultados.setCellValueFactory((CellDataFeatures<PuntoReciclaje, String> parametroCelda)
                -> new ReadOnlyObjectWrapper(parametroCelda.getValue().getDireccion()));
        vistaTabla.getColumns().add(tablaColumnaResultados);

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
                Stage ventanaAnterior =(Stage)ventanaActual.getOwner();
                ventanaActual.close();
                ventanaAnterior.show();
            }
        }));
    }
}

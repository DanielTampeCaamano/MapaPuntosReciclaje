/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modelo.Categoria;
import modelo.PuntoReciclaje;

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
                ArrayList<Categoria> categorias = new ArrayList<>();
                if (checkBoxVidrio.isSelected()) {
                    categorias.add(Categoria.VIDRIO);
                }
                if (checkBoxMetal.isSelected()) {
                    categorias.add(Categoria.METAL);
                }
                if (checkBoxPapel.isSelected()) {
                    categorias.add(Categoria.PAPEL);
                }
                if (checkBoxPlastico.isSelected()) {
                    categorias.add(Categoria.PLASTICO);
                }
                if (checkBoxBateriaPila.isSelected()) {
                    categorias.add(Categoria.BATERIAPILA);
                }
                if (!campoTextoDireccion.getText().isEmpty()) {
                    String direccion = campoTextoDireccion.getText();
                } else {
                    String direccion = " ";
                }
                try {
                    PuntoReciclaje criterioPuntoReciclaje = new PuntoReciclaje(campoTextoDireccion.getText(),
                            Double.parseDouble(campoTextoLatitud.getText()), Double.parseDouble(campoTextoLongitud.getText()),
                            categorias, 0, 0);
                    ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                    ArrayList<PuntoReciclaje> coincidencias = ptosReciclajeAlmacenados;
                            ptosReciclajeAlmacenados.forEach((PuntoReciclaje ptoAlmacenado) -> {
                        if (!ptoAlmacenado.getDireccion().trim().equalsIgnoreCase(criterioPuntoReciclaje.getDireccion().trim())
                                && (ptoAlmacenado.getLatitud() != criterioPuntoReciclaje.getLatitud()
                                || ptoAlmacenado.getLongitud() != criterioPuntoReciclaje.getLongitud())
                                && !ptoAlmacenado.getCategorias().equals(criterioPuntoReciclaje.getCategorias())) {
                            coincidencias.remove(ptoAlmacenado);
                        }

                    });
                    PuntoReciclaje.guardarCoincidenciasPuntosReciclaje((ArrayList<PuntoReciclaje>) coincidencias);
                } catch (Exception ex) {
                    PuntoReciclaje criterioPuntoReciclaje = new PuntoReciclaje("", 0, 0, new ArrayList<>());
                    ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                    ArrayList<PuntoReciclaje> coincidencias = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                    ptosReciclajeAlmacenados.forEach((PuntoReciclaje ptoAlmacenado) -> {
                        if (!ptoAlmacenado.getDireccion().trim().equalsIgnoreCase(criterioPuntoReciclaje.getDireccion().trim())
                                && (ptoAlmacenado.getLatitud() != criterioPuntoReciclaje.getLatitud()
                                || ptoAlmacenado.getLongitud() != criterioPuntoReciclaje.getLongitud())
                                && !ptoAlmacenado.getCategorias().equals(criterioPuntoReciclaje.getCategorias())) {
                            coincidencias.remove(ptoAlmacenado);
                        }

                    });
                    PuntoReciclaje.guardarCoincidenciasPuntosReciclaje(coincidencias);
                }
                iniciarVentanaResultadosBusqueda();
            }
        }));
        botonVolver.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Stage antiguaVentana = (Stage) ventanaActual.getOwner();
                antiguaVentana.show();
                ventanaActual.close();
            }
        }));
    }

    public void iniciarVentanaResultadosBusqueda() {
        ArrayList<PuntoReciclaje> coincidenciasPtosReciclaje = PuntoReciclaje.mostrarCoincidenciasPuntosReciclaje();
        ArrayList<Button> listaBotonesResultados = new ArrayList<>();

        coincidenciasPtosReciclaje.forEach(coincidenciaAlmacenada -> {

            Button botonResultado = new Button(coincidenciaAlmacenada.getDireccion());
            botonResultado.setOnMouseClicked((new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    PuntoReciclaje.guardarResultadoPuntoReciclaje(coincidenciaAlmacenada);
                    try {
                        Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Parent root;
                        root = FXMLLoader.load(getClass().getResource("/fxml/VentanaMapaResultados.fxml"));
                        Stage ventana = new Stage();
                        ventana.setScene(new Scene(root));
                        ventana.setTitle("Mapa del Resultado de Busqueda...");
                        ventana.setResizable(false);
                        ventana.initOwner(ventanaActual.getOwner());
                        ventana.show();
                        ventanaActual.hide();

                    } catch (IOException ex) {
                        Logger.getLogger(MapaVentanaPrincipalController2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }));
            listaBotonesResultados.add(botonResultado);
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        listaBotonesResultados.forEach(boton -> {
            gridPane.add(boton, 0, listaBotonesResultados.indexOf(boton));
        });
        ScrollPane scrollPane = new ScrollPane(gridPane);

        Stage ventanaActual = (Stage) (botonBuscar.getScene().getWindow());
        //            Parent root;
        //            root = FXMLLoader.load(getClass().getResource("/fxml/VentanaResultados.fxml"));
        Stage ventana = new Stage();
        ventana.setScene(new Scene(scrollPane));
        ventana.setTitle("Resultados Busqueda");
        ventana.setResizable(false);
        ventana.initOwner(ventanaActual);
        ventana.show();
    }
}

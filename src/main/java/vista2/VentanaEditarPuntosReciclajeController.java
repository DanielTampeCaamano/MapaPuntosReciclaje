/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Categoria;
import modelo.PuntoReciclaje;

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
        botonAgregar.setOnMouseClicked((new EventHandler<MouseEvent>() {
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
                PuntoReciclaje nuevoPtoReciclaje;
                if (campoTextoCantidadReciclada.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Integer.parseInt(campoTextoNumeroVisitas.getText()));
                } else if (campoTextoNumeroVisitas.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Double.parseDouble(campoTextoCantidadReciclada.getText()));
                } else if (campoTextoCantidadReciclada.getText().isEmpty()
                        && campoTextoNumeroVisitas.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias);
                } else {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Double.parseDouble(campoTextoCantidadReciclada.getText()),
                                    Integer.parseInt(campoTextoNumeroVisitas.getText()));
                }

                PuntoReciclaje.guardarDatosPuntoReciclaje(nuevoPtoReciclaje);
            }
        }));
        botonEditar.setOnMouseClicked((new EventHandler<MouseEvent>() {
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
                PuntoReciclaje nuevoPtoReciclaje;
                if (campoTextoCantidadReciclada.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Integer.parseInt(campoTextoNumeroVisitas.getText()));
                } else if (campoTextoNumeroVisitas.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Double.parseDouble(campoTextoCantidadReciclada.getText()));
                } else if (campoTextoCantidadReciclada.getText().isEmpty()
                        && campoTextoNumeroVisitas.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias);
                } else {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Double.parseDouble(campoTextoCantidadReciclada.getText()),
                                    Integer.parseInt(campoTextoNumeroVisitas.getText()));
                }

                PuntoReciclaje.editarDatosPuntoReciclaje(nuevoPtoReciclaje);
            }
        }));
        botonEliminar.setOnMouseClicked((new EventHandler<MouseEvent>() {
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
                PuntoReciclaje nuevoPtoReciclaje;
                if (campoTextoCantidadReciclada.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Integer.parseInt(campoTextoNumeroVisitas.getText()));
                } else if (campoTextoNumeroVisitas.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Double.parseDouble(campoTextoCantidadReciclada.getText()));
                } else if (campoTextoCantidadReciclada.getText().isEmpty()
                        && campoTextoNumeroVisitas.getText().isEmpty()) {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias);
                } else {
                    nuevoPtoReciclaje
                            = new PuntoReciclaje(campoTextoDireccion.getText(),
                                    Double.parseDouble(campoTextoLatitud.getText()),
                                    Double.parseDouble(campoTextoLongitud.getText()),
                                    categorias,
                                    Double.parseDouble(campoTextoCantidadReciclada.getText()),
                                    Integer.parseInt(campoTextoNumeroVisitas.getText()));
                }
                PuntoReciclaje.borrarDatosPuntoReciclaje(nuevoPtoReciclaje);
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

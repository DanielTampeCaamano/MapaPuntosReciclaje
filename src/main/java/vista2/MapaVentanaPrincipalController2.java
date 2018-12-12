package vista2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modelo.Categoria;
import modelo.PuntoReciclaje;

public class MapaVentanaPrincipalController2 implements Initializable, MapComponentInitializedListener {

    @FXML
    private GoogleMapView mapView;

    private GoogleMap map;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu menu;
    @FXML
    private MenuItem menuItemVidrio;
    @FXML
    private MenuItem menuItemMetal;
    @FXML
    private MenuItem menuItemPapel;
    @FXML
    private MenuItem menuItemPlastico;
    @FXML
    private MenuItem menuItemBateriaPila;
    @FXML
    private Button botonIniciarSesion;
    @FXML
    private Button botonEditarAdministradores;
    @FXML
    private Button botonEditarPuntosReciclaje;
    @FXML
    private Button botonBusquedaPersonalizada;
    @FXML
    private Button botonDesconectar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mapView.setKey("AIzaSyCX8GgArvBnK-lnUJs8oJAOU-_QmV0v_74");
        mapView.addMapInializedListener(this);
    }

    @Override
    public void mapInitialized() {
        //Set the initial properties of the map.
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(new LatLong(-38.7320304, -72.5970569))
                .mapType(MapTypeIdEnum.ROADMAP)
                .overviewMapControl(false)
                .mapTypeControl(true)
                .panControl(false)
                .rotateControl(false)
                .scaleControl(false)
                .streetViewControl(false)
                .zoomControl(true)
                .zoom(13);
        map = mapView.createMap(mapOptions);
        botonBusquedaPersonalizada.setVisible(true);
        menuBar.setVisible(true);
        botonIniciarSesion.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaLogin.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Login");
                    ventana.setResizable(false);
                    ventana.show();
                    Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    ventanaActual.close();
                } catch (IOException ex) {
                    Logger.getLogger(MapaVentanaPrincipalController2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }));
        botonDesconectar.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                botonDesconectar.setVisible(false);
                botonEditarAdministradores.setVisible(false);
                botonEditarPuntosReciclaje.setVisible(false);
                botonIniciarSesion.setVisible(true);
            }
        }));
        botonBusquedaPersonalizada.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                try {

                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaBusquedaPersonalizada.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Busqueda Personalizada");
                    ventana.setResizable(false);
                    ventana.initOwner(ventanaActual);
                    ventana.show();
                } catch (IOException ex) {
                    Logger.getLogger(MapaVentanaPrincipalController2.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }));
        botonEditarAdministradores.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaEditarAdministradores.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Editar Administradores...");
                    ventana.setResizable(false);
                    ventana.show();
                } catch (IOException ex) {
                    Logger.getLogger(MapaVentanaPrincipalController2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }));
        botonEditarPuntosReciclaje.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaEditarPuntosReciclaje.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Editar Puntos de Riciclaje...");
                    ventana.setResizable(false);
                    ventana.show();
                } catch (IOException ex) {
                    Logger.getLogger(MapaVentanaPrincipalController2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }));
        menuItemVidrio.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                ArrayList<PuntoReciclaje> coincidenciasPorAlmacenar = ptosReciclajeAlmacenados;

                for (PuntoReciclaje ptoAlmacenado : ptosReciclajeAlmacenados) {
                    int contador = 0;
                    for (Categoria categoria : ptoAlmacenado.getCategorias()) {
                        if (categoria.equals(Categoria.VIDRIO)) {
                            contador = 1;
                        }
                    }
                    if (contador == 0) {
                        coincidenciasPorAlmacenar.remove(ptoAlmacenado);
                    }
                }
                PuntoReciclaje.guardarCoincidenciasPuntosReciclaje(coincidenciasPorAlmacenar);

                iniciarVentana();
            }
        }));
        menuItemMetal.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                ArrayList<PuntoReciclaje> coincidenciasPorAlmacenar = ptosReciclajeAlmacenados;

                for (PuntoReciclaje ptoAlmacenado : ptosReciclajeAlmacenados) {
                    int contador = 0;
                    for (Categoria categoria : ptoAlmacenado.getCategorias()) {
                        if (categoria.equals(Categoria.METAL)) {
                            contador = 1;
                        }
                    }
                    if (contador == 0) {
                        coincidenciasPorAlmacenar.remove(ptoAlmacenado);
                    }
                }
                PuntoReciclaje.guardarCoincidenciasPuntosReciclaje(coincidenciasPorAlmacenar);

                iniciarVentana();
            }
        }));
        menuItemPapel.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                ArrayList<PuntoReciclaje> coincidenciasPorAlmacenar = ptosReciclajeAlmacenados;

                for (PuntoReciclaje ptoAlmacenado : ptosReciclajeAlmacenados) {
                    int contador = 0;
                    for (Categoria categoria : ptoAlmacenado.getCategorias()) {
                        if (categoria.equals(Categoria.PAPEL)) {
                            contador = 1;
                        }
                    }
                    if (contador == 0) {
                        coincidenciasPorAlmacenar.remove(ptoAlmacenado);
                    }
                }
                PuntoReciclaje.guardarCoincidenciasPuntosReciclaje(coincidenciasPorAlmacenar);

                iniciarVentana();
            }
        }));
        menuItemPlastico.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                ArrayList<PuntoReciclaje> coincidenciasPorAlmacenar = ptosReciclajeAlmacenados;

                for (PuntoReciclaje ptoAlmacenado : ptosReciclajeAlmacenados) {
                    int contador = 0;
                    for (Categoria categoria : ptoAlmacenado.getCategorias()) {
                        if (categoria.equals(Categoria.PLASTICO)) {
                            contador = 1;
                        }
                    }
                    if (contador == 0) {
                        coincidenciasPorAlmacenar.remove(ptoAlmacenado);
                    }
                }
                PuntoReciclaje.guardarCoincidenciasPuntosReciclaje(coincidenciasPorAlmacenar);

                iniciarVentana();
            }
        }));
        menuItemBateriaPila.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<PuntoReciclaje> ptosReciclajeAlmacenados = PuntoReciclaje.mostrarDatosPuntosReciclaje();
                ArrayList<PuntoReciclaje> coincidenciasPorAlmacenar = ptosReciclajeAlmacenados;

                for (PuntoReciclaje ptoAlmacenado : ptosReciclajeAlmacenados) {
                    int contador = 0;
                    for (Categoria categoria : ptoAlmacenado.getCategorias()) {
                        if (categoria.equals(Categoria.BATERIAPILA)) {
                            contador = 1;
                        }
                    }
                    if (contador == 0) {
                        coincidenciasPorAlmacenar.remove(ptoAlmacenado);
                    }
                }
                PuntoReciclaje.guardarCoincidenciasPuntosReciclaje(coincidenciasPorAlmacenar);
                iniciarVentana();
            }
        }));
    }

    public void iniciarVentana() {
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
        
        Stage ventanaActual = (Stage) (menuBar.getScene().getWindow());
        Stage ventana = new Stage();
        ventana.setScene(new Scene(scrollPane));
        ventana.setTitle("Resultados Busqueda");
        ventana.setResizable(false);
        ventana.initOwner(ventanaActual);
        ventana.show();
    }
}

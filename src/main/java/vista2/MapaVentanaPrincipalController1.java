package vista2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.Animation;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MapaVentanaPrincipalController1 implements Initializable, MapComponentInitializedListener {

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
        //LatLong joeSmithLocation = new LatLong(-38.7320304, -72.5970569);

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
                try {
                    Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/VentanaBusquedaPersonalizada.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Busqueda Personalizada");
                    ventana.setResizable(false);
                    ventana.initOwner(ventanaActual);
                    ventana.show();
                    ventanaActual.hide();
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
        //Add markers to the map
//        MarkerOptions markerOptions1 = new MarkerOptions();
//        markerOptions1.position(joeSmithLocation).animation(Animation.BOUNCE);
//        Marker joeSmithMarker = new Marker(markerOptions1);
//        map.addMarker(joeSmithMarker);
//        InfoWindowOptions infoWindowOptions1 = new InfoWindowOptions();
//        infoWindowOptions1.content("<h2>Plaza Anibal Pinto</h2>"
//                + "Current Location: Safeway<br>"
//                + "ETA: 45 minutes");
//        InfoWindow joeSmithInfoWindow = new InfoWindow(infoWindowOptions1);
//        joeSmithInfoWindow.open(map, joeSmithMarker);
//        
    }
}

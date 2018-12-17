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
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modelo.Categoria;
import modelo.PuntoReciclaje;

public class VentanaMapaResultadosController implements Initializable, MapComponentInitializedListener {

    @FXML
    private GoogleMapView mapView;

    private GoogleMap map;
    PuntoReciclaje ptoReciclaje;
    LatLong resultadoPtoReciclaje;
    @FXML
    private Button botonVolver;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        mapView.setKey("AIzaSyCX8GgArvBnK-lnUJs8oJAOU-_QmV0v_74");
        mapView.addMapInializedListener(this);
    }

    @Override
    public void mapInitialized() {
        ptoReciclaje = PuntoReciclaje.mostrarResultadoPuntoReciclaje();
        double latitud = ptoReciclaje.getLatitud();
        double longitud = ptoReciclaje.getLongitud();
        resultadoPtoReciclaje = new LatLong(latitud, longitud);
        //LatLong joeSmithLocation = new LatLong(-38.7320304, -72.5970569);
//        PuntoReciclaje ptoReciclaje = PuntoReciclaje.mostrarResultadoPuntoReciclaje();
        //String categorias="";
        //ptoReciclaje.getCategorias().forEach((Categoria x)->categorias+=x.toString()+",");
//        LatLong resultadoPtoReciclaje = new LatLong(ptoReciclaje.getLatitud(), ptoReciclaje.getLongitud());
        //Set the initial properties of the map.
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(new LatLong(/*(ptoReciclaje.getLatitud()+0.0000001)*/-38.7320304, -72.5970569/*(ptoReciclaje.getLongitud()+0.0000001)*/))
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
        //Add markers to the map
        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions1.position(resultadoPtoReciclaje);
        Marker posResultadoPtoReciclaje = new Marker(markerOptions1);
        map.addMarker(posResultadoPtoReciclaje);
        InfoWindowOptions infoWindowOptions1 = new InfoWindowOptions();
        infoWindowOptions1.content("<h2>" + ptoReciclaje.getLatitud() + ","
                + ptoReciclaje.getLongitud() + "</h2>"
                + ptoReciclaje.getDireccion() + "<br>"
                + ptoReciclaje.getCategorias().toString() + "<br>"
                + "Cantidad de veces visitada: " + ptoReciclaje.getCantidadVecesVisitada() + "<br>"
                + "Cantidad de Kg reciclados: " + ptoReciclaje.getCantidadReciclada() + "<br>"
        );
        InfoWindow infoResultadoPtoReciclaje = new InfoWindow(infoWindowOptions1);
        infoResultadoPtoReciclaje.open(map, posResultadoPtoReciclaje);
        botonVolver.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                iniciarVentanaResultadosBusqueda();
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
                        ventana.setTitle("RecyclApp - Mapa del Resultado de Busqueda...");
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

        Stage ventanaActual = (Stage) (botonVolver.getScene().getWindow());
        //            Parent root;
        //            root = FXMLLoader.load(getClass().getResource("/fxml/VentanaResultados.fxml"));
        Stage ventana = new Stage();
        ventana.setScene(new Scene(scrollPane,200,200));
        ventana.setTitle("RecyclApp - Resultados Busqueda");
        ventana.setResizable(false);
        ventana.initOwner(ventanaActual);
        ventana.show();
        ventanaActual.close();
    }
}

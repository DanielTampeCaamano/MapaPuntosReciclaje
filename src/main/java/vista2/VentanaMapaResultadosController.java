package vista2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import modelo.Categoria;
import modelo.PuntoReciclaje;

public class VentanaMapaResultadosController implements Initializable, MapComponentInitializedListener {

    @FXML
    private GoogleMapView mapView;

    private GoogleMap map;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mapView.setKey("AIzaSyCX8GgArvBnK-lnUJs8oJAOU-_QmV0v_74");
        mapView.addMapInializedListener(this);
    }

    @Override
    public void mapInitialized() {
        //LatLong joeSmithLocation = new LatLong(-38.7320304, -72.5970569);
        PuntoReciclaje ptoReciclaje = PuntoReciclaje.mostrarResultadoPuntoReciclaje();
        //String categorias="";
        //ptoReciclaje.getCategorias().forEach((Categoria x)->categorias+=x.toString()+",");
        LatLong resultadoPtoReciclaje = new LatLong(ptoReciclaje.getLatitud(), ptoReciclaje.getLongitud());
        //Set the initial properties of the map.
        MapOptions mapOptions = new MapOptions();
        mapOptions.center(resultadoPtoReciclaje)
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
        infoWindowOptions1.content("<h2>" + ptoReciclaje.getDireccion() + "</h2>"
                + ptoReciclaje.getLatitud() + "," + ptoReciclaje.getLongitud() + "<br>"
                + ptoReciclaje.getCategorias().toString() + "<br>"
                + "Cantidad de veces visitada: " + ptoReciclaje.getCantidadVecesVisitada()
                + ", Cantidad de Kg reciclados: " + ptoReciclaje.getCantidadReciclada() + "<br>");
        InfoWindow infoResultadoPtoReciclaje = new InfoWindow(infoWindowOptions1);
        infoResultadoPtoReciclaje.open(map, posResultadoPtoReciclaje);

    }
}

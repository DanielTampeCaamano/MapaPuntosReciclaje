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
        LatLong joeSmithLocation = new LatLong(-38.7320304, -72.5970569);
//    LatLong joshAndersonLocation = new LatLong(47.6297, -122.3431);
//    LatLong bobUnderwoodLocation = new LatLong(47.6397, -122.3031);
//    LatLong tomChoiceLocation = new LatLong(47.6497, -122.3325);
//    LatLong fredWilkieLocation = new LatLong(47.6597, -122.3357);

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
        //Add markers to the map
        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions1.position(joeSmithLocation);

//        MarkerOptions markerOptions2 = new MarkerOptions();
//        markerOptions2.position(joshAndersonLocation);
//
//        MarkerOptions markerOptions3 = new MarkerOptions();
//        markerOptions3.position(bobUnderwoodLocation);
//
//        MarkerOptions markerOptions4 = new MarkerOptions();
//        markerOptions4.position(tomChoiceLocation);
//
//        MarkerOptions markerOptions5 = new MarkerOptions();
//        markerOptions5.position(fredWilkieLocation);
        Marker joeSmithMarker = new Marker(markerOptions1);
//        Marker joshAndersonMarker = new Marker(markerOptions2);
//        Marker bobUnderwoodMarker = new Marker(markerOptions3);
//        Marker tomChoiceMarker = new Marker(markerOptions4);
//        Marker fredWilkieMarker = new Marker(markerOptions5);
        map.addMarker(joeSmithMarker);
//        map.addMarker(joshAndersonMarker);
//        map.addMarker(bobUnderwoodMarker);
//        map.addMarker(tomChoiceMarker);
//        map.addMarker(fredWilkieMarker);
        InfoWindowOptions infoWindowOptions1 = new InfoWindowOptions();
        infoWindowOptions1.content("<h2>Temuco</h2>"
                + "Current Location: Av.Caupolican<br>"
                + "ETA: 45 minutes");
//        InfoWindowOptions infoWindowOptions2 = new InfoWindowOptions();
//        infoWindowOptions2.content("<h2>Fred Wilkie</h2>"
//                + "Current Location: Safeway<br>"
//                + "ETA: 45 minutes");
//        InfoWindowOptions infoWindowOptions3 = new InfoWindowOptions();
//        infoWindowOptions3.content("<h2>Fred Wilkie</h2>"
//                + "Current Location: Safeway<br>"
//                + "ETA: 45 minutes");
//        InfoWindowOptions infoWindowOptions4 = new InfoWindowOptions();
//        infoWindowOptions4.content("<h2>Fred Wilkie</h2>"
//                + "Current Location: Safeway<br>"
//                + "ETA: 45 minutes");
//        InfoWindowOptions infoWindowOptions5 = new InfoWindowOptions();
//        infoWindowOptions5.content("<h2>Fred Wilkie</h2>"
//                + "Current Location: Safeway<br>"
//                + "ETA: 45 minutes");
        InfoWindow joeSmithInfoWindow = new InfoWindow(infoWindowOptions1);
        joeSmithInfoWindow.open(map, joeSmithMarker);
//        InfoWindow joshAndersonInfoWindow = new InfoWindow(infoWindowOptions5);
//        joshAndersonInfoWindow.open(map, joshAndersonMarker);
//        InfoWindow bobUnderwoodInfoWindow = new InfoWindow(infoWindowOptions5);
//        bobUnderwoodInfoWindow.open(map, bobUnderwoodMarker);
//        InfoWindow tomChoiceInfoWindow = new InfoWindow(infoWindowOptions5);
//        tomChoiceInfoWindow.open(map, tomChoiceMarker);
//        InfoWindow fredWilkeInfoWindow = new InfoWindow(infoWindowOptions5);
//        fredWilkeInfoWindow.open(map, fredWilkieMarker);
    }
}
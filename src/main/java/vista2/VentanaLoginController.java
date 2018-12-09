/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import datos.ArchivoJson;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Administrador;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class VentanaLoginController implements Initializable {

    @FXML
    private ImageView ImagenFondo;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelApellido;
    @FXML
    private Label labelContrasena;
    @FXML
    private TextField campoTextoNombre;
    @FXML
    private TextField campoTextoApellido;
    @FXML
    private TextField campoTextoContrasena;
    @FXML
    private Text titulo;
    @FXML
    private Button botonIngresar;
    @FXML
    private Button botonCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        botonIngresar.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
//                Administrador admin = new Administrador(campoTextoNombre.getText(),
//                        campoTextoApellido.getText(), campoTextoContrasena.getText());
//                ArrayList<Administrador> administradores = Administrador.mostrarDatosAdministrador();
//                administradores.forEach((Administrador adminRegistrado) -> {
//                    if (adminRegistrado.getNombreAdministrador().equalsIgnoreCase(admin.getNombreAdministrador())
//                            && adminRegistrado.getApellidoAdministrador().equalsIgnoreCase(admin.getApellidoAdministrador())
//                            && adminRegistrado.getContrasena().equalsIgnoreCase(admin.getContrasena())) {
                        try {
                            Parent root;
                            root = FXMLLoader.load(getClass().getResource("/fxml/MapaVentanaPrincipal2.fxml"));
                            Stage ventana = new Stage();
                            ventana.setScene(new Scene(root));
                            ventana.setTitle("Mapa de Puntos de Reciclaje");
                            ventana.setResizable(false);
                            ventana.show();
                            Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            ventanaActual.close();
                        } catch (IOException ex) {
                            Logger.getLogger(MapaVentanaPrincipalController1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
//                });
//            }
        }));
        botonCancelar.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("/fxml/MapaVentanaPrincipal1.fxml"));
                    Stage ventana = new Stage();
                    ventana.setScene(new Scene(root));
                    ventana.setTitle("Mapa de Puntos de Reciclaje");
                    ventana.setResizable(false);
                    ventana.show();
                    Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    ventanaActual.close();
                } catch (IOException ex) {
                    Logger.getLogger(MapaVentanaPrincipalController1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class VentanaResultadosController implements Initializable {
    
    
    @FXML
    private TableView<?> vistaTabla;
    @FXML
    private TableColumn<?, ?> tablaColumnaResultados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        inicializarComponentes();
    }    
    
    public void inicializarComponentes(){
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import modelo.Administrador;

/**
 *
 * @author Daniel
 */
public class AdministradorTest {

    ArrayList<Administrador> listaAdmins;

    public AdministradorTest() {
    }

    @Before
    public void setUp() {

    }

    /**
     * Test of guardarDatosAdministrador method, of class Administrador.
     */
    @Test
    public void testGuardarDatosAdministrador() {
        System.out.println("guardarDatosAdministrador");
        Administrador adminIgresado = new Administrador("jose", "perez","1234");
        Administrador.guardarDatosAdministrador(adminIgresado);
    }

    /**
     * Test of mostrarDatosAdministrador method, of class Administrador.
     */
    @Test
    public void testMostrarDatosAdministrador() {
        System.out.println("mostrarDatosAdministrador");
        ArrayList<Administrador> result = Administrador.mostrarDatosAdministrador();
        assertNotNull(result);
    }

    /**
     * Test of editarDatosAdministradorContrasenaNueva method, of class
     * Administrador.
     */
    @Test
    public void testEditarDatosAdministradorContrasenaNueva() {
        System.out.println("editarDatosAdministradorContrasenaNueva");
        Administrador adminIngresado = new Administrador("jose", "perez","1234");
        Administrador.editarDatosAdministradorContrasenaNueva(adminIngresado);
    }

    /**
     * Test of borrarDatosAdministrador method, of class Administrador.
     */
    @Test
    public void testBorrarDatosAdministrador() {
        System.out.println("borrarDatosAdministrador");
        Administrador adminIngresado = new Administrador("jose", "perez","1234");
        Administrador.borrarDatosAdministrador(adminIngresado);
    }

    

}

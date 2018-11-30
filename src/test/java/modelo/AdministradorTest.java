/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class AdministradorTest {
    
    public AdministradorTest() {
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getNombreAdministrador method, of class Administrador.
     */
    @Test
    public void testGetNombreAdministrador() {
        System.out.println("getNombreAdministrador");
        Administrador instance = null;
        String expResult = "";
        String result = instance.getNombreAdministrador();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidoAdministrador method, of class Administrador.
     */
    @Test
    public void testGetApellidoAdministrador() {
        System.out.println("getApellidoAdministrador");
        Administrador instance = null;
        String expResult = "";
        String result = instance.getApellidoAdministrador();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreAdministrador method, of class Administrador.
     */
    @Test
    public void testSetNombreAdministrador() {
        System.out.println("setNombreAdministrador");
        String nombreAdministrador = "";
        Administrador instance = null;
        instance.setNombreAdministrador(nombreAdministrador);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidoAdministrador method, of class Administrador.
     */
    @Test
    public void testSetApellidoAdministrador() {
        System.out.println("setApellidoAdministrador");
        String apellidoAdministrador = "";
        Administrador instance = null;
        instance.setApellidoAdministrador(apellidoAdministrador);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasena method, of class Administrador.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Administrador instance = null;
        instance.setContrasena(contrasena);
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarDatosAdministrador method, of class Administrador.
     */
    @Test
    public void testGuardarDatosAdministrador() {
        System.out.println("guardarDatosAdministrador");
        String nombreAdministrador = "";
        String apellidoAdministrador = "";
        String contrasena = "";
        Administrador.guardarDatosAdministrador(nombreAdministrador, apellidoAdministrador, contrasena);
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarDatosAdministrador method, of class Administrador.
     */
    @Test
    public void testMostrarDatosAdministrador() {
        System.out.println("mostrarDatosAdministrador");
        String nombreAdministrador = "";
        String apellidoAdministrador = "";
        String expResult = "";
        String result = Administrador.mostrarDatosAdministrador(nombreAdministrador, apellidoAdministrador);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarDatosAdministradorContrasenaNueva method, of class Administrador.
     */
    @Test
    public void testEditarDatosAdministradorContrasenaNueva() {
        System.out.println("editarDatosAdministradorContrasenaNueva");
        String nombreAdministrador = "";
        String apellidoAdministrador = "";
        String contrasenaNueva = "";
        Administrador.editarDatosAdministradorContrasenaNueva(nombreAdministrador, apellidoAdministrador, contrasenaNueva);
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarDatosAdministrador method, of class Administrador.
     */
    @Test
    public void testBorrarDatosAdministrador() {
        System.out.println("borrarDatosAdministrador");
        String nombreAdministrador = "";
        String apellidoAdministrador = "";
        Administrador.borrarDatosAdministrador(nombreAdministrador, apellidoAdministrador);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Administrador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Administrador instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

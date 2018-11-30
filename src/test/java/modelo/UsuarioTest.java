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
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNumeroUsuario method, of class Usuario.
     */
    @Test
    public void testSetNumeroUsuario() {
        System.out.println("setNumeroUsuario");
        int numeroUsuario = 0;
        Usuario instance = new Usuario();
        instance.setNumeroUsuario(numeroUsuario);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroUsuario method, of class Usuario.
     */
    @Test
    public void testGetNumeroUsuario() {
        System.out.println("getNumeroUsuario");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getNumeroUsuario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarDatosUsuario method, of class Usuario.
     */
    @Test
    public void testGuardarDatosUsuario() {
        System.out.println("guardarDatosUsuario");
        int numeroUsuario = 0;
        Usuario.guardarDatosUsuario(numeroUsuario);
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarDatosUsuario method, of class Usuario.
     */
    @Test
    public void testMostrarDatosUsuario() {
        System.out.println("mostrarDatosUsuario");
        int numeroUsuario = 0;
        String expResult = "";
        String result = Usuario.mostrarDatosUsuario(numeroUsuario);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarDatosUsuario method, of class Usuario.
     */
    @Test
    public void testEditarDatosUsuario() {
        System.out.println("editarDatosUsuario");
        int numeroUsuario = 0;
        int numeroUsuarioNuevo = 0;
        Usuario.editarDatosUsuario(numeroUsuario, numeroUsuarioNuevo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarDatosUsuario method, of class Usuario.
     */
    @Test
    public void testBorrarDatosUsuario() {
        System.out.println("borrarDatosUsuario");
        int numeroUsuario = 0;
        Usuario.borrarDatosUsuario(numeroUsuario);
        fail("The test case is a prototype.");
    }
    
}

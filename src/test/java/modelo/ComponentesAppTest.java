/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class ComponentesAppTest {
    
    public ComponentesAppTest() {
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getMapas method, of class ComponentesApp.
     */
    @Test
    public void testGetMapas() {
        System.out.println("getMapas");
        ComponentesApp instance = new ComponentesApp();
        ArrayList<Mapa> expResult = null;
        ArrayList<Mapa> result = instance.getMapas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMapas method, of class ComponentesApp.
     */
    @Test
    public void testSetMapas() {
        System.out.println("setMapas");
        ArrayList<Mapa> mapas = null;
        ComponentesApp instance = new ComponentesApp();
        instance.setMapas(mapas);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class ComponentesApp.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        ComponentesApp instance = new ComponentesApp();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getUsuarios();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarios method, of class ComponentesApp.
     */
    @Test
    public void testSetUsuarios() {
        System.out.println("setUsuarios");
        ArrayList<Usuario> usuarios = null;
        ComponentesApp instance = new ComponentesApp();
        instance.setUsuarios(usuarios);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdministradores method, of class ComponentesApp.
     */
    @Test
    public void testGetAdministradores() {
        System.out.println("getAdministradores");
        ComponentesApp instance = new ComponentesApp();
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = instance.getAdministradores();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdministradores method, of class ComponentesApp.
     */
    @Test
    public void testSetAdministradores() {
        System.out.println("setAdministradores");
        ArrayList<Administrador> administradores = null;
        ComponentesApp instance = new ComponentesApp();
        instance.setAdministradores(administradores);
        fail("The test case is a prototype.");
    }
    
}

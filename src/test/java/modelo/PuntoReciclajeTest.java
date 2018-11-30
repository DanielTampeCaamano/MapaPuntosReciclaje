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
public class PuntoReciclajeTest {
    
    public PuntoReciclajeTest() {
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getDireccion method, of class PuntoReciclaje.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        PuntoReciclaje instance = null;
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLatitud method, of class PuntoReciclaje.
     */
    @Test
    public void testGetLatitud() {
        System.out.println("getLatitud");
        PuntoReciclaje instance = null;
        double expResult = 0.0;
        double result = instance.getLatitud();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongitud method, of class PuntoReciclaje.
     */
    @Test
    public void testGetLongitud() {
        System.out.println("getLongitud");
        PuntoReciclaje instance = null;
        double expResult = 0.0;
        double result = instance.getLongitud();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorias method, of class PuntoReciclaje.
     */
    @Test
    public void testGetCategorias() {
        System.out.println("getCategorias");
        PuntoReciclaje instance = null;
        ArrayList<Categoria> expResult = null;
        ArrayList<Categoria> result = instance.getCategorias();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadReciclada method, of class PuntoReciclaje.
     */
    @Test
    public void testGetCantidadReciclada() {
        System.out.println("getCantidadReciclada");
        PuntoReciclaje instance = null;
        double expResult = 0.0;
        double result = instance.getCantidadReciclada();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadVecesVisitada method, of class PuntoReciclaje.
     */
    @Test
    public void testGetCantidadVecesVisitada() {
        System.out.println("getCantidadVecesVisitada");
        PuntoReciclaje instance = null;
        int expResult = 0;
        int result = instance.getCantidadVecesVisitada();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class PuntoReciclaje.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        PuntoReciclaje instance = null;
        instance.setDireccion(direccion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLatitud method, of class PuntoReciclaje.
     */
    @Test
    public void testSetLatitud() {
        System.out.println("setLatitud");
        double latitud = 0.0;
        PuntoReciclaje instance = null;
        instance.setLatitud(latitud);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLongitud method, of class PuntoReciclaje.
     */
    @Test
    public void testSetLongitud() {
        System.out.println("setLongitud");
        double longitud = 0.0;
        PuntoReciclaje instance = null;
        instance.setLongitud(longitud);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategorias method, of class PuntoReciclaje.
     */
    @Test
    public void testSetCategorias() {
        System.out.println("setCategorias");
        ArrayList<Categoria> categorias = null;
        PuntoReciclaje instance = null;
        instance.setCategorias(categorias);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadReciclada method, of class PuntoReciclaje.
     */
    @Test
    public void testSetCantidadReciclada() {
        System.out.println("setCantidadReciclada");
        double cantidadReciclada = 0.0;
        PuntoReciclaje instance = null;
        instance.setCantidadReciclada(cantidadReciclada);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadVecesVisitada method, of class PuntoReciclaje.
     */
    @Test
    public void testSetCantidadVecesVisitada() {
        System.out.println("setCantidadVecesVisitada");
        int cantidadVecesVisitada = 0;
        PuntoReciclaje instance = null;
        instance.setCantidadVecesVisitada(cantidadVecesVisitada);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PuntoReciclaje.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PuntoReciclaje instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

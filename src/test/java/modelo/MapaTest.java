/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class MapaTest {
    
    public MapaTest() {
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of buscarPuntosReciclajeMedianteDireccion method, of class Mapa.
     */
    @Test
    public void testBuscarPuntosReciclajeMedianteDireccion() {
        System.out.println("buscarPuntosReciclajeMedianteDireccion");
        String direccion = "";
        Mapa instance = new Mapa();
        ArrayList<PuntoReciclaje> expResult = null;
        ArrayList<PuntoReciclaje> result = instance.buscarPuntosReciclajeMedianteDireccion(direccion);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPuntosReciclajeMedianteCategoria method, of class Mapa.
     */
    @Test
    public void testBuscarPuntosReciclajeMedianteCategoria() {
        System.out.println("buscarPuntosReciclajeMedianteCategoria");
        String categoria = "";
        Mapa instance = new Mapa();
        ArrayList<PuntoReciclaje> expResult = null;
        ArrayList<PuntoReciclaje> result = instance.buscarPuntosReciclajeMedianteCategoria(categoria);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarPuntoReciclajeMapa method, of class Mapa.
     */
    @Test
    public void testGuardarPuntoReciclajeMapa_6args() {
        System.out.println("guardarPuntoReciclajeMapa");
        String direccion = "";
        double latitud = 0.0;
        double longitud = 0.0;
        ArrayList<Categoria> categorias = null;
        double cantidadReciclada = 0.0;
        int cantidadVecesVisitada = 0;
        Mapa instance = new Mapa();
        instance.guardarPuntoReciclajeMapa(direccion, latitud, longitud, categorias, cantidadReciclada, cantidadVecesVisitada);
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarPuntoReciclajeMapa method, of class Mapa.
     */
    @Test
    public void testGuardarPuntoReciclajeMapa_4args() {
        System.out.println("guardarPuntoReciclajeMapa");
        String direccion = "";
        double latitud = 0.0;
        double longitud = 0.0;
        ArrayList<Categoria> categorias = null;
        Mapa instance = new Mapa();
        instance.guardarPuntoReciclajeMapa(direccion, latitud, longitud, categorias);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPuntoReciclajeLocacionNueva method, of class Mapa.
     */
    @Test
    public void testEditarPuntoReciclajeLocacionNueva() {
        System.out.println("editarPuntoReciclajeLocacionNueva");
        String direccion = "";
        String direccionNueva = "";
        double latitudNueva = 0.0;
        double longitudNueva = 0.0;
        Mapa instance = new Mapa();
        instance.editarPuntoReciclajeLocacionNueva(direccion, direccionNueva, latitudNueva, longitudNueva);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPuntoReciclajeCambioCategorias method, of class Mapa.
     */
    @Test
    public void testEditarPuntoReciclajeCambioCategorias() {
        System.out.println("editarPuntoReciclajeCambioCategorias");
        String direccion = "";
        ArrayList<Categoria> categorias = null;
        Mapa instance = new Mapa();
        instance.editarPuntoReciclajeCambioCategorias(direccion, categorias);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPuntoReciclajeCantidadRecicladaNueva method, of class Mapa.
     */
    @Test
    public void testEditarPuntoReciclajeCantidadRecicladaNueva() {
        System.out.println("editarPuntoReciclajeCantidadRecicladaNueva");
        String direccion = "";
        double cantidadReciclada = 0.0;
        Mapa instance = new Mapa();
        instance.editarPuntoReciclajeCantidadRecicladaNueva(direccion, cantidadReciclada);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPuntoReciclajeCantidadVecesVisitada method, of class Mapa.
     */
    @Test
    public void testEditarPuntoReciclajeCantidadVecesVisitada() {
        System.out.println("editarPuntoReciclajeCantidadVecesVisitada");
        String direccion = "";
        int cantidadVecesVisitada = 0;
        Mapa instance = new Mapa();
        instance.editarPuntoReciclajeCantidadVecesVisitada(direccion, cantidadVecesVisitada);
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerInformacionMapaComoString method, of class Mapa.
     */
    @Test
    public void testLeerInformacionMapaComoString() {
        System.out.println("leerInformacionMapaComoString");
        Mapa instance = new Mapa();
        String expResult = "";
        String result = instance.leerInformacionMapaComoString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerInformacionMapaComoListaString method, of class Mapa.
     */
    @Test
    public void testLeerInformacionMapaComoListaString() {
        System.out.println("leerInformacionMapaComoListaString");
        Mapa instance = new Mapa();
        List<String> expResult = null;
        List<String> result = instance.leerInformacionMapaComoListaString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarInformacionMapa method, of class Mapa.
     */
    @Test
    public void testBorrarInformacionMapa() {
        System.out.println("borrarInformacionMapa");
        Mapa instance = new Mapa();
        instance.borrarInformacionMapa();
        fail("The test case is a prototype.");
    }
    
}

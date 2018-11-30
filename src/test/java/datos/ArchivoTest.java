/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class ArchivoTest {
    
    public ArchivoTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of crearDirectorio method, of class Archivo.
     */
    @Test
    public void testCrearDirectorio() {
        System.out.println("crearDirectorio");
        String rutaDirectorio = "";
        Archivo.crearDirectorio(rutaDirectorio);
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearArchivo method, of class Archivo.
     */
    @Test
    public void testCrearArchivo() {
        System.out.println("crearArchivo");
        String rutaArchivo = "";
        String texto = "";
        Archivo.crearArchivo(rutaArchivo, texto);
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerArchivoComoString method, of class Archivo.
     */
    @Test
    public void testLeerArchivoComoString() {
        System.out.println("leerArchivoComoString");
        String rutaArchivo = "";
        String expResult = "";
        String result = Archivo.leerArchivoComoString(rutaArchivo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerArchivoComoListaString method, of class Archivo.
     */
    @Test
    public void testLeerArchivoComoListaString() {
        System.out.println("leerArchivoComoListaString");
        String rutaArchivo = "";
        List<String> expResult = null;
        List<String> result = Archivo.leerArchivoComoListaString(rutaArchivo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of copiarArchivo method, of class Archivo.
     */
    @Test
    public void testCopiarArchivo() {
        System.out.println("copiarArchivo");
        String rutaArchivoAntigua = "";
        String rutaArchivoNueva = "";
        Archivo.copiarArchivo(rutaArchivoAntigua, rutaArchivoNueva);
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarArchivo method, of class Archivo.
     */
    @Test
    public void testEliminarArchivo() {
        System.out.println("eliminarArchivo");
        String rutaArchivo = "";
        Archivo.eliminarArchivo(rutaArchivo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeArchivo method, of class Archivo.
     */
    @Test
    public void testExisteArchivo() {
        System.out.println("existeArchivo");
        String rutaArchivo = "";
        boolean expResult = false;
        boolean result = Archivo.existeArchivo(rutaArchivo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

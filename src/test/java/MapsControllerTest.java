/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class MapsControllerTest {
    
    public MapsControllerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of initialize method, of class MapsController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        MapsController instance = new MapsController();
        instance.initialize(url, rb);
        fail("The test case is a prototype.");
    }

    /**
     * Test of mapInitialized method, of class MapsController.
     */
    @Test
    public void testMapInitialized() {
        System.out.println("mapInitialized");
        MapsController instance = new MapsController();
        instance.mapInitialized();
        fail("The test case is a prototype.");
    }
    
}

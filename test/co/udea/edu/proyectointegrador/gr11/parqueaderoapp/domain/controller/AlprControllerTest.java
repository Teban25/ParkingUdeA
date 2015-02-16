/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davide.gomez
 */
public class AlprControllerTest {

    public AlprControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of recognizePlateFromUser method, of class AlprController.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRecognizePlateFromUser() {
        System.out.println("recognizePlateFromUser");
        String idUsuario = "1017214";
        AlprController instance = new AlprController("./images/DSC_01057.JPG");
        String expResult = "MSQ009";
        String result;
        try {
            result = instance.recognizePlateFromUser(idUsuario);
            assertEquals(expResult, result);
        } catch (BussinessException ex) {
            fail(ex.getMessage());
        }

        // TODO review the generated test code and remove the default call to fail.
    }

}

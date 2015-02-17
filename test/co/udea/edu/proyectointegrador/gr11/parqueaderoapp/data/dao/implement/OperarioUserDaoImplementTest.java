/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.OperarioUserDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.OperarioUser;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException;
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
 * @author juanf.molina
 */
public class OperarioUserDaoImplementTest {
    
    public OperarioUserDaoImplementTest() {
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
     * Test of insertarOperarioUser method, of class OperarioUserDaoImplement.
     */
    @Test
    public void testInsertarOperarioUser() {
        System.out.println("insertarOperarioUser");
        OperarioUser operarioUser = null;
        OperarioUserDaoImplement instance = new OperarioUserDaoImplement();
        try {
            instance.insertarOperarioUser(operarioUser);
        } catch (PersistentException ex) {
            Logger.getLogger(OperarioUserDaoImplementTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperario method, of class OperarioUserDaoImplement.
     */
    @Test
    public void testGetOperario() {
        System.out.println("getOperario");
        String nombreUsuarioOperario = "test.vigilante";
        OperarioUserDao instance = new OperarioUserDaoImplement();
               OperarioUser result;
        try {
            result = instance.getOperario(nombreUsuarioOperario);
            assertEquals(nombreUsuarioOperario, result.getNombreUsuarioOperario());
        } catch (PersistentException ex) {
           fail(ex.getMessage());
        }
        
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.UsuarioVehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.UsuarioVehiculo;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.UsuarioVehiculoId;
import java.util.List;
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
public class UsuarioVehiculoDaoImplementTest {
    
    public UsuarioVehiculoDaoImplementTest() {
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
     * Test of insertarUsuarioVehiculo method, of class UsuarioVehiculoDaoImplement.
     */
    @Test
    public void testInsertarUsuarioVehiculo() {
        System.out.println("insertarUsuarioVehiculo");
        UsuarioVehiculo usuarioVehiculo = new UsuarioVehiculo();
        UsuarioVehiculoId id=new UsuarioVehiculoId("MSQ009", "1017214");
        usuarioVehiculo.setId(id);
        usuarioVehiculo.setActivo(true);
        UsuarioVehiculoDao instance = new UsuarioVehiculoDaoImplement();
        instance.insertarUsuarioVehiculo(usuarioVehiculo);
        List<UsuarioVehiculo> vehiculos=instance.getUsuarioVehiculo("1017214");
        boolean existe=false;
        for(UsuarioVehiculo v:vehiculos){
            if(v.getVehiculo().getPlaca().equals("MSQ009")){
                existe=true;
            }
        }
      
        assertTrue(existe);
    }

    /**
     * Test of getUsuarioVehiculo method, of class UsuarioVehiculoDaoImplement.
     */
    @Test
    public void testGetUsuarioVehiculo() {
        System.out.println("getUsuarioVehiculo");
        String identificacion = "";
        UsuarioVehiculoDaoImplement instance = new UsuarioVehiculoDaoImplement();
        List<UsuarioVehiculo> expResult = null;
        List<UsuarioVehiculo> result = instance.getUsuarioVehiculo(identificacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

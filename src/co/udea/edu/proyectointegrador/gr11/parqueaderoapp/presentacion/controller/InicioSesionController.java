
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.presentacion.controller;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.OperarioUserDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.OperarioUserDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.OperarioUser;

/**
 *
 * @author Teban-Ing
 */
public class InicioSesionController {
    private final String usuario;
    private final String password;
    private OperarioUserDao daoPrueba;
    private OperarioUser userPrueba;
    
    public InicioSesionController(String usuario, String password) {
        this.usuario=usuario;
        this.password=password;
    }
    
    public boolean permitirSesion(){
        boolean sesion=false;
        daoPrueba=new OperarioUserDaoImplement();
        userPrueba=daoPrueba.getOperario(usuario);
        if(userPrueba!=null){
            if(userPrueba.getPassword().equals(this.password)){
                sesion=true;
            }
        }
        return sesion;
    }
    
}


package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller;

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
    
    public int permitirSesion(){
        int role=-1;
        daoPrueba=new OperarioUserDaoImplement();
        userPrueba=daoPrueba.getOperario(usuario);
        if(userPrueba!=null){
            if(userPrueba.getPassword().equals(this.password)){
                role=userPrueba.getTipoOperarioUser().getIdTipoOperarioUser();
                return role;
            }
        }
        return role;
    }
    
}

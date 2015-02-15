
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.OperarioUser;

/**
 *
 * @author Teban-Ing
 */
public interface OperarioUserDao {
     /**
     * Se inserta un usuario operario
     * @param operarioUser nuevo para ingresarlo al sistema y poder tener acceso
     */
     public void insertarOperarioUser(OperarioUser operarioUser);
     /**
     * Se recupera un usuariooperario del sistema
     * @param nombreUsuarioOperario nombre de usuario
     * @return
     */
     public OperarioUser getOperario(String nombreUsuarioOperario); 
}

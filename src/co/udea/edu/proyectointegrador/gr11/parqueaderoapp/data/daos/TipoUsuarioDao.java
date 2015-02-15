
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoUsuario;

/**
 *
 * @author Teban-Ing
 */
public interface TipoUsuarioDao {
    /**
     * Se inserta un nuevo tipo de usuario al sistema
     * @param tipoUsuario nuevo tipo de rol de los usuarios
     */
    public void insertTipoUsuario(TipoUsuario tipoUsuario);
    
    /**
     * Retorna un tipo de usuario especifico
     * @param idTipoUsuario, se refiere al identificador del tipo de usuario
     * @return 
     */
    public TipoUsuario getTipoUsuario(int idTipoUsuario);
}

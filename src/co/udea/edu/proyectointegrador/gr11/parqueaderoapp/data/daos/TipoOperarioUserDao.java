
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoOperarioUser;
import java.util.List;

/**
 *
 * @author Teban-Ing
 */
public interface TipoOperarioUserDao {
    /**
     * Se inserta un nuevo tipo de operario al sistema
     * @param tipoOperarioUser el nuevo tipo de rol
     */
    public void insertTipoUsuario(TipoOperarioUser tipoOperarioUser);
    /**
     * Obtiene todos los tipos de operarios que existan en el sistema
     * @return 
     */
    public List<TipoOperarioUser> getAllTipoOperario();
    /**
     * Retorna un tipo de operario especifico
     * @param idTipoOperarioUser, se refiere al identificador del tipo de operario
     * @return 
     */
    public TipoOperarioUser getTipoOperario(int idTipoOperarioUser);
}

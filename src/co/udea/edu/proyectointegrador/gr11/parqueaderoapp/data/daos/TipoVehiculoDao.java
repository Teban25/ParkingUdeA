
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoVehiculo;
import java.util.List;

/**
 *
 * @author Teban-Ing
 */
public interface TipoVehiculoDao {
    /**
     * Se inserta un nuevo tipo de vehiculo al sistema
     * @param tipoVehiculo nuevo tipo de vehiculo para hacer parte del sistema
     */
    public void insertTipoVehiculo(TipoVehiculo tipoVehiculo);
    /**
     * Obtiene todas los usuarios que existan en el sistema
     * @return 
     */
    public List<TipoVehiculo> getAllTipoVehiculo();
    /**
     * Retorna un tipo de vehiculo especifico
     * @param idTipoVehiculo, se refiere al identificador del tipo de vehiculo a retornar
     * @return 
     */
    public TipoVehiculo getTipoVehiculo(int idTipoVehiculo);
}

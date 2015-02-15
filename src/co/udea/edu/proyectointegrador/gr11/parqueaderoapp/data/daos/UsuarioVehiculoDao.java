
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.UsuarioVehiculo;
import java.util.List;

/**
 *
 * @author Teban-Ing
 */
public interface UsuarioVehiculoDao {
    /**
     * Se inserta un vehiculo de un usuario
     * @param usuarioVehiculo nueva relacion entre usuario y un vehiculo
     */
    public void insertarUsuarioVehiculo(UsuarioVehiculo usuarioVehiculo);
     /**
     * Se recupera un usuario con todos los vehiculos a su nombre
     * @param identificacion a recuperar sus vehiculos
     * @return
     */
    public List<UsuarioVehiculo> getUsuarioVehiculo(String  identificacion);
}


package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Vehiculo;


/**
 *
 * @author Teban-Ing
 */
public interface VehiculoDao {
    /**
     * Se inserta un operario
     * @param vehiculo nuevo vehiculo a ser registrado
     */
     public void insertarVehiculo(Vehiculo vehiculo);
     
      /**
     * Se recupera un vehiculo
     * @param placa conjunto de letras y numero unico de cada vehiculo
     * @return
     */
     public Vehiculo getVehiculo(String placa);
     
}

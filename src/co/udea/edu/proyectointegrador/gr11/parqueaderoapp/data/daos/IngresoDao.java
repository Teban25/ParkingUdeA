
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Ingreso;

import java.util.List;

/**
 *
 * @author Teban-Ing
 */
public interface IngresoDao {
    /**
     * Se inserta un nuevo ingreso de algun usuario
     * @param ingreso contiene la información estadistica de un ingreso o salida
     */
    public void insertarIngreso(Ingreso ingreso);
    
     /**
     * Se recupera todas las estadisticas del sistema
     * 
     * @return
     */
    public List<Ingreso> getAllIngresos();
}

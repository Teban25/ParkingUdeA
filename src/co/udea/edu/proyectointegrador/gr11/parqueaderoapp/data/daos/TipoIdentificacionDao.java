
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoIdentificacion;

/**
 *
 * @author Teban-Ing
 */
public interface TipoIdentificacionDao {
    /**
     * Se inserta un nuevo tipo de identificacion al sistema
     * @param tipoIdentificacion nuevo tipo de identificacion en el sistema
     */
    public void insertTipoIdentificacion(TipoIdentificacion tipoIdentificacion);
    /**
     * Retorna un tipo de identificacion especifico
     * @param idTipoIdentificacion, se refiere al identificador del tipo de identificacion
     * @return 
     */
    public TipoIdentificacion getTipoUsuario(int idTipoIdentificacion);
}

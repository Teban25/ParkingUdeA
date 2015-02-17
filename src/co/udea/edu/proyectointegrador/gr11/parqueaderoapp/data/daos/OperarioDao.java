
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Operario;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException;

/**
 *
 * @author Teban-Ing
 */
public interface OperarioDao {
    /**
     * Se inserta un operario
     * @param operario nuevo a ingresar al sistema
     * @throws co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException
     */
    public void insertarOperario(Operario operario)throws PersistentException;
    /**
     * Se recupera un operario
     * @param identificacion numero de documento del operario
     * @return
     * @throws co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException
     */
    public Operario getOperario(String identificacion)throws PersistentException;   
    
    public void modificarOperario(Operario operario) throws PersistentException;
    
    public void eliminarOperario (String cedula) throws PersistentException;
    
    public Operario getOperarioByNombreUsuario(String nombreUsuario) throws PersistentException;
}

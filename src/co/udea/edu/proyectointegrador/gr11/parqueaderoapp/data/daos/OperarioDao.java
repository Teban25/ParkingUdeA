
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Operario;

/**
 *
 * @author Teban-Ing
 */
public interface OperarioDao {
    /**
     * Se inserta un operario
     * @param operario nuevo a ingresar al sistema
     */
    public void insertarOperario(Operario operario);
    /**
     * Se recupera un operario
     * @param identificacion numero de documento del operario
     * @return
     */
    public Operario getOperario(String identificacion);    
}

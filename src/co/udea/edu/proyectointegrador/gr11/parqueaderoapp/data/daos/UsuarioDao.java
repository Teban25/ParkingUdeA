
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Usuario;

/**
 *
 * @author Teban-Ing
 */
public interface UsuarioDao {
     /**
     * Se inserta un nuevo usuario
     * @param usuario nuevo usuario para ser ingresado
     */
    public void insertarUsuario(Usuario usuario);
    
    /**
     * Se recupera un usuario
     * @param id clave del usuario (numero de identificacion)
     * @return
     */
    public Usuario getUsuario(String id);
}

package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities;
// Generated 15/02/2015 12:13:53 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoIdentificacion generated by hbm2java
 */
public class TipoIdentificacion  implements java.io.Serializable {


     private int idTipoIdentificacion;
     private String tipoIdentificacionDescripcion;
   

    public TipoIdentificacion() {
    }

	
    public TipoIdentificacion(int idTipoIdentificacion, String tipoIdentificacionDescripcion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.tipoIdentificacionDescripcion = tipoIdentificacionDescripcion;
    }
   
   
    public int getIdTipoIdentificacion() {
        return this.idTipoIdentificacion;
    }
    
    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }
    public String getTipoIdentificacionDescripcion() {
        return this.tipoIdentificacionDescripcion;
    }
    
    public void setTipoIdentificacionDescripcion(String tipoIdentificacionDescripcion) {
        this.tipoIdentificacionDescripcion = tipoIdentificacionDescripcion;
    }
  

}



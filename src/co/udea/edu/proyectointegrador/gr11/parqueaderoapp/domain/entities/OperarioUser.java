package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities;
// Generated 15/02/2015 12:13:53 PM by Hibernate Tools 4.3.1


/**
 * OperarioUser generated by hbm2java
 */
public class OperarioUser  implements java.io.Serializable {


     private String nombreUsuarioOperario;
     private TipoOperarioUser tipoOperarioUser;
     private String password;
     private boolean activo;

    public OperarioUser() {
    }

    public OperarioUser(String nombreUsuarioOperario, TipoOperarioUser tipoOperarioUser, String password, boolean activo) {
        this.nombreUsuarioOperario = nombreUsuarioOperario;
        this.tipoOperarioUser = tipoOperarioUser;
        this.password = password;
        this.activo = activo;
    }


   
    public String getNombreUsuarioOperario() {
        return this.nombreUsuarioOperario;
    }
    
    public void setNombreUsuarioOperario(String nombreUsuarioOperario) {
        this.nombreUsuarioOperario = nombreUsuarioOperario;
    }
    public TipoOperarioUser getTipoOperarioUser() {
        return this.tipoOperarioUser;
    }
    
    public void setTipoOperarioUser(TipoOperarioUser tipoOperarioUser) {
        this.tipoOperarioUser = tipoOperarioUser;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
  

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }



}



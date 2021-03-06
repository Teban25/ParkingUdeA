
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.IngresoDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.OperarioUserDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.UsuarioDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.VehiculoDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.IngresoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.OperarioUserDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.UsuarioDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.VehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Ingreso;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.IngresoId;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.OperarioUser;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Usuario;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Vehiculo;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Teban-Ing
 */
public class IngresoController {
    private Date fecha;
    private Boolean estado;
    private String placa;
    private String identificacionUsuario;
    private String nombreOperario;
    private IngresoDao ingresoDao;
    private Ingreso ingresoNuevo;
    private IngresoId ingresoId;
    private UsuarioDao usuarioDao;
    private Usuario user;
    private VehiculoDao vehiculoDao;
    private Vehiculo vehiculo;
    private OperarioUserDao operarioUserDao;
    private OperarioUser operarioUser;

    public IngresoController() {
    }
    
    public IngresoController(Date fecha, Boolean estado, String placa, String identificacionUsuario, String nombreOperario) {
        this.fecha = fecha;
        this.estado = estado;
        this.placa = placa;
        this.identificacionUsuario = identificacionUsuario;
        this.nombreOperario = nombreOperario;
    }
    
    public List<Ingreso> getAllIngresos(){
        List<Ingreso>ingresos;
        ingresoDao=new IngresoDaoImplement();
        ingresos=ingresoDao.getAllIngresos();
        return ingresos;
    }
    
    public void insertarIngreso()throws BussinessException, PersistentException{
        if((fecha==null) || (estado==null) || placa.equals("") || identificacionUsuario.equals("")
                || nombreOperario.equals("")){
            throw new BussinessException("Falta algún campo por completar verifique de nuevo");
        }
        usuarioDao=new UsuarioDaoImplement();
        user=usuarioDao.getUsuario(identificacionUsuario);
        if(user==null){
            throw new BussinessException("Imposible crear el registro, el usuario no pertenece "
                    + "al sistema");
        }
        vehiculoDao=new VehiculoDaoImplement();
        vehiculo=vehiculoDao.getVehiculo(placa);
        if(vehiculo==null){
            throw new BussinessException("Imposible crear el registro, el vehiculo no se encuentra "
                    + "en el sistema");
        }
        operarioUserDao=new OperarioUserDaoImplement();
        operarioUser=operarioUserDao.getOperario(nombreOperario);
        if (operarioUser==null) {
            throw new BussinessException("Imposible crear el registro, el operario no pertenece "
                    + "al sistema");
        }
        ingresoDao=new IngresoDaoImplement();
        ingresoId=new IngresoId(fecha, placa, identificacionUsuario);
        ingresoNuevo=new Ingreso();
        ingresoNuevo.setId(ingresoId);
        ingresoNuevo.setEstado(estado);
        ingresoDao.insertarIngreso(ingresoNuevo);
    }
}

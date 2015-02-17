
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.TipoVehiculoDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.UsuarioDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.UsuarioVehiculoDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.VehiculoDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.TipoVehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.UsuarioDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.UsuarioVehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.VehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoVehiculo;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Usuario;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.UsuarioVehiculo;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.UsuarioVehiculoId;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Vehiculo;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author davide.gomez
 */
public class VehiculoController {
    private final String placa;
    private final String marca;
    private final String color;
    private final String tipoVehiculo;
    private final String tip;
    UsuarioDao usuarioD;
    Usuario usuario;
    VehiculoDao vehiculoD;
    Vehiculo vehiculo;
    TipoVehiculoDao tipoVehiculoDao;
    TipoVehiculo tipoVehiculoObj;
    UsuarioVehiculoDao usuarioVehiculoDao;
    UsuarioVehiculo usuarioVehiculoIngreso;
    UsuarioVehiculoId usuarioVehiculoPk;

    public VehiculoController(String placa, String marca, String color, String tipoVehiculo, String tip) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.tip = tip;
    }
    
    public void registroVehiculo() throws BussinessException{
        if((placa.equals("")) || (marca.equals("")) || (color.equals("")) &
                (!tipoVehiculo.equals("Seleccionar"))|| (tip.equals(""))){
            throw new BussinessException("Falto algún campo por ingresar, "
                    + "intentelo de nuevo");
        }
        usuarioD=new UsuarioDaoImplement();
        usuario=usuarioD.getUsuario(tip);
        if(usuario==null){
            throw new BussinessException("El usuario no esta activo en el sistema.");
        }
        vehiculoD=new VehiculoDaoImplement();
        vehiculo=vehiculoD.getVehiculo(placa);
        if(vehiculo==null){
            tipoVehiculoDao=new TipoVehiculoDaoImplement();
            tipoVehiculoObj=tipoVehiculoDao.getTipoVehiculo(tipoVehiculo);
            if(tipoVehiculoObj==null){
                throw new BussinessException("Hubo un error al intentar ingresar el"
                        + " vehiculo, verifique el tipo de vehiculo");
            }
            vehiculo=new Vehiculo(placa, tipoVehiculoObj, marca, color, new Date());
            vehiculoD.insertarVehiculo(vehiculo);
        }else{
            usuarioVehiculoDao=new UsuarioVehiculoDaoImplement();
            List<UsuarioVehiculo> vehiculos=usuarioVehiculoDao.getUsuarioVehiculo(tip);
            for (UsuarioVehiculo vehiculoUsuario : vehiculos) {
                if(vehiculoUsuario.getId().getPlaca().equals(placa)){
                    throw new BussinessException("El vehiculo ya esta registrado a nombre"
                            + " del usuario ingresado, verifique intentando conceder"
                            + " el ingreso o salida.");
                }
            }
        }
        usuarioVehiculoPk=new UsuarioVehiculoId(placa, tip);
        usuarioVehiculoIngreso=new UsuarioVehiculo();
        usuarioVehiculoIngreso.setId(usuarioVehiculoPk);
        usuarioVehiculoIngreso.setActivo(true);
        usuarioVehiculoDao.insertarUsuarioVehiculo(usuarioVehiculoIngreso);
    }
    
}

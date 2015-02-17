/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement.OperarioDaoImplement;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.OperarioDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Operario;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.PersistentException;

/**
 *
 * @author juanf.molina
 */
public class OperarioController {

    private OperarioDao operarioDao;

    public Operario buscarOperario(String cedula) throws BussinessException, PersistentException {
        operarioDao = new OperarioDaoImplement();
        Operario operario = operarioDao.getOperario(cedula);
        if (operario == null) {
            throw new BussinessException("El operario no existe");
        }
        return operario;
    }

    public void insertarOperario(Operario operario) throws BussinessException, PersistentException {
       validarOperario(operario);
       
       operarioDao.insertarOperario(operario);
    }
    
    public void eliminarOperario(String cedulaOperario) throws PersistentException{
        operarioDao= new OperarioDaoImplement();
        operarioDao.eliminarOperario(cedulaOperario);
    }
    
    public void actualizarOperario(Operario operario) throws BussinessException, PersistentException{
        validarOperario(operario);
        operarioDao= new OperarioDaoImplement();
        operarioDao.modificarOperario(operario);
    }

    private void validarOperario(Operario operario) throws BussinessException {
        if (operario.getApellido().equals("") || operario.getDireccion().equals("")
                || operario.getNombre().equals("") || operario.getTelefono().equals("")
                || operario.getOperarioUser().getNombreUsuarioOperario().equals("")
                || operario.getOperarioUser().getPassword().equals("")) {
            throw new BussinessException("Alguno de los campos está vacío");
        }
    }

}

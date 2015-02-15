/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.VehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.hibernateconfig.HibernateUtil;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Vehiculo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Teban-Ing
 */
public class VehiculoDaoImplement implements VehiculoDao{

    Session session = null;
    boolean bandera=false;
    private Transaction transaction=null;

    public VehiculoDaoImplement() {
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public void insertarVehiculo(Vehiculo vehiculo) {
        //Comienzo la transaccion
            try{
                SessionFactory sf=HibernateUtil.getSessionFactory();
                session=sf.openSession();
                transaction = session.beginTransaction();
                session.save("Vehiculo", vehiculo);
                transaction.commit();
                session.close();
            }catch(Exception e){
                transaction.rollback();
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
    }

    @Override
    public Vehiculo getVehiculo(String placa) {
        Vehiculo nuevoVehi=null;
        try{
            SessionFactory sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            nuevoVehi=(Vehiculo)session.get(Vehiculo.class, placa);
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return nuevoVehi;
    }
    
}

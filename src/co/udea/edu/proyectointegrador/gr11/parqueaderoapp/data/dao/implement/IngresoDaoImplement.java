/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.IngresoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.hibernateconfig.HibernateUtil;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Ingreso;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Teban-Ing
 */
public class IngresoDaoImplement implements IngresoDao{

    Session session = null;
    boolean bandera=false;
    private Transaction transaction=null;

    public IngresoDaoImplement() {
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public void insertarIngreso(Ingreso ingreso) {
        //Comienzo la transaccion
            try{
                SessionFactory sf=HibernateUtil.getSessionFactory();
                session=sf.openSession();
                transaction = session.beginTransaction();
                session.save("Ingreso", ingreso);
                transaction.commit();
                session.close();
            }catch(Exception e){
                transaction.rollback();
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
    }

    @Override
    public List<Ingreso> getAllIngresos() {
        List<Ingreso> todosIngresos=null;
        try{
           SessionFactory sf=HibernateUtil.getSessionFactory();
           session=sf.openSession();
           Query q=session.createQuery("from Ingreso");
           todosIngresos=q.list();
           session.close();
       }catch(Exception e){
           System.out.println(e.getMessage());
           System.out.println(e.getCause());
       }
        return todosIngresos;
    }
    
}

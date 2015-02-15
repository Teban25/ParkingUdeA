/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.OperarioDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.hibernateconfig.HibernateUtil;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Operario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Teban-Ing
 */
public class OperarioDaoImplement implements OperarioDao{

    Session session = null;
    boolean bandera=false;
    private Transaction transaction=null;

    public OperarioDaoImplement() {
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public void insertarOperario(Operario operario) {
        //Comienzo la transaccion
            try{
                SessionFactory sf=HibernateUtil.getSessionFactory();
                session=sf.openSession();
                transaction = session.beginTransaction();
                session.save("Operario", operario);
                transaction.commit();
                session.close();
            }catch(Exception e){
                transaction.rollback();
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
    }

    @Override
    public Operario getOperario(String identificacion) {
        Operario retornaOper=null;
        try{
            SessionFactory sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            retornaOper=(Operario)session.get(Operario.class, identificacion);
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return retornaOper;
    }
    
}

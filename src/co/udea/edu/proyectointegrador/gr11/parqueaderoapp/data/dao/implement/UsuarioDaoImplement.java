/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.UsuarioDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.hibernateconfig.HibernateUtil;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Teban-Ing
 */
public class UsuarioDaoImplement implements UsuarioDao{

    Session session = null;
    boolean bandera=false;
    private Transaction transaction=null;

    public UsuarioDaoImplement() {
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public void insertarUsuario(Usuario usuario) {
        //Comienzo la transaccion
            try{
                SessionFactory sf=HibernateUtil.getSessionFactory();
                session=sf.openSession();
                transaction = session.beginTransaction();
                session.save("Usuario", usuario);
                transaction.commit();
                session.close();
            }catch(Exception e){
                transaction.rollback();
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
    }

    @Override
    public Usuario getUsuario(String id) {
        Usuario retornaUsu=null;
        try{
            SessionFactory sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            retornaUsu=(Usuario)session.get(Usuario.class, id);
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return retornaUsu;
    }
    
}

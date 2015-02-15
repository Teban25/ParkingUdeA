
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.TipoIdentificacionDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.hibernateconfig.HibernateUtil;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoIdentificacion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Teban-Ing
 */
public class TipoIdentificacionDaoImplement implements TipoIdentificacionDao{
    
    Session session = null;
    boolean bandera=false;
    private Transaction transaction=null;
    
    public TipoIdentificacionDaoImplement(){
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public TipoIdentificacion getTipoUsuario(int idTipoIdentificacion) {
        TipoIdentificacion tipoI=null;
        try{
            SessionFactory sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            tipoI=(TipoIdentificacion)session.get(TipoIdentificacion.class, idTipoIdentificacion);
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return tipoI;
    }

    @Override
    public void insertTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
            //Comienzo la transaccion
            try{
                SessionFactory sf=HibernateUtil.getSessionFactory();
                session=sf.openSession();
                transaction = session.beginTransaction();
                session.save("TipoIdentificacion", tipoIdentificacion);
                transaction.commit();
                session.close();
            }catch(Exception e){
                transaction.rollback();
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
    }
    
}

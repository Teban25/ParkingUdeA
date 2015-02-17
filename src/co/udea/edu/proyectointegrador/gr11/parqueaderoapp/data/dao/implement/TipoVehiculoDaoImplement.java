
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.dao.implement;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.daos.TipoVehiculoDao;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.data.hibernateconfig.HibernateUtil;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.TipoVehiculo;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Teban-Ing
 */
public class TipoVehiculoDaoImplement implements TipoVehiculoDao{

    Session session = null;
    boolean bandera=false;
    private Transaction transaction=null;

    public TipoVehiculoDaoImplement() {
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }
   
    @Override
    public void insertTipoVehiculo(TipoVehiculo tipoVehiculo) {
         //Comienzo la transaccion
            try{
                SessionFactory sf=HibernateUtil.getSessionFactory();
                session=sf.openSession();
                transaction = session.beginTransaction();
                session.save("TipoVehiculo", tipoVehiculo);
                transaction.commit();
                session.close();
            }catch(Exception e){
                transaction.rollback();
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
    }

    @Override
    public List<TipoVehiculo> getAllTipoVehiculo() {
         List<TipoVehiculo> nuevoTipo=null;
         try{
           SessionFactory sf=HibernateUtil.getSessionFactory();
           session=sf.openSession();
           Query q=session.createQuery("from TipoVehiculo");
           nuevoTipo=q.list();
           session.close();
       }catch(Exception e){
           System.out.println(e.getMessage());
           System.out.println(e.getCause());
       }
         return nuevoTipo;
    }

    @Override
    public TipoVehiculo getTipoVehiculo(String descripcionTipoVehiculo) {
        TipoVehiculo tipoVehi=null;
        try{
            SessionFactory sf=HibernateUtil.getSessionFactory();
            session=sf.openSession();
            String q="from TipoVehiculo u where u.tipoVehiculoDescripcion=:descripcionTipoVehiculo";
            tipoVehi=(TipoVehiculo)session.createQuery(q).
                    setParameter("descripcionTipoVehiculo", descripcionTipoVehiculo).list().get(0);
            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        return tipoVehi;
    }
    
}

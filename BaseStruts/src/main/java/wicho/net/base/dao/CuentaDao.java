package wicho.net.base.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import wicho.net.base.beans.Cuenta;

public class CuentaDao {
	
	private SessionFactory sf;
	
	public CuentaDao(SessionFactory sf) {
		this.sf = sf;
	}
	
	public boolean validar(Cuenta cuenta) {
    	
    	boolean valido = false;
    	
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	Query query = session.createQuery("from Cuenta where username = :username and password = :password");
    	query.setParameter("username", cuenta.getUsername());
    	query.setParameter("password",cuenta.getPassword());
    	
    	if((Cuenta)query.uniqueResult() != null) {  
    		valido = true;
    	}
    	tx.commit();
    	session.close();
    	
    	return valido;
    }
 	
}

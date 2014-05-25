/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author GhostMachine
 */
class LoginSystem {

    private SessionFactory factory;

    public LoginSystem() {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Error in login Constructor:" + ex);
        }
    }

    public boolean check(String username, String password) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "FROM Account A WHERE A.username='" + username + "' AND A.password='" + password+"'";
            System.out.println("HQL = "+hql);
            Query query = session.createQuery(hql);
            List results = query.list();

          
            tx.commit();
            Account x = (Account)results.get(0);
            if(x!=null) return true;
            else return false;
        } catch (Exception ex) {
            System.out.println("LoginSystem >> Could not find Account username = " + username);
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return false;
    }

    public void add(Account a) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(a);
            System.out.println("LoginSystem >> Account Saved username = " + a.getUsername());
            tx.commit();
        } catch (Exception ex) {
            System.out.println("LoginSystem >> Could not save Account username = " + a.getUsername());
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

}

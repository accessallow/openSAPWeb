package openSAPdto.cheque;

import openSAPdto.cheque.Cheque;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChequeEntryBook {

    private SessionFactory factory;

    public ChequeEntryBook() {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("Data Manager >> Error in DataManager Constructor:" + ex);
        }

    }

    public void init() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Error in ChequeEntryBook init:" + ex);
        }
    }

    public void add_a_cheque(Cheque s) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            int roll_no = (int) session.save(s);
            System.out.println("ChequeEntryBook >> Cheque Saved index = " + roll_no);
            tx.commit();
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not save Cheque index = " + s);
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void update_a_cheque(Cheque s) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            // Student s1 = (Student) session.get(Student.class, s.getRoll_number());
            session.update(s);
            System.out.println("ChequeEntryBook >> Student updated roll_no = " + s.getCheck_id());
            tx.commit();
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not updated student roll_no = " + s.getCheck_id());
        } finally {
            session.close();
        }
    }

    public void delete_a_cheque(String cheque_id) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Cheque s = (Cheque) session.get(Cheque.class, cheque_id);
            session.delete(s);
            System.out.println("ChequeEntryBook >> Student deleted roll_no = " + cheque_id);
            tx.commit();
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not delete student roll_no = " + cheque_id);
        } finally {
            session.close();
        }
    }

    public Cheque get_a_cheque(String cheque_id) {
        Session session = factory.openSession();
        Cheque s = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            s = (Cheque) session.get(Cheque.class, cheque_id);
            System.out.println("ChequeEntryBook >> Student fetched roll_no = " + cheque_id);
            tx.commit();
            return s;
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not fetch student roll_no = " + cheque_id);
        } finally {
            session.close();
        }
        return s;
    }

    public List get_selected_user_cheques(String from_account) {

        Session session = factory.openSession();
        List results = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "FROM Cheque S WHERE S.from_account =" + from_account;
            Query query = session.createQuery(hql);
            results = query.list();
            System.out.println("ChequeEntryBook >> List fetched  = " + from_account);
            tx.commit();
            return results;
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not fetch list from_account = " + from_account);
        } finally {
            session.close();
        }
        return results;
    }

    public List get_all_cheques() {
        Session session = factory.openSession();
        List results = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "FROM Cheque";
            Query query = session.createQuery(hql);
            results = query.list();
            System.out.println("ChequeEntryBook >> List fetched");
            tx.commit();
            return results;
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not fetch list");
        } finally {
            session.close();
        }
        return results;
    }

    public void cheque_audit_data() {
        Session session = factory.openSession();
        List results = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "SELECT sum(distinct E.Amount.amount_in_numbers) FROM Cheque E";
            Query query = session.createQuery(hql);
            results = query.list();
            System.out.println("ChequeEntryBook >> audit fetched");
            tx.commit();
            // return results;
        } catch (Exception ex) {
            System.out.println("ChequeEntryBook >> Could not fetch audit data");
        } finally {
            session.close();
        }
        //return results;
    }

}

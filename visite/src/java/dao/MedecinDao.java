/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Medecin;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author CE PC
 */
public class MedecinDao {

    public boolean save(Medecin m) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(m);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
    public boolean update(Medecin m) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.update(m);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
     public boolean delete(Medecin m) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.delete(m);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static ArrayList getAllMedecin() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        ArrayList<Medecin> mList = (ArrayList<Medecin>) session.createQuery("SELECT al FROM Medecin al").list();
        mList.toString();
        session.close();
        return mList;
    }

    public static Medecin findMedecin(int codeMed) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Medecin m = (Medecin) session.get(Medecin.class, codeMed);
        return m;
    }

}

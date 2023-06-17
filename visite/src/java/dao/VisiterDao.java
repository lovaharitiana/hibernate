/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Medecin;
import entity.Visiter;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author CE PC
 */
public class VisiterDao {

    public boolean save(Visiter v) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(v);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
    public boolean update(Visiter v) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.update(v);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
     public boolean delete(Visiter v) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.delete(v);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static ArrayList getAllVisiter() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        ArrayList<Visiter> vList = (ArrayList<Visiter>) session.createQuery("SELECT al FROM Visiter al").list();
        vList.toString();
        session.close();
        return vList;
    }

    public static Visiter findVisiter(int id) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Visiter v = (Visiter) session.get(Visiter.class, id);
        return v;
    }

}

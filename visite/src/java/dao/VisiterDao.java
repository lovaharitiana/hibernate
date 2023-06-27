/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Medecin;
import entity.Visiter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import org.hibernate.FetchMode;


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

  public static ArrayList<Visiter> searchVisiterByDates(String startDate, String endDate) {
    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = factory.openSession();
    Criteria criteria = session.createCriteria(Visiter.class);
    
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start = dateFormat.parse(startDate);
        Date end = dateFormat.parse(endDate);

        // Utilisez les restrictions pour filtrer par dates
        criteria.add(Restrictions.between("date", start, end));
        
        // Charger les objets associés lors de la recherche
        criteria.setFetchMode("medecin", FetchMode.JOIN);
        criteria.setFetchMode("patient", FetchMode.JOIN);
    } catch (ParseException e) {
        // Gérez les erreurs de parsing des dates
        e.printStackTrace();
    }

    ArrayList<Visiter> vList = (ArrayList<Visiter>) criteria.list();
    session.close();
    return vList;
}


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Patient;
import java.sql.Connection;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author CE PC
 */
public class PatientDao {

    public boolean save(Patient p) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(p);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean update(Patient p) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.update(p);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean delete(Patient p) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            // Supprimer les enregistrements liés dans la table visiter
            Query query = session.createQuery("DELETE FROM Visiter WHERE patient = :patient");
            query.setParameter("patient", p);
            query.executeUpdate();

            // Supprimer le patient
            session.delete(p);

            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ArrayList getAllPatient() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        ArrayList<Patient> pList = (ArrayList<Patient>) session.createQuery("SELECT al FROM Patient al").list();
        pList.toString();
        session.close();
        return pList;
    }

    public static Patient findPatient(int codePat) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Patient p = (Patient) session.get(Patient.class, codePat);
        return p;
    }

    public static ArrayList<Patient> searchPatient(String searchTerm) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Patient.class);

        try {
            int codePat = Integer.parseInt(searchTerm);
            criteria.add(Restrictions.eq("codePat", codePat));
        } catch (NumberFormatException e) {
            criteria.add(Restrictions.eq("nomPat", searchTerm));
        }

        ArrayList<Patient> pList = (ArrayList<Patient>) criteria.list();
        session.close();
        return pList;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PatientDao;
import entity.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CE PC
 */
public class PatientController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        if (request.getParameter("insert") != null) {
            String nomPat = request.getParameter("nomPat");
            String prenomPat = request.getParameter("prenomPat");
            String sexePat = request.getParameter("sexePat");
            String adressePat = request.getParameter("adressePat");

            Patient patient = new Patient();
            patient.setNomPat(nomPat);
            patient.setPrenomPat(prenomPat);
            patient.setSexePat(sexePat);
            patient.setAdressePat(adressePat);

            boolean status = new PatientDao().save(patient);
            if (status) {
                request.getSession().setAttribute("sm", "Patient ajouté avec succès");
                response.sendRedirect("listePat.jsp?successMessage=Le patient a été ajouté avec succès");

            } else {
                request.getSession().setAttribute("em", "Erreur d'ajout du patient");
                response.sendRedirect("listePat.jsp?errorMessage=Erreur d'ajout du patient");

            }

        } else if (request.getParameter("update") != null) {
            int codePat = Integer.parseInt(request.getParameter("codePat"));
            String nomPat = request.getParameter("nomPat");
            String prenomPat = request.getParameter("prenomPat");
            String sexePat = request.getParameter("sexePat");
            String adressePat = request.getParameter("adressePat");

            Patient patient = new Patient();
            patient.setCodePat(codePat);
            patient.setNomPat(nomPat);
            patient.setPrenomPat(prenomPat);
            patient.setSexePat(sexePat);
            patient.setAdressePat(adressePat);

            boolean status = new PatientDao().update(patient);
            if (status) {
                request.getSession().setAttribute("sm", "Patient modifié avec succès");
                response.sendRedirect("listePat.jsp?successMessage=Le patient a été modifié avec succès");

            } else {
                request.getSession().setAttribute("em", "Erreur de modification du patient");
                 response.sendRedirect("listePat.jsp?errorMessage=Erreur de modification du patient");


            }

        } else if (request.getParameter("for") != null && request.getParameter("for").equalsIgnoreCase("delete")) {
            int codePat = Integer.parseInt(request.getParameter("codePat"));
            Patient p = PatientDao.findPatient(codePat);
            boolean status = new PatientDao().delete(p);
            if (status) {
                request.getSession().setAttribute("sm", "Patient supprimé avec succès");
            } else {
                request.getSession().setAttribute("em", "Erreur de suppression du patient");
            }
            response.sendRedirect(request.getContextPath() + "/listePat.jsp");
        } else if (request.getParameter("search") != null) {
            String searchTerm = request.getParameter("search");
            ArrayList<Patient> searchResults = PatientDao.searchPatient(searchTerm);
            request.setAttribute("searchResults", searchResults);
            request.getRequestDispatcher("/listePat.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

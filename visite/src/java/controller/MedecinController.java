/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MedecinDao;
import entity.Medecin;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CE PC
 */
public class MedecinController extends HttpServlet {

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
            String nomMed = request.getParameter("nomMed");
            String prenomMed = request.getParameter("prenomMed");
            String gradeMed = request.getParameter("gradeMed");

            Medecin medecin = new Medecin();
            medecin.setNomMed(nomMed);
            medecin.setPrenomMed(prenomMed);
            medecin.setGradeMed(gradeMed);

            boolean status = new MedecinDao().save(medecin);
            if (status) {
                request.getSession().setAttribute("sm", "Medecin ajouté avec succès");
                response.sendRedirect("listeMed.jsp?successMessage=Medecin ajouté avec succès");

            } else {
                request.getSession().setAttribute("em", "Erreur d'ajout du medecin");
                response.sendRedirect("listeMed.jsp?errorMessage=Erreur d'ajout du medecin");

            }

        } else if (request.getParameter("update") != null) {
            int codeMed = Integer.parseInt(request.getParameter("codeMed"));
            String nomMed = request.getParameter("nomMed");
            String prenomMed = request.getParameter("prenomMed");
            String gradeMed = request.getParameter("gradeMed");

            Medecin medecin = new Medecin();
            medecin.setCodeMed(codeMed);
            medecin.setNomMed(nomMed);
            medecin.setPrenomMed(prenomMed);
            medecin.setGradeMed(gradeMed);

            boolean status = new MedecinDao().update(medecin);
            if (status) {
                request.getSession().setAttribute("sm", "Medecin modifié avec succès");
                response.sendRedirect("listeMed.jsp?successMessage=Medecin modifié avec succès");

            } else {
                request.getSession().setAttribute("em", "Erreur de modification du medecin");
                response.sendRedirect("listeMed.jsp?errorMessage=Erreur de modification du medecint");

            }

            } else if (request.getParameter("for") != null && request.getParameter("for").equalsIgnoreCase("delete")) {
            int codeMed = Integer.parseInt(request.getParameter("codeMed"));
            Medecin m = MedecinDao.findMedecin(codeMed);
            boolean status = new MedecinDao().delete(m);
            if (status) {
                request.getSession().setAttribute("sm", "Medecin supprimé avec succès");
            } else {
                request.getSession().setAttribute("em", "Erreur de suppression du medecin");
            }
            response.sendRedirect(request.getContextPath() + "/listeMed.jsp");
        }else if (request.getParameter("search") != null) {
            String searchTerm = request.getParameter("search");
            ArrayList<Medecin> searchResults = MedecinDao.searchMedecin(searchTerm);
            request.setAttribute("searchResults", searchResults);
            request.getRequestDispatcher("/listeMed.jsp").forward(request, response);
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

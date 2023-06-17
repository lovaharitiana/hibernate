package controller;

import dao.MedecinDao;
import dao.PatientDao;
import dao.VisiterDao;
import entity.Medecin;
import entity.Patient;
import entity.Visiter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VisiterController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        if (request.getParameter("insert") != null) {
            int codeMed = Integer.parseInt(request.getParameter("codeMed"));
            int codePat = Integer.parseInt(request.getParameter("codePat"));
            String dateString = request.getParameter("date");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = dateFormat.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Medecin medecin = new Medecin();
            medecin.setCodeMed(codeMed);

            Patient patient = new Patient();
            patient.setCodePat(codePat);

            Visiter visiter = new Visiter();
            visiter.setMedecin(medecin);
            visiter.setPatient(patient);
            visiter.setDate(date);

            boolean status = new VisiterDao().save(visiter);
            if (status) {
                request.getSession().setAttribute("sm", "Visite ajoutée avec succès");
            } else {
                request.getSession().setAttribute("em", "Erreur d'ajout de la visite");
            }
            request.getRequestDispatcher("/insertVis.jsp").forward(request, response);
        } else if (request.getParameter("update") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            int codeMed = Integer.parseInt(request.getParameter("codeMed"));
            String nomMed = request.getParameter("nomMed");
            String nomPat = request.getParameter("nomPat");
            int codePat = Integer.parseInt(request.getParameter("codePat"));
            String dateString = request.getParameter("date");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = dateFormat.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Medecin medecin = new Medecin();
            medecin.setCodeMed(codeMed);

            Patient patient = new Patient();
            patient.setCodePat(codePat);

            Visiter visiter = new Visiter();
            visiter.setId(id);
            visiter.setMedecin(medecin);
            visiter.setPatient(patient);
            visiter.setDate(date);

            boolean status = new VisiterDao().update(visiter);
            if (status) {
                request.getSession().setAttribute("sm", "Visite modifiée avec succès");
            } else {
                request.getSession().setAttribute("em", "Erreur de modification de la visite");
            }

            request.getRequestDispatcher("/editVis.jsp?id=" + id).forward(request, response);
        } else if (request.getParameter("for").equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Visiter visite = VisiterDao.findVisiter(id);

            boolean status = new VisiterDao().delete(visite);
            if (status) {
                request.getSession().setAttribute("sm", "Visite supprimée avec succès");
            } else {
                request.getSession().setAttribute("em", "Erreur de suppression de la visite");
            }

            request.getRequestDispatcher("/listeVis.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

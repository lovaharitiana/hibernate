package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Patient;
import dao.PatientDao;

public final class listePat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/patient.css\"/>\n");
      out.write("        <title>Liste Patient</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            /* Styles for the navbar */\n");
      out.write("            .navbar {\n");
      out.write("                width: 200px;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 10px;\n");
      out.write("                height: 100%;\n");
      out.write("                position: fixed;\n");
      out.write("                overflow: auto;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            .navbar a {\n");
      out.write("                display: block;\n");
      out.write("                color: #000;\n");
      out.write("                padding: 8px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .navbar a:hover {\n");
      out.write("                background-color: #555;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .content {\n");
      out.write("                margin-left: 220px;\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                width: 100px;\n");
      out.write("                height: 80px;\n");
      out.write("                background-image: url(");
      out.print( request.getContextPath());
      out.write("/logo.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .bouton_nav a {\n");
      out.write("\n");
      out.write("                margin-top: 60px;\n");
      out.write("            }\n");
      out.write("            .nav_accueil{\n");
      out.write("                display: flex;\n");
      out.write("                width: 100px;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: black;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #modal {\n");
      out.write("                display: none;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1;\n");
      out.write("                left: 0;\n");
      out.write("                top: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100vh;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.4);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .modal-content {\n");
      out.write("\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("\n");
      out.write("                width: 80%;\n");
      out.write("                max-width: 600px;\n");
      out.write("                position: relative;\n");
      out.write("                top: 250px;\n");
      out.write("                transform: translateY(-50%);\n");
      out.write("            }\n");
      out.write("            .close {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 10px;\n");
      out.write("                right: 10px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            iframe {\n");
      out.write("                width: 100%;\n");
      out.write("                height: calc(100vh - 100px);\n");
      out.write("                border: none;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bouton_nav\">\n");
      out.write("                <a href=\"#\">Accueil</a>\n");
      out.write("                <a href=\"#\">Patients</a>\n");
      out.write("                <a href=\"#\">Médecins</a>\n");
      out.write("                <a href=\"#\">Visiter</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <form method=\"GET\" action=\"PatientController\">\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Rechercher par codePat ou nomPat\" />\n");
      out.write("                <input type=\"submit\" value=\"Rechercher\" />\n");
      out.write("            </form>\n");
      out.write("            <button id=\"addPatientButton\">Ajouter</button>\n");
      out.write("            <table border=\"1\" style=\"border-collapse: collapse;\" width=\"90%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"8\">Liste Patient</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Code Patient</th>\n");
      out.write("                        <th>Nom Patient</th>\n");
      out.write("                        <th>Prénoms Patient</th>\n");
      out.write("                        <th>Sexe Patient</th>\n");
      out.write("                        <th>Adresse Patient</th>\n");
      out.write("                        <th colspan=\"2\">Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        String searchQuery = request.getParameter("search");
                        ArrayList<Patient> list;

                        if (searchQuery != null && !searchQuery.isEmpty()) {
                            list = PatientDao.searchPatient(searchQuery);
                        } else {
                            list = PatientDao.getAllPatient();
                        }

                        for (Patient p : list) {
                    
      out.write("\n");
      out.write("                    <tr style=\"text-align: center;\">\n");
      out.write("                        <td>");
      out.print( p.getCodePat());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getNomPat());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getPrenomPat());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getSexePat());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getAdressePat());
      out.write("</td>\n");
      out.write("                        <td><a href=\"editPat.jsp?codePat=");
      out.print( p.getCodePat());
      out.write("\"><button>Modifier</button></a></td>\n");
      out.write("                        <td><button onclick=\"confirmDelete('");
      out.print( p.getCodePat());
      out.write("')\">Supprimer</button></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            document.getElementById(\"addPatientButton\").addEventListener(\"click\", function () {\n");
      out.write("                var modal = document.createElement(\"div\");\n");
      out.write("                modal.id = \"modal\";\n");
      out.write("                modal.style.display = \"block\";\n");
      out.write("                modal.innerHTML = '<div class=\"modal-content\">' +\n");
      out.write("                        '<span class=\"close\">&times;</span>' +\n");
      out.write("                        '<iframe src=\"insertPat.jsp\"></iframe>' +\n");
      out.write("                        '</div>';\n");
      out.write("                document.body.insertBefore(modal, document.body.firstChild);\n");
      out.write("                document.body.style.overflow = \"hidden\";\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            document.addEventListener(\"click\", function (event) {\n");
      out.write("                if (event.target.classList.contains(\"close\")) {\n");
      out.write("                    var modal = document.getElementById(\"modal\");\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                    document.body.removeChild(modal);\n");
      out.write("                    document.body.style.overflow = \"auto\";\n");
      out.write("                } else if (event.target.id === \"modalOKButton\") {\n");
      out.write("                    var currentPage = window.location.href;\n");
      out.write("                    if (!document.getElementById(\"modal\") && currentPage.indexOf(\"listePat.jsp\") === -1) {\n");
      out.write("                        window.location.href = \"listePat.jsp\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            ");
 if (session.getAttribute("sm") != null) {
      out.write("\n");
      out.write("            var successMessage = \"");
      out.print( session.getAttribute("sm"));
      out.write("\";\n");
      out.write("            if (successMessage) {\n");
      out.write("                alert(successMessage);\n");
      out.write("            ");
 session.removeAttribute("sm"); 
      out.write("\n");
      out.write("            }\n");
      out.write("            ");
 } else if (session.getAttribute("em") != null) {
      out.write("\n");
      out.write("            var errorMessage = \"");
      out.print( session.getAttribute("em"));
      out.write("\";\n");
      out.write("            if (errorMessage) {\n");
      out.write("                alert(errorMessage);\n");
      out.write("            ");
 session.removeAttribute("em"); 
      out.write("\n");
      out.write("            }\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            function confirmDelete(codePat) {\n");
      out.write("                var confirmation = confirm(\"Êtes-vous sûr de vouloir supprimer ce patient ?\");\n");
      out.write("                if (confirmation) {\n");
      out.write("                    window.location.href = \"PatientController?codePat=\" + codePat + \"&for=delete\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

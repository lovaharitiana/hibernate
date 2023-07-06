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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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
      out.write("/cssPatient.css\"/>\n");
      out.write("        <title>Liste Patient</title>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/navbar.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\" >\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bouton_nav\" >\n");
      out.write("                <a href=\"index.jsp\"><i class=\"fas fa-home\"></i> Accueil</a>\n");
      out.write("                <a href=\"listePat.jsp\"><i class=\"fas fa-users\"></i> Patients</a>\n");
      out.write("                <a href=\"listeMed.jsp\"><i class=\"fas fa-user-md\"></i> Médecins</a>\n");
      out.write("                <a href=\"listeVis.jsp\"><i class=\"fas fa-calendar-alt\"></i> Visiter</a>\n");
      out.write("                <a href=\"index.jsp\"><i class=\"fas fa-sign-out-alt\"></i> Déconnexion</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"content\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"div1\">\n");
      out.write("                    <form method=\"GET\" action=\"PatientController\" class=\"mr-2\">\n");
      out.write("                        <input type=\"text\" name=\"search\" placeholder=\"Rechercher par codePat ou nomPat\"  class=\"input\"/>\n");
      out.write("                        <button type=\"submit\" style=\"padding: 10px 20px; background-color: #767928; color: white; border: none; border-radius: 4px; font-family: Times New Roman;\">\n");
      out.write("                            <i class=\"fa fa-search\" style=\"margin-right: 5px;\"></i>\n");
      out.write("                            Rechercher\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <a href=\"insertPat.jsp\">\n");
      out.write("                        <button style=\"padding: 10px 20px; background-color: #2E5930; color: white; border: none; border-radius: 4px; font-family: Times New Roman; margin-left: 530px\">\n");
      out.write("                            <i class=\"fa fa-user-plus\" style=\"margin-right: 5px;\"></i>\n");
      out.write("                            Ajouter Nouveau Patient\n");
      out.write("                        </button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table border=\"1\" style=\"border-collapse: collapse;\" width=\"80%\">\n");
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
      out.write("\"><i class=\"fas fa-edit\" title=\"Modifier\"></i></a></td>\n");
      out.write("                        <td><button onclick=\"confirmDelete('");
      out.print( p.getCodePat());
      out.write("')\"><i class=\"fas fa-trash\" title=\"Supprimer\"></i></button></td>  </tr>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            ");
 if (request.getParameter("successMessage") != null) {
      out.write("\n");
      out.write("            var successMessage = \"");
      out.print( request.getParameter("successMessage"));
      out.write("\";\n");
      out.write("            if (successMessage) {\n");
      out.write("                alert(successMessage);\n");
      out.write("            }\n");
      out.write("            ");
 } else if (request.getParameter("errorMessage") != null) {
      out.write("\n");
      out.write("            var errorMessage = \"");
      out.print( request.getParameter("errorMessage"));
      out.write("\";\n");
      out.write("            if (errorMessage) {\n");
      out.write("                alert(errorMessage);\n");
      out.write("                // Redirection vers listePat.jsp après avoir cliqué sur OK dans la boîte de dialogue\n");
      out.write("                window.location.href = \"listePat.jsp\";\n");
      out.write("            }\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            function confirmDelete(codePat) {\n");
      out.write("                var confirmation = confirm(\"Êtes-vous sûr de vouloir supprimer ce patient ?\");\n");
      out.write("                if (confirmation) {\n");
      out.write("                    window.location.href = \"PatientController?codePat=\" + codePat + \"&for=delete\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
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

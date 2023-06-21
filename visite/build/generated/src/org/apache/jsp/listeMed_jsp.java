package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Medecin;
import dao.MedecinDao;

public final class listeMed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"");
      out.print(request.getContextPath());
      out.write("/patient.css\" />\n");
      out.write("\n");
      out.write("        <title> Liste Medecin </title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/menu.css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bouton_nav\">\n");
      out.write("                <a href=\"#\">Accueil</a>\n");
      out.write("                <a href=\"#\">Patients</a>\n");
      out.write("                <a href=\"#\">Médecins</a>\n");
      out.write("                <a href=\"#\">Visiter</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <table border=\"1\" style=\"border-collapse: collapse;font-family: Times New Roman;\" width=\"90%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"6\">Liste Medecin </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Code Medecin</th>\n");
      out.write("                        <th>Nom Medecin</th>\n");
      out.write("                        <th>Prénoms Medecin</th>\n");
      out.write("                        <th>Grade Medecin</th>\n");
      out.write("                        <th colspan=\"2\">Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        ArrayList<Medecin> list = MedecinDao.getAllMedecin();
                        for (Medecin m : list) {
                    
      out.write("\n");
      out.write("                    <tr style=\"text-align: center;\">\n");
      out.write("                        <td>");
      out.print( m.getCodeMed());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getNomMed());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getPrenomMed());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( m.getGradeMed());
      out.write("</td>\n");
      out.write("                        <td><a href=\"editMed.jsp?codeMed=");
      out.print( m.getCodeMed());
      out.write("\"><button>Modifier</button></a></td>\n");
      out.write("                       <td><button onclick=\"confirmDelete('");
      out.print( m.getCodeMed());
      out.write("')\">Supprimer</button></td>\n");
      out.write("                  \n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                        <script>\n");
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
      out.write("                // Redirection vers listeMed.jsp après avoir cliqué sur OK dans la boîte de dialogue\n");
      out.write("                window.location.href = \"listeMed.jsp\";\n");
      out.write("            }\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            function confirmDelete(codeMed) {\n");
      out.write("                var confirmation = confirm(\"Êtes-vous sûr de vouloir supprimer ce medecin ?\");\n");
      out.write("                if (confirmation) {\n");
      out.write("                    window.location.href = \"MedecinController?codeMed=\" + codeMed + \"&for=delete\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

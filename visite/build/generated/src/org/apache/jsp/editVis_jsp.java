package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import dao.VisiterDao;
import entity.Visiter;

public final class editVis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Modifie Visiter</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"");
      out.print(request.getContextPath());
      out.write("/style1.css\" />\n");
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
      out.write("        <div class=\"content\">\n");
      out.write("            <form action=\"VisiterController\" name=\"update_form\" method=\"post\">\n");
      out.write("                <table style=\"font-family: Times New Roman;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"3\">Modifier Visiter</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            Visiter v = VisiterDao.findVisiter(Integer.parseInt(request.getParameter("id")));
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nom Medecin</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( v.getId());
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"codeMed\" value=\"");
      out.print( v.getMedecin().getCodeMed());
      out.write("\"  />\n");
      out.write("                                <input type=\"text\" name=\"nomMed\" value=\"");
      out.print( v.getMedecin().getNomMed());
      out.write("\" readonly />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nom Patient</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( v.getId());
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"codePat\" value=\"");
      out.print( v.getPatient().getCodePat());
      out.write("\"  />\n");
      out.write("                                <input type=\"text\" name=\"nomPat\" value=\"");
      out.print( v.getPatient().getNomPat());
      out.write("\" readonly />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            ");

                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String formattedDate = dateFormat.format(v.getDate());
                            
      out.write("\n");
      out.write("                            <td><input type=\"date\" name=\"date\" value=\"");
      out.print( formattedDate);
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" name=\"update\" value=\"Modifier\" />\n");
      out.write("                                <button type=\"button\" onclick=\"cancelForm()\">Annuler</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function cancelForm() {\n");
      out.write("                window.location.href = \"");
      out.print(request.getContextPath());
      out.write("/listeVis.jsp\";\n");
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

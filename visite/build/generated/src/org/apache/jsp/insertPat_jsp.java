package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertPat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ajout Patient</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"");
      out.print(request.getContextPath());
      out.write("/style.css\" />\n");
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
      out.write("            <form action=\"PatientController\" name=\"insert_form\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("                <table style=\"font-family: Times New Roman; background-color: #fefefe;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"3\">Ajouter Patient</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nom Patient</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"nomPat\"  placeholder=\"Entrez votre nom\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Prenoms Patient</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"prenomPat\"  placeholder=\"Entrez votre prénoms\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Sexe Patient</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"radio\" name=\"sexePat\" id=\"masculin\" value=\"masculin\" />\n");
      out.write("                                <label for=\"masculin\">Masculin</label>\n");
      out.write("\n");
      out.write("                                <input type=\"radio\" name=\"sexePat\" id=\"feminin\" value=\"feminin\" />\n");
      out.write("                                <label for=\"femin\">Féminin</label>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Adresse Patient</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"adressePat\" placeholder=\"Entrez votre adresse\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"insert\" value=\"Ajouter\" id=\"submitButton\" />\n");
      out.write("\n");
      out.write("                                <button id=\"cancelButton\" onclick=\"cancelForm()\">Annuler</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                    </tfoot>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function cancelForm() {\n");
      out.write("                window.location.href = \"");
      out.print(request.getContextPath());
      out.write("/listePat.jsp\";\n");
      out.write("            }\n");
      out.write("            function validateForm() {\n");
      out.write("                var nomPat = document.forms[\"insert_form\"][\"nomPat\"].value;\n");
      out.write("                var prenomPat = document.forms[\"insert_form\"][\"prenomPat\"].value;\n");
      out.write("                var sexePat = document.querySelector('input[name=\"sexePat\"]:checked');\n");
      out.write("                var adressePat = document.forms[\"insert_form\"][\"adressePat\"].value;\n");
      out.write("\n");
      out.write("                if (nomPat === \"\" || prenomPat === \"\" || sexePat === null || adressePat === \"\") {\n");
      out.write("                    alert(\"Veuillez remplir tous les champs du formulaire.\");\n");
      out.write("                    return false; // Empêche la soumission du formulaire si des champs sont vides\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
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

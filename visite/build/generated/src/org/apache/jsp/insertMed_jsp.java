package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertMed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ajout Medecin</title>\n");
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
      out.write("            <form action=\"MedecinController\" name=\"insert_form\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("                <table style=\"font-family: Times New Roman;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"3\">Ajouter Medecin</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nom Medecin</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"nomMed\"  placeholder=\"Entrez votre nom\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Prenoms Medecin</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"prenomMed\" placeholder=\"Entrez votre prénoms\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Grade Medecin</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"gradeMed\" placeholder=\"Entrez votre grade\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" name=\"insert\" value=\"Ajouter\" />\n");
      out.write("                                <button id=\"cancelButton\" onclick=\"cancelForm()\">Annuler</button>\n");
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
      out.write("/listeMed.jsp\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function validateForm() {\n");
      out.write("                var nomMed = document.forms[\"insert_form\"][\"nomMed\"].value;\n");
      out.write("                var prenomMed = document.forms[\"insert_form\"][\"prenomMed\"].value;\n");
      out.write("                var gradeMed = document.forms[\"insert_form\"][\"gradeMed\"].value;\n");
      out.write("\n");
      out.write("                if (nomMed === \"\" || prenomMed === \"\" || gradeMed === \"\") {\n");
      out.write("                    alert(\"Veuillez remplir tous les champs du formulaire.\");\n");
      out.write("                    return false; // Empêche la soumission du formulaire si des champs sont vides\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"cancelButton\").addEventListener(\"click\", function () {\n");
      out.write("                var modal = parent.document.getElementById(\"modal\");\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("                parent.document.body.removeChild(modal);\n");
      out.write("                parent.document.body.style.overflow = \"auto\";\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
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

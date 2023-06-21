package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.PatientDao;
import entity.Patient;
import dao.MedecinDao;
import java.util.ArrayList;
import entity.Medecin;

public final class insertVis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ajout Visite</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
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
      out.write("            <form action=\"VisiterController\" name=\"insert_form\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("                <table style=\"font-family: Times New Roman;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"3\">Ajouter Visite</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Code Patient</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"codePat\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\" disabled selected>-- Veuillez choisir le patient --</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        ArrayList<Patient> list1 = PatientDao.getAllPatient();
                                        for (Patient p : list1) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( p.getCodePat());
      out.write('"');
      out.write('>');
      out.print( p.getNomPat() + ' ' + p.getPrenomPat());
      out.write("</option>\n");
      out.write("\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Code Medecin</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"codeMed\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\" disabled selected>-- Veuillez choisir le medecin --</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        ArrayList<Medecin> list = MedecinDao.getAllMedecin();
                                        for (Medecin m : list) {

                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( m.getCodeMed());
      out.write('"');
      out.write('>');
      out.print( m.getNomMed() + ' ' + m.getPrenomMed());
      out.write("</option>\n");
      out.write("\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date visite</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"date\" name=\"date\"   /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" name=\"insert\" value=\"Ajouter\" id=\"submitButton\" />\n");
      out.write("                                <button type=\"button\" onclick=\"cancelForm()\">Annuler</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        </tbody>\n");
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
      out.write("            function validateForm() {\n");
      out.write("                var codePat = document.forms[\"insert_form\"][\"codePat\"].value;\n");
      out.write("                var codeMed = document.forms[\"insert_form\"][\"codeMed\"].value;\n");
      out.write("                var date = document.forms[\"insert_form\"][\"date\"].value;\n");
      out.write("\n");
      out.write("                if (codePat === \"\" || codeMed === \"\" || date === \"\") {\n");
      out.write("                    alert(\"Veuillez remplir tous les champs du formulaire.\");\n");
      out.write("                    return false; // Prevents form submission if any fields are empty\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Enable the \"Ajouter\" button if all form fields are filled\n");
      out.write("            var formInputs = document.querySelectorAll(\"form[name='insert_form'] input, form[name='insert_form'] select\");\n");
      out.write("            formInputs.forEach(function (input) {\n");
      out.write("                input.addEventListener(\"input\", function () {\n");
      out.write("                    var formValid = true;\n");
      out.write("                    formInputs.forEach(function (input) {\n");
      out.write("                        if (input.value === \"\") {\n");
      out.write("                            formValid = false;\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                    document.getElementById(\"submitButton\").disabled = !formValid;\n");
      out.write("                });\n");
      out.write("            });\n");
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

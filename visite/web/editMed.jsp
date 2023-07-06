<%@page import="entity.Medecin"%>
<%@page import="dao.MedecinDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Modifie Medecin</title>

        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style1.css" />
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <form action="MedecinController" name="update_form" method="post">
                <table style="font-family: Times New Roman;">
                    <thead>
                        <tr>
                            <th colspan="3">Modifier Medecin</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            Medecin m = MedecinDao.findMedecin(Integer.parseInt(request.getParameter("codeMed")));
                        %>
                        <tr>
                            <td>Nom Medecin</td>
                            <td>:</td>
                            <td>
                                <input type="hidden" name="codeMed" value="<%= m.getCodeMed()%>" />
                                <input type="text" name="nomMed" value="<%= m.getNomMed()%>" />
                            </td>
                        </tr>
                        <tr>
                            <td>Prenoms Medecin</td>
                            <td>:</td>
                            <td><input type="text" name="prenomMed" value="<%= m.getPrenomMed()%>"/></td>
                        </tr>
                        <tr>
                            <td>Grade Medecin</td>
                            <td>:</td>
                            <td><input type="text" name="gradeMed" value="<%= m.getGradeMed()%>"/></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td><input type="submit" name="update" value="Modifier" />
                                <button type="button" onclick="cancelForm()">Annuler</button>
                        </tr>
                    </tbody>

                </table>
            </form>
        </div>
        <script>
           function cancelForm() {
                window.location.href = "<%=request.getContextPath()%>/listeMed.jsp";
            }
        </script>
    </body>
</html>

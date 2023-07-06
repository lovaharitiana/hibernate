

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dao.VisiterDao"%>
<%@page import="entity.Visiter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Modifie Visiter</title>

        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style1.css" />
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <form action="VisiterController" name="update_form" method="post">
                <table style="font-family: Times New Roman;">
                    <thead>
                        <tr>
                            <th colspan="3">Modifier Visiter</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            Visiter v = VisiterDao.findVisiter(Integer.parseInt(request.getParameter("id")));
                        %>
                        <tr>
                            <td>Nom Medecin</td>
                            <td>:</td>
                            <td>
                                <input type="hidden" name="id" value="<%= v.getId()%>" />
                                <input type="hidden" name="codeMed" value="<%= v.getMedecin().getCodeMed()%>"  />
                                <input type="text" name="nomMed" value="<%= v.getMedecin().getNomMed()%>" readonly />
                            </td>
                        </tr>

                        <tr>
                            <td>Nom Patient</td>
                            <td>:</td>
                            <td>
                                <input type="hidden" name="id" value="<%= v.getId()%>" />
                                <input type="hidden" name="codePat" value="<%= v.getPatient().getCodePat()%>"  />
                                <input type="text" name="nomPat" value="<%= v.getPatient().getNomPat()%>" readonly />
                            </td>
                        </tr>
                        <tr>
                            <td>Date</td>
                            <td>:</td>
                            <%
                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String formattedDate = dateFormat.format(v.getDate());
                            %>
                            <td><input type="date" name="date" value="<%= formattedDate%>"/></td>
                        </tr>

                        <tr>
                            <td></td>
                            <td></td>
                            <td><input type="submit" name="update" value="Modifier" />
                                <button type="button" onclick="cancelForm()">Annuler</button>
                            </td>
                        </tr>
                    </tbody>

                </table>
            </form>
        </div>
        <script>
            function cancelForm() {
                window.location.href = "<%=request.getContextPath()%>/listeVis.jsp";
            }
        </script>
    </body>
</html>

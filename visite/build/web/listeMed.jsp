<%-- 
    Document   : listeMedecin
    Created on : 20 mai 2023, 14:35:50
    Author     : CE PC
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Medecin"%>
<%@page import="dao.MedecinDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style.css" />

        <title> Liste Medecin </title>
    </head>
    <body>
        <table border="1" style="border-collapse: collapse;font-family: Times New Roman;" width="70%">
            <thead>
                <tr>
                    <th colspan="6">Liste Medecin </th>
                </tr>
                <tr>
                    <th>Code Medecin</th>
                    <th>Nom Medecin</th>
                    <th>Prénoms Medecin</th>
                    <th>Grade Medecin</th>
                    <th colspan="2">Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<Medecin> list = MedecinDao.getAllMedecin();
                    for(Medecin m : list) {
                %>
                <tr style="text-align: center;">
                    <td><%= m.getCodeMed()%></td>
                    <td><%= m.getNomMed()%></td>
                    <td><%= m.getPrenomMed()%></td>
                    <td><%= m.getGradeMed()%></td>
                    <td><a href="editMed.jsp?codeMed=<%= m.getCodeMed()%>"><button>Modifier</button></a></td>
                    <td><a href="MedecinController?codeMed=<%= m.getCodeMed()%>&&for=delete"><button>Supprimer</button></a></td>

                </tr>
                <% }%>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="6">
                        <font color="blue">
                        <c:if test="${sessionScope.sm != null}">
                            <c:out value="${sessionScope.sm}" />
                            <c:remove scope="session" var="sm"/>

                        </c:if>
                        </font>
                        <font color="red">
                        <c:if test="${sessionScope.em != null}">
                            <c:out value="${sessionScope.em}" />
                            <c:remove scope="session" var="em"/>

                        </c:if>
                        </font>
                    </td>
                </tr>
            </tfoot>
        </table>
    </body>
</html>

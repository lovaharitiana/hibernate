<%-- 
    Document   : listeMedecin
    Created on : 20 mai 2023, 14:35:50
    Author     : CE PC
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dao.VisiterDao"%>
<%@page import="entity.Visiter"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style.css" />

        <title> Liste Visiter </title>
    </head>
    <body>
        <table border="1" style="border-collapse: collapse;font-family: Times New Roman;" width="70%">
            <thead>
                <tr>
                    <th colspan="6">Liste Visiter </th>
                </tr>
                <tr>
                    <th>Code Visiter</th>
                    <th>Nom Medecin</th>
                    <th>Nom Patient</th>
                    <th>Date</th>
                    <th colspan="2">Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<Visiter> list = VisiterDao.getAllVisiter();
                    for (Visiter v : list) {
                        
                %>
                <tr style="text-align: center;">
                    <td><%= v.getId()%></td>
                    <td><%= v.getMedecin().getNomMed()%></td>
                    <td><%= v.getPatient().getNomPat()%></td>
                    <td><%= v.getDate()%></td>
                    <td><a href="editVis.jsp?id=<%= v.getId()%>"><button>Modifier</button></a></td>
                    <td><a href="VisiterController?id=<%= v.getId()%>&&for=delete"><button>Supprimer</button></a></td>

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

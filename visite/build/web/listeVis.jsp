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
              href="<%=request.getContextPath()%>/patient.css" />

        <title> Liste Visiter </title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <table border="1" style="border-collapse: collapse;font-family: Times New Roman;" width="90%">
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
                        <td><button onclick="confirmDelete('<%= v.getId()%>')">Supprimer</button></td>

                    </tr>
                    <% }%>
                </tbody>

            </table>
        </div>
        <script>
            <% if (request.getParameter("successMessage") != null) {%>
            var successMessage = "<%= request.getParameter("successMessage")%>";
            if (successMessage) {
                alert(successMessage);
            }
            <% } else if (request.getParameter("errorMessage") != null) {%>
            var errorMessage = "<%= request.getParameter("errorMessage")%>";
            if (errorMessage) {
                alert(errorMessage);
                // Redirection vers listePat.jsp après avoir cliqué sur OK dans la boîte de dialogue
                window.location.href = "listeVis.jsp";
            }
            <% }%>

            function confirmDelete(id) {
                var confirmation = confirm("Êtes-vous sûr de vouloir supprimer ce visite ?");
                if (confirmation) {
                    window.location.href = "VisiterController?id=" + id + "&for=delete";
                }
            }
        </script>
    </body>
</html>

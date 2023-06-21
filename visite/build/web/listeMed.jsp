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
              href="<%=request.getContextPath()%>/patient.css" />

        <title> Liste Medecin </title>
        
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <table border="1" style="border-collapse: collapse;font-family: Times New Roman;" width="90%">
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
                        for (Medecin m : list) {
                    %>
                    <tr style="text-align: center;">
                        <td><%= m.getCodeMed()%></td>
                        <td><%= m.getNomMed()%></td>
                        <td><%= m.getPrenomMed()%></td>
                        <td><%= m.getGradeMed()%></td>
                        <td><a href="editMed.jsp?codeMed=<%= m.getCodeMed()%>"><button>Modifier</button></a></td>
                       <td><button onclick="confirmDelete('<%= m.getCodeMed()%>')">Supprimer</button></td>
                  
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
                // Redirection vers listeMed.jsp après avoir cliqué sur OK dans la boîte de dialogue
                window.location.href = "listeMed.jsp";
            }
            <% }%>

            function confirmDelete(codeMed) {
                var confirmation = confirm("Êtes-vous sûr de vouloir supprimer ce medecin ?");
                if (confirmation) {
                    window.location.href = "MedecinController?codeMed=" + codeMed + "&for=delete";
                }
            }
        </script>
    </body>
</html>

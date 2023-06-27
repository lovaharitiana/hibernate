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
              href="<%=request.getContextPath()%>/visiter.css" />

        <title> Liste Visiter </title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content" >


            <div class="div3">
                <form method="GET" action="VisiterController" class="mr-2">
                    <input type="date" name="startDate" placeholder="Date de début (AAAA-MM-JJ)" class="input" />
                    <input type="date" name="endDate" placeholder="Date de fin (AAAA-MM-JJ)" class="input" />
                    <button type="submit" style="padding: 10px 20px; background-color: #767928; color: white; border: none; border-radius: 4px; font-family: Times New Roman;">
                        <i class="fa fa-search" style="margin-right: 5px;"></i>
                        Rechercher
                    </button>
                </form>
                <a href="insertVis.jsp">
                    <button style="padding: 10px 20px; background-color: #2E5930; color: white; border: none; border-radius: 4px; font-family: Times New Roman; margin-left: 300px">
                        <i class="fa fa-user-plus" style="margin-right: 5px;"></i>
                        Ajouter Nouveau Visite
                    </button>
                </a>
            </div>
        </div>
        <table border="1" style="border-collapse: collapse;font-family: Times New Roman;" width="80%">
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
                    String startDate = request.getParameter("startDate");
                    String endDate = request.getParameter("endDate");
                    ArrayList<Visiter> list;

                    if (startDate != null && !startDate.isEmpty() && endDate != null && !endDate.isEmpty()) {
                        list = VisiterDao.searchVisiterByDates(startDate, endDate);
                    } else {
                        list = VisiterDao.getAllVisiter();
                    }

                    for (Visiter v : list) {
                %>

                <tr style="text-align: center;">
                    <td><%= v.getId()%></td>
                    <td><%= v.getMedecin().getNomMed()%></td>
                    <td><%= v.getPatient().getNomPat()%></td>
                    <td><%= v.getDate()%></td>
                    <td><a href="editVis.jsp?id=<%= v.getId()%>"><i class="fas fa-edit" title="Modifier"></i></a></td>
                    <td><button onclick="confirmDelete('<%= v.getId()%>')"><i class="fas fa-trash" title="Supprimer"></i></button></td>  </tr>

                </tr>
                <% }%>
            </tbody>

        </table>

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

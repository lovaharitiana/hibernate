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
              href="<%=request.getContextPath()%>/medecin.css" />

        <title> Liste Medecin </title>

    </head>
    <body>
        <%@include file="menu.jsp"%>
         <div class="content" >


            <div class="div2">
                 <form method="GET" action="MedecinController" class="mr-2">
                    <input type="text" name="search" placeholder="Rechercher par codeMed ou nomMed"  class="input"/>
                    <button type="submit" style="padding: 10px 20px; background-color: #767928; color: white; border: none; border-radius: 4px; font-family: Times New Roman;">
                        <i class="fa fa-search" style="margin-right: 5px;"></i>
                        Rechercher
                    </button>

                </form>
                <a href="insertMed.jsp">
                    <button style="padding: 10px 20px; background-color: #2E5930; color: white; border: none; border-radius: 4px; font-family: Times New Roman; margin-left: 530px">
                        <i class="fa fa-user-plus" style="margin-right: 5px;"></i>
                        Ajouter Nouveau Medecin
                    </button>
                </a>
            </div>



        </div>

        <table border="1" style="border-collapse: collapse;font-family: Times New Roman;" width="80%">
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
                    String searchQuery = request.getParameter("search");
                    ArrayList<Medecin> list;

                    if (searchQuery != null && !searchQuery.isEmpty()) {
                        list = MedecinDao.searchMedecin(searchQuery);
                    } else {
                        list = MedecinDao.getAllMedecin();
                    }

                    for (Medecin m : list) {
                %>
                <tr style="text-align: center;">
                    <td><%= m.getCodeMed()%></td>
                    <td><%= m.getNomMed()%></td>
                    <td><%= m.getPrenomMed()%></td>
                    <td><%= m.getGradeMed()%></td>
                    <td><a href="editMed.jsp?codeMed=<%= m.getCodeMed()%>"><i class="fas fa-edit" title="Modifier"></i></a></td>
                    <td><button onclick="confirmDelete('<%= m.getCodeMed()%>')"><i class="fas fa-trash" title="Supprimer"></i></button></td>  </tr>
                           
                </tr>
                <% }%>
            </tbody>

        </table>

        <script>
            <% if (request.getParameter ( 
                    "successMessage") != null) {%>
                            var successMessage = "<%= request.getParameter("successMessage")%>";
                            if (successMessage) {
                                alert(successMessage);
                            }
            <% }

                else if (request.getParameter ( 
                    "errorMessage") != null) {%>
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

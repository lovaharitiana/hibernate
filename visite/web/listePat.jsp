<%@page import="java.util.ArrayList"%>
<%@page import="entity.Patient"%>
<%@page import="dao.PatientDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/patient.css"/>
        <title>Liste Patient</title>
        


    </head>
    <body>

       
            <%@include file="menu.jsp"%>

            <div class="content" >


                <div class="div1">
                    <form method="GET" action="PatientController" class="mr-2">
                        <input type="text" name="search" placeholder="Rechercher par codePat ou nomPat"  class="input"/>
                        <button type="submit" style="padding: 10px 20px; background-color: #767928; color: white; border: none; border-radius: 4px; font-family: Times New Roman;">
                            <i class="fa fa-search" style="margin-right: 5px;"></i>
                            Rechercher
                        </button>

                    </form>
                    <a href="insertPat.jsp">
                        <button style="padding: 10px 20px; background-color: #2E5930; color: white; border: none; border-radius: 4px; font-family: Times New Roman; margin-left: 530px">
                            <i class="fa fa-user-plus" style="margin-right: 5px;"></i>
                            Ajouter Nouveau Patient
                        </button>
                    </a>
                </div>



            </div>


            <table border="1" style="border-collapse: collapse;" width="80%">
                <thead>
                    <tr>
                        <th colspan="8">Liste Patient</th>
                    </tr>
                    <tr>
                        <th>Code Patient</th>
                        <th>Nom Patient</th>
                        <th>Prénoms Patient</th>
                        <th>Sexe Patient</th>
                        <th>Adresse Patient</th>
                        <th colspan="2">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        String searchQuery = request.getParameter("search");
                        ArrayList<Patient> list;

                        if (searchQuery != null && !searchQuery.isEmpty()) {
                            list = PatientDao.searchPatient(searchQuery);
                        } else {
                            list = PatientDao.getAllPatient();
                        }

                        for (Patient p : list) {
                    %>
                    <tr style="text-align: center;">
                        <td><%= p.getCodePat()%></td>
                        <td><%= p.getNomPat()%></td>
                        <td><%= p.getPrenomPat()%></td>
                        <td><%= p.getSexePat()%></td>
                        <td><%= p.getAdressePat()%></td>
                        <td><a href="editPat.jsp?codePat=<%= p.getCodePat()%>"><i class="fas fa-edit" title="Modifier"></i></a></td>
                        <td><button onclick="confirmDelete('<%= p.getCodePat()%>')"><i class="fas fa-trash" title="Supprimer"></i></button></td>  </tr>
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
                window.location.href = "listePat.jsp";
            }
            <% }%>

            function confirmDelete(codePat) {
                var confirmation = confirm("Êtes-vous sûr de vouloir supprimer ce patient ?");
                if (confirmation) {
                    window.location.href = "PatientController?codePat=" + codePat + "&for=delete";
                }
            }
        </script>


      



    </body>


</html>




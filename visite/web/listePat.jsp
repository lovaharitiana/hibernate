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
        <style>
            body {
                margin: 0;
                padding: 0;
            }
            /* Styles for the navbar */
            .navbar {
                width: 200px;
                background-color: #f1f1f1;
                padding: 10px;
                height: 100%;
                position: fixed;
                overflow: auto;
                display: flex;
                flex-direction: column;
                align-items: center;
            }
            .navbar a {
                display: block;
                color: #000;
                padding: 8px 16px;
                text-decoration: none;
            }
            .navbar a:hover {
                background-color: #555;
                color: white;
            }
            .content {
                margin-left: 220px;
                padding: 16px;
            }
            .logo{
                width: 100px;
                height: 80px;
                background-image: url(<%= request.getContextPath()%>/logo.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                margin-bottom: 10px;
            }
            .bouton_nav a {

                margin-top: 60px;
            }
            .nav_accueil{
                display: flex;
                width: 100px;
                height: 50px;
                background-color: black;

            }

            #modal {
                display: none;
                position: fixed;
                z-index: 1;
                left: 0;
                top: 0;
                width: 100%;
                height: 100vh;
                background-color: rgba(0, 0, 0, 0.4);
                overflow: hidden;
            }

            .modal-content {

                margin: 0 auto;
                padding: 20px;

                width: 80%;
                max-width: 600px;
                position: relative;
                top: 250px;
                transform: translateY(-50%);
            }
            .close {
                position: absolute;
                top: 10px;
                right: 10px;
                cursor: pointer;
                background-color: red;
            }



            iframe {
                width: 100%;
                height: calc(100vh - 100px);
                border: none;


            }

        </style>
    </head>
    <body>
        <div class="navbar">
            <div class="logo">
            </div>
            <div class="bouton_nav">
                <a href="#">Accueil</a>
                <a href="#">Patients</a>
                <a href="#">Médecins</a>
                <a href="#">Visiter</a>
            </div>
        </div>
        <div class="content">

            <form method="GET" action="PatientController">
                <input type="text" name="search" placeholder="Rechercher par codePat ou nomPat" />
                <input type="submit" value="Rechercher" />
            </form>
            <button id="addPatientButton">Ajouter</button>
            <table border="1" style="border-collapse: collapse;" width="90%">
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
                        <td><a href="editPat.jsp?codePat=<%= p.getCodePat()%>"><button>Modifier</button></a></td>
                        <td><button onclick="confirmDelete('<%= p.getCodePat()%>')">Supprimer</button></td>
                    </tr>
                    <% }%>
                </tbody>


            </table>
        </div>
        <script>
            document.getElementById("addPatientButton").addEventListener("click", function () {
                var modal = document.createElement("div");
                modal.id = "modal";
                modal.style.display = "block";
                modal.innerHTML = '<div class="modal-content">' +
                        '<span class="close">&times;</span>' +
                        '<iframe src="insertPat.jsp"></iframe>' +
                        '</div>';
                document.body.insertBefore(modal, document.body.firstChild);
                document.body.style.overflow = "hidden";
            });

            document.addEventListener("click", function (event) {
                if (event.target.classList.contains("close")) {
                    var modal = document.getElementById("modal");
                    modal.style.display = "none";
                    document.body.removeChild(modal);
                    document.body.style.overflow = "auto";
                } else if (event.target.id === "modalOKButton") {
                    var currentPage = window.location.href;
                    if (!document.getElementById("modal") && currentPage.indexOf("listePat.jsp") === -1) {
                        window.location.href = "listePat.jsp";
                    }
                }
            });

            <% if (session.getAttribute("sm") != null) {%>
            var successMessage = "<%= session.getAttribute("sm")%>";
            if (successMessage) {
                alert(successMessage);
            <% session.removeAttribute("sm"); %>
            }
            <% } else if (session.getAttribute("em") != null) {%>
            var errorMessage = "<%= session.getAttribute("em")%>";
            if (errorMessage) {
                alert(errorMessage);
            <% session.removeAttribute("em"); %>
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




<%@page import="dao.PatientDao"%>
<%@page import="entity.Patient"%>
<%@page import="dao.MedecinDao"%>
<%@page import="java.util.ArrayList"%>

<%@page import="entity.Medecin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Ajout Visite</title>
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style.css" />
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <form action="VisiterController" name="insert_form" method="post" onsubmit="return validateForm()">
                <table style="font-family: Times New Roman;">
                    <thead>
                        <tr>
                            <th colspan="3">Ajouter Visite</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Code Patient</td>
                            <td>:</td>
                            <td>
                                <select name="codePat" class="form-control">
                                    <option value="" disabled selected>-- Veuillez choisir le patient --</option>

                                    <%
                                        ArrayList<Patient> list1 = PatientDao.getAllPatient();
                                        for (Patient p : list1) {
                                    %>
                                    <option value="<%= p.getCodePat()%>"><%= p.getNomPat() + ' ' + p.getPrenomPat()%></option>

                                    <% }%>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Code Medecin</td>
                            <td>:</td>
                            <td>
                                <select name="codeMed" class="form-control">
                                    <option value="" disabled selected>-- Veuillez choisir le medecin --</option>

                                    <%
                                        ArrayList<Medecin> list = MedecinDao.getAllMedecin();
                                        for (Medecin m : list) {

                                    %>
                                    <option value="<%= m.getCodeMed()%>"><%= m.getNomMed() + ' ' + m.getPrenomMed()%></option>

                                    <% }%>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Date visite</td>
                            <td>:</td>
                            <td><input type="date" name="date"   /></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td><input type="submit" name="insert" value="Ajouter" id="submitButton" />
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
            function validateForm() {
                var codePat = document.forms["insert_form"]["codePat"].value;
                var codeMed = document.forms["insert_form"]["codeMed"].value;
                var date = document.forms["insert_form"]["date"].value;

                if (codePat === "" || codeMed === "" || date === "") {
                    alert("Veuillez remplir tous les champs du formulaire.");
                    return false; // Prevents form submission if any fields are empty
                }
            }

            // Enable the "Ajouter" button if all form fields are filled
            var formInputs = document.querySelectorAll("form[name='insert_form'] input, form[name='insert_form'] select");
            formInputs.forEach(function (input) {
                input.addEventListener("input", function () {
                    var formValid = true;
                    formInputs.forEach(function (input) {
                        if (input.value === "") {
                            formValid = false;
                        }
                    });
                    document.getElementById("submitButton").disabled = !formValid;
                });
            });
        </script>
    </body>
</html>

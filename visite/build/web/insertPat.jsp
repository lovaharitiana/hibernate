<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Ajout Patient</title>

        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style1.css" />
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <form action="PatientController" name="insert_form" method="post" onsubmit="return validateForm()">
                <table style="font-family: Times New Roman; background-color: #fefefe;">
                    <thead>
                        <tr>
                            <th colspan="3">Ajouter Patient</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Nom Patient</td>
                            <td>:</td>
                            <td><input type="text" name="nomPat"  placeholder="Entrez votre nom"/></td>
                        </tr>
                        <tr>
                            <td>Prenoms Patient</td>
                            <td>:</td>
                            <td><input type="text" name="prenomPat"  placeholder="Entrez votre prénoms"/></td>
                        </tr>
                        <tr>
                            <td>Sexe Patient</td>
                            <td>:</td>
                            <td>
                                <input type="radio" name="sexePat" id="masculin" value="masculin" />
                                <label for="masculin">Masculin</label>

                                <input type="radio" name="sexePat" id="feminin" value="feminin" />
                                <label for="femin">Féminin</label>
                            </td>
                        </tr>
                        <tr>
                            <td>Adresse Patient</td>
                            <td>:</td>
                            <td><input type="text" name="adressePat" placeholder="Entrez votre adresse"/></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td> <input type="submit" name="insert" value="Ajouter" id="submitButton" />

                                <button id="cancelButton" onclick="cancelForm()">Annuler</button>
                            </td>
                        </tr>
                    </tbody>

                    </tfoot>
                </table>
            </form>
        </div>
        <script>
            function cancelForm() {
                window.location.href = "<%=request.getContextPath()%>/listePat.jsp";
            }
            function validateForm() {
                var nomPat = document.forms["insert_form"]["nomPat"].value;
                var prenomPat = document.forms["insert_form"]["prenomPat"].value;
                var sexePat = document.querySelector('input[name="sexePat"]:checked');
                var adressePat = document.forms["insert_form"]["adressePat"].value;

                if (nomPat === "" || prenomPat === "" || sexePat === null || adressePat === "") {
                    alert("Veuillez remplir tous les champs du formulaire.");
                    return false; // Empêche la soumission du formulaire si des champs sont vides
                }
            }

        </script>
    </body>
</html>

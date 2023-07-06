<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Ajout Medecin</title>

        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style1.css" />
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <div class="content">
            <form action="MedecinController" name="insert_form" method="post" onsubmit="return validateForm()">
                <table style="font-family: Times New Roman;">
                    <thead>
                        <tr>
                            <th colspan="3">Ajouter Medecin</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Nom Medecin</td>
                            <td>:</td>
                            <td><input type="text" name="nomMed"  placeholder="Entrez votre nom"/></td>
                        </tr>
                        <tr>
                            <td>Prenoms Medecin</td>
                            <td>:</td>
                            <td><input type="text" name="prenomMed" placeholder="Entrez votre prénoms"/></td>
                        </tr>
                        <tr>
                            <td>Grade Medecin</td>
                            <td>:</td>
                            <td><input type="text" name="gradeMed" placeholder="Entrez votre grade"/></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td><input type="submit" name="insert" value="Ajouter" />
                                <button id="cancelButton" onclick="cancelForm()">Annuler</button>
                            </td>
                        </tr>
                    </tbody>

                </table>
            </form>
        </div>
        <script>
            function cancelForm() {
                window.location.href = "<%=request.getContextPath()%>/listeMed.jsp";
            }

            function validateForm() {
                var nomMed = document.forms["insert_form"]["nomMed"].value;
                var prenomMed = document.forms["insert_form"]["prenomMed"].value;
                var gradeMed = document.forms["insert_form"]["gradeMed"].value;

                if (nomMed === "" || prenomMed === "" || gradeMed === "") {
                    alert("Veuillez remplir tous les champs du formulaire.");
                    return false; // Empêche la soumission du formulaire si des champs sont vides
                }
            }
            document.getElementById("cancelButton").addEventListener("click", function () {
                var modal = parent.document.getElementById("modal");
                modal.style.display = "none";
                parent.document.body.removeChild(modal);
                parent.document.body.style.overflow = "auto";
            });
        </script>

    </body>
</html>

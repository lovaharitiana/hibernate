<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Ajout Patient</title>

        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style.css" />
    </head>
    <body>
        <form action="PatientController" name="insert_form" method="post">
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
                        <td><input type="text" name="nomPat" /></td>
                    </tr>
                    <tr>
                        <td>Prenoms Patient</td>
                        <td>:</td>
                        <td><input type="text" name="prenomPat" /></td>
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
                        <td><input type="text" name="adressePat" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><input type="submit" name="insert" value="Ajouter" />
                            <button id="cancelButton">Annuler</button> </td>
                    </tr>
                </tbody>
                
                </tfoot>
            </table>
        </form>
        <script>
            document.getElementById("cancelButton").addEventListener("click", function () {
                var modal = parent.document.getElementById("modal");
                modal.style.display = "none";
                parent.document.body.removeChild(modal);
                parent.document.body.style.overflow = "auto";
            });
        </script>
    </body>
</html>

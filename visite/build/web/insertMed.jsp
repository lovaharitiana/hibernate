<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Ajout Medecin</title>
        
        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style.css" />
    </head>
    <body>
        <form action="MedecinController" name="insert_form" method="post">
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
                        <td><input type="text" name="nomMed" /></td>
                    </tr>
                    <tr>
                        <td>Prenoms Medecin</td>
                        <td>:</td>
                        <td><input type="text" name="prenomMed" /></td>
                    </tr>
                    <tr>
                        <td>Grade Medecin</td>
                        <td>:</td>
                        <td><input type="text" name="gradeMed" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><input type="submit" name="insert" value="Ajouter" /></td>
                    </tr>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="3">
                            <font color="blue">
                            <c:if test="${sessionScope.sm != null}">
                                <c:out value="${sessionScope.sm}" />
                                <c:remove scope="session" var="sm"/>

                            </c:if>
                            </font>
                            <font color="red">
                            <c:if test="${sessionScope.em != null}">
                                <c:out value="${sessionScope.em}" />
                                <c:remove scope="session" var="em"/>

                            </c:if>
                            </font>

                        </td>
                    </tr>
                </tfoot>
            </table>
        </form>
    </body>
</html>

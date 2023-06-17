<%@page import="entity.Patient"%>
<%@page import="dao.PatientDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Modifie Patient</title>
        
        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/style.css" />
    </head>
    <body>
        <form action="PatientController" name="update_form" method="post">
            <table style="font-family: Times New Roman;">
                <thead>
                    <tr>
                        <th colspan="3">Modifier Patient</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                       Patient p =  PatientDao.findPatient(Integer.parseInt(request.getParameter("codePat")));
                    %>
                    <tr>
                        <td>Nom Patient</td>
                        <td>:</td>
                        <td>
                            <input type="hidden" name="codePat" value="<%= p.getCodePat() %>" />
                            <input type="text" name="nomPat" value="<%= p.getNomPat() %>" />
                        </td>
                    </tr>
                    <tr>
                        <td>Prenoms Patient</td>
                        <td>:</td>
                        <td><input type="text" name="prenomPat" value="<%= p.getPrenomPat() %>"/></td>
                    </tr>
                    <tr>
                        <td>Sexe Patient</td>
                        <td>:</td>
                        <td><input type="radio" name="sexePat" id="masculin" value="masculin" />
                            <label for="masculin">Masculin</label>

                            <input type="radio" name="sexePat" id="feminin" value="feminin" />
                            <label for="femin">Féminin</label></td>
                    </tr>
                     <tr>
                        <td>Adresse Patient</td>
                        <td>:</td>
                        <td><input type="text" name="adressePat" value="<%= p.getAdressePat() %>"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><input type="submit" name="update" value="Modifier" /></td>
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

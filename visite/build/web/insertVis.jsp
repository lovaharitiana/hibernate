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
        <form action="VisiterController" name="insert_form" method="post">
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

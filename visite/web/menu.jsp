<%-- 
    Document   : menu
    Created on : 19 juin 2023, 10:44:13
    Author     : CE PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/cssMenu.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">


    </head>
    <body>
        <div class="navbar" >
            <div class="logo">
            </div>
            <div class="bouton_nav" >
                <a href="index.jsp"><i class="fas fa-home"></i> Accueil</a>
                <a href="listePat.jsp"><i class="fas fa-users"></i> Patients</a>
                <a href="listeMed.jsp"><i class="fas fa-user-md"></i> Médecins</a>
                <a href="listeVis.jsp"><i class="fas fa-calendar-alt"></i> Visiter</a>
            </div>
        </div>

    </body>
</html>

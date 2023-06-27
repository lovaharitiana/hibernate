<%-- 
    Document   : index
    Created on : 18 mai 2023, 15:05:53
    Author     : CE PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Médecin - Accueil</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
                margin: 0;
                padding: 0;
            }

            .container {
                max-width: 600px;
                margin: 100px auto;
                padding: 20px;
                background-color: #ffffff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                text-align: center;
                font-family: "Times New Roman", Times, serif;
            }

            h1 {
                font-size: 28px;
                color: #333333;
                margin-top: 0;
            }

            p {
                font-size: 16px;
                color: #666666;
            }

            .btn {
                display: inline-block;
                padding: 10px 20px;
                background-color: #4CAF50;
                color: #ffffff;
                text-decoration: none;
                border-radius: 4px;
                transition: background-color 0.3s;
            }

            .btn:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <img src="accueil.jpg" alt="Gestion de Médecin" style="max-width: 300px; margin-bottom: 20px;">
            <h1>Bienvenue dans l'application de Gestion de Médecin</h1>
            <p>Cette application vous permet de gérer facilement les informations relatives aux médecins.</p>
            <p>Cliquez sur le bouton ci-dessous pour commencer :</p>
            <form action="login.jsp">
                <button class="btn" type="submit">Commencer</button>
            </form>
        </div>
    </body>
</html>

<%-- 
    Document   : login
    Created on : 27 juin 2023, 10:00:22
    Author     : CE PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Médecin - Connexion</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
                margin: 0;
                padding: 0;
            }
            
            .container {
                max-width: 500px; 
                margin: 100px auto;
                padding: 20px;
                background-color: #ffffff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                text-align: center;
            }
            
            h1 {
                font-size: 28px;
                color: #333333;
                margin-top: 0;
            }
            
            input[type="text"],
            input[type="password"] {
                width: 100%;
                padding: 10px;
                margin-bottom: 10px;
                border: 1px solid #cccccc;
                border-radius: 4px;
                box-sizing: border-box;
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
            
            .error-message {
                color: #ff0000;
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Connexion</h1>
            <%-- Afficher un message d'erreur si l'utilisateur tente de se connecter avec des identifiants incorrects --%>
            <% if (request.getParameter("error") != null && request.getParameter("error").equals("true")) { %>
                <p class="error-message">Identifiants invalides. Veuillez réessayer.</p>
            <% } %>
            <form action="listePat.jsp" method="post">
                <input type="text" name="email" placeholder="Email" required><br>
                <input type="password" name="password" placeholder="Mot de passe" required><br>
                <button class="btn" type="submit">Se connecter</button>
            </form>
        </div>
    </body>
</html>

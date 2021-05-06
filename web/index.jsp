<%-- 
    Document   : index
    Created on : 5 mai 2021, 12:04:25
    Author     : joelg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css" />
    </head>
    <body>
        <div class="center mt-120">
            <div>
                <img src="img/1.jpg" alt="" width="15%" class="img">
            </div>
            <div>
                <h2 class="titre-perso">DEV-1-2021</h2>
            </div>
            <form action="login" method="POST">
                <div class="zone-group">
                    <input type="text" placeholder="login" value="${param['login']}" class="zone-saisie" id="login" name="login" required>
                </div>
                <div class="zone-group">
                    <input type="password" placeholder="password" id="password" name="password" class="zone-saisie" required>
                </div>
                <button type="submit" class="bt-perso">valider</button>
                <br>
                <p class="text-err">${msg}</p>
            </form>

            <p class="text-err" id="msg-err"></p>
        </div>
    </body>
</html>

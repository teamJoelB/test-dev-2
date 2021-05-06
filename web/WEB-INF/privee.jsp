<%-- 
    Document   : privee
    Created on : 5 mai 2021, 16:36:59
    Author     : joelg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>

        <br>
        <div class="container">
            <h2 class="titre-perso">On est sur le privée</h2>
            <div class="mt-120">
                <div class="row">
                    <div class="col-sm-4">
                        <form action="privee" method="POST">
                            <div class="form-group">
                                <input type="text" name="info" class="form-control">
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">valider</button>
                        </form>
                    </div>
                    <div class="col-sm-2"></div>
                    <div class="col-sm-6">
                        <c:forEach var="n" items="${notes}">
                            <div class="card card-shadow">
                                <div class="card-body">
                                    ${n.contenue}
                                </div>
                            </div> 
                                <br>
                        </c:forEach>                     
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

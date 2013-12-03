<%-- 
    Document   : index
    Created on : 5 nov. 2013, 14:41:10
    Author     : lmartinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="_entête.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GSB Medecin</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div id="contenu">
        <h1>Liste des spécialités</h1>
        <br/> 
        <form action="Control?choix=lSpe" method="post">
            <select name ="nomSpe">
                Departement:
                <c:forEach var="laSpe" items="${listeSpes}">
                    <option value="${laSpe.nom}">${laSpe.nom}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Valider">
        </form>
        </div>
    </body>
</html>

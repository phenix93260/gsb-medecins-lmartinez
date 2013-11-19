<%-- 
    Document   : index
    Created on : 5 nov. 2013, 14:41:10
    Author     : lmartinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GSB Medecin</title>
    </head>
    <body>
        <h1>Liste des département</h1>
        <br/> 
        <form action="Control?choix=lDep" method="post">
            <select name ="numDep">
                Departement:
                <c:forEach var="leDep" items="${listeDeps}">
                    <option value="${leDep.num}">${leDep.num}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Valider">
        </form>
    </body>
</html>

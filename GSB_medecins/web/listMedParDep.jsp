<%-- 
    Document   : listMedParDep
    Created on : 19 nov. 2013, 14:24:38
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
        <h1>Liste des médecins par département</h1>
        <br/> 
        <table border="1" cellspacing="0px" width="95%" align="center">
            <tr><th>Nom</th><th>Prénom</th><th>Adresse</th><th>Tel</th></tr>
        <c:forEach var="listeMedParDep" items="${listeMeds}">
            <tr><td>${listeMedParDep.nom}</td><td>${listeMedParDep.prenom}</td>
            <td>${listeMedParDep.adresse}</td><td>${listeMedParDep.tel}</td></tr>
        </c:forEach>
        </table>
</body>
</html>

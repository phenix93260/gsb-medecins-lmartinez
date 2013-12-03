<%-- 
    Document   : listMedParDep
    Created on : 19 nov. 2013, 14:24:38
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
        <h1>Liste des médecins par specialité</h1>
        <br/> 
        <table border="1" cellspacing="0px" width="95%" align="center">
            <tr><th>Nom</th><th>Prénom</th><th>Adresse</th><th>Tel</th><th>Specialité complementaire</th></tr>
        <c:forEach var="listeMedParSpe" items="${listeMeds}">
            <tr><td>${listeMedParSpe.nom}</td><td>${listeMedParSpe.prenom}</td>
            <td>${listeMedParSpe.adresse}</td><td>${listeMedParSpe.tel}</td><td>${listeMedParSpe.spe}</td></tr>
        </c:forEach>
        </table>
        </div>
</body>
</html>

<%-- 
    Document   : listeMed
    Created on : 19 nov. 2013, 14:40:13
    Author     : lmartinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="_entête.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des Medecins par nom</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div id="contenu">
        <h1>Recherche des medecins par nom</h1>
        <br/>
        <form action="Control?choix=lMed" method="post">
        <input type="text" name="lMedNom"><input type="submit"name="rechercher" value="Rechercher">
        </form>
        </div>
    </body>
</html>

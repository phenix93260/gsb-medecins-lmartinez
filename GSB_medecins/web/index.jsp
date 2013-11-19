<%-- 
    Document   : index
    Created on : 12 nov. 2013, 15:24:17
    Author     : tvuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <form action="Control?choix=lDep" method="post">
            <input type="submit" value="Liste des médecins par département"</input>
        </form>
        <form action="Control?choix=lMep" method="post">
            <input type="submit" value="Liste des médecins par nom"</input>
        </form>
    </body>
</html>
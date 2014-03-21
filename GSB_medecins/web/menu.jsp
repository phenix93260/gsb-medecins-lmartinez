<%-- 
    Document   : menu
    Created on : 2 déc. 2013, 11:55:55
    Author     : lmartinez
--%>
<!-- commentaire -->
<div id="menuGauche">
    <form action="Control?choix=lDep" method="post">
        <input type="submit" value="Liste des médecins par département"</input>
    </form>
    <form action="Control?choix=lMed" method="post">
        <input type="submit" value="Liste des médecins par nom"</input>
    </form>
    <form action="Control?choix=lSpe" method="post">
        <input type="submit" value="Liste des médecins par specialite complémentaire"</input> 
    </form>
</div>

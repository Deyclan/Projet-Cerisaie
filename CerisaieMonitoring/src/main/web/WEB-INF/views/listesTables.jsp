<%--
  Created by IntelliJ IDEA.
  User: natjo
  Date: 14/06/2018
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>infos utiles</title>
</head>
<body>
<TABLE BORDER="1">
    <CAPTION>Tableau des Activites</CAPTION>
    <TR>
        <TH>CodeSport</TH>
        <TH>DateJour</TH>
        <TH>NumSejour</TH>
        <TH>NbLoc</TH>

    </TR>

    <c:forEach items="${mesActivites}" var="item">
        <tr>
            <td>${item.codeSport}</td>
            <td>${item.dateJour}</td>
            <td>${item.numSej}</td>
            <td>${item.nbLoc}</td>
        </tr>
    </c:forEach>
</TABLE>

<TABLE BORDER="1">
    <CAPTION>Tableau des Clients</CAPTION>
    <TR>
        <TH>NumeroClient</TH>
        <TH>Nom</TH>
        <TH>Adresse</TH>
        <TH>CodePostal</TH>
        <TH>Ville</TH>
        <TH>PieceClient</TH>
        <TH>NumeroPieceClient</TH>

    </TR>

    <c:forEach items="${mesClients}" var="item">
        <tr>
            <td>${item.numCli}</td>
            <td>${item.nomCli}</td>
            <td>${item.adrRueCli}</td>
            <td>${item.cpCli}</td>
            <td>${item.villeCli}</td>
            <td>${item.pieceCli}</td>
            <td>${item.numPieceCli}</td>

        </tr>
    </c:forEach>
</TABLE>

<TABLE BORDER="1">
    <CAPTION>Tableau des Emplacements</CAPTION>
    <TR>
        <TH>NumeroEmplacement</TH>
        <TH>CodeTypeEmplacement</TH>
        <TH>Surface</TH>
        <TH>NbPersonnesMax</TH>

    </TR>

    <c:forEach items="${mesEmplacements}" var="item">
        <tr>
            <td>${item.numEmpl}</td>
            <td>${item.codeTypeE}</td>
            <td>${item.surfaceEmpl}</td>
            <td>${item.nbPersMaxEmpl}</td>

        </tr>
    </c:forEach>
</TABLE>

<TABLE BORDER="1">
    <CAPTION>Tableau des Sejours</CAPTION>
    <TR>
        <TH>NumeroSejour</TH>
        <TH>NumeroClient</TH>
        <TH>NumeroEmplacement</TH>
        <TH>DateDebut</TH>
        <TH>DateFin</TH>
        <TH>NbPersonnes</TH>

    </TR>

    <c:forEach items="${mesSejours}" var="item">
        <tr>
            <td>${item.numSej}</td>
            <td>${item.numCli}</td>
            <td>${item.numEmpl}</td>
            <td>${item.datedebSej}</td>
            <td>${item.dateFinSej}</td>
            <td>${item.nbPersonnes}</td>

        </tr>
    </c:forEach>
</TABLE>

<TABLE BORDER="1">
    <CAPTION>Tableau des Sport</CAPTION>
    <TR>
        <TH>CodeSport</TH>
        <TH>Libelle</TH>
        <TH>UniteTemps</TH>
        <TH>TarifUnite</TH>
    </TR>

    <c:forEach items="${mesSports}" var="item">
        <tr>
            <td>${item.codeSport}</td>
            <td>${item.libelleSport}</td>
            <td>${item.uniteTpsSport}</td>
            <td>${item.tarifUnite}</td>
        </tr>
    </c:forEach>
</TABLE>

<TABLE BORDER="1">
    <CAPTION>Tableau des Types d'emplacement</CAPTION>
    <TR>
        <TH>CodeTypeEmplacement</TH>
        <TH>Libelle</TH>
        <TH>Tarif</TH>
    </TR>

    <c:forEach items="${mesTypesEmplacement}" var="item">
        <tr>
            <td>${item.codeTypeE}</td>
            <td>${item.libtypepl}</td>
            <td>${item.tariftypepl}</td>
        </tr>
    </c:forEach>
</TABLE>


</body>
</html>

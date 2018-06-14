<%--
  Created by IntelliJ IDEA.
  User: Nejko
  Date: 03-Jun-18
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/mdb.min.css">
    <link rel="stylesheet" href="resources/css/myCSS.css">
    <script type="text/javascript" src="resources/js/formTest.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>La Cerisaie - Inscription</title>
</head>
<body>

<div class="py-5">
    <jsp:include page="menu.jsp"/>
</div>

<div class="form-style-5 pt-5 pb-5" style="background-image: linear-gradient(120deg, #fdfbfb 0%, #ebedee 100%);">
    <form name='inscription' method="post" action="Controleur?action=envoiInscription" onsubmit="return test()">
            <legend><span class="number orange">1</span>Ajoutez une activité</legend>
            <label for="activity">Choix :</label>
            <select id="activity" class="form-control browser-default">
                <c:forEach items="${activites}" var="act">
                    <option class="warning" value="${act.idActivite}">${act.nomActivite}</option>
                </c:forEach>
            </select>
            <legend><span class="number orange">2</span>Précisez quand</legend>
        <label for="nbActivite">Choisissez le nombre de temps:</label>
        <input type="number" step="1" id="nbActivite" name="jourActivite" required min="1">

            <label for="jourActivite">Choisissez le(s) jour(s):</label>
            <input type="date" id="jourActivite" name="jourActivite" required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}">
        <input type="submit" class="btn-warning" value="S'inscrire" />
    </form>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>

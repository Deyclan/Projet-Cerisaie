<%--
  Created by IntelliJ IDEA.
  User: Nejko
  Date: 03-Jun-18
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/mdb.min.css">
    <link rel="stylesheet" href="resources/css/myCSS.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>La Cerisaie - Activités</title>
</head>

<body>
<header class="py-5">
    <jsp:include page="menu.jsp"/>
</header>
<section class=" pt-5 pb-5" style="background-image: linear-gradient(120deg, #fdfbfb 0%, #ebedee 100%);">
    <div class="card-deck cards">
        <!-- Card -->
        <div class="card mb-4">
            <!--Card image-->
            <div class="view overlay">
                <img class="card-img-top" src="resources/img/tennis.jpg" alt="Tennis">
                <a href="#!">
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>
            <!--Card content-->
            <div class="card-body">
                <!--Title-->
                <h4 class="card-title">Tennis</h4>
                <!--Text-->
                <p class="card-text">Des terrains de tennis à votre disposition.</p>
                <p class="card-text amber-text">Durée min. : 1h </p>
                <p class="card-text orange-text">Prix : </p>                <!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
            </div>
        </div>
        <!-- Card -->

        <div class="card mb-4">
            <div class="view overlay">
                <img class="card-img-top" src="resources/img/vtt.jpg" alt="Vélo tout terrain">
                <a href="#!">
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>
            <div class="card-body">
                <h4 class="card-title">Vélo tout terrain</h4>
                <p class="card-text">Partez à l'aventure, seul ou en famille.</p>
                <p class="card-text amber-text">Durée min. : demi-journée </p>
                <p class="card-text orange-text">Prix : </p>            </div>
        </div>

        <div class="card mb-4">
            <div class="view overlay">
                <img class="card-img-top" src="resources/img/plancheVoile.jpg" alt="Planche à voile">
                <a href="#!">
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>
            <div class="card-body">
                <h4 class="card-title">Planche à voile</h4>
                <p class="card-text">Montrez vos compétences de voile!</p>
                <p class="card-text amber-text">Durée min. : journée</p>
                <p class="card-text orange-text">Prix : </p>            </div>
        </div>

        <div class="w-100 hidden-sm-down hidden-lg-up"><!-- wrap every 3 on md--></div>


        <div class="card mb-4">
            <div class="view overlay">
                <img class="card-img-top" src="resources/img/pedalo.jpg" alt="Pédalo">
                <a href="#!">
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>
            <div class="card-body">
                <h4 class="card-title">Pédalo</h4>
                <p class="card-text">Détendez-vous sur le lac.</p>
                <p class="card-text amber-text">Durée min. : 1h</p>
                <p class="card-text orange-text">Prix : </p>            </div>
        </div>

        <div class="card mb-4">
            <div class="view overlay">
                <img class="card-img-top" src="resources/img/canoe.jpg" alt="Canoë">
                <a href="#!">
                    <div class="mask rgba-white-slight"></div>
                </a>
            </div>
            <div class="card-body">
                <h4 class="card-title">Descente en canoë</h4>
                <p class="card-text">Descendez le fleuve seul ou en famille.</p>
                <p class="card-text amber-text">Durée min. : journée </p>
                <p class="card-text orange-text">Prix : </p>            </div>
        </div>

        <div class="card mb-4" style="background-color: transparent; border: none; box-shadow: none;">
        </div>
    </div>
    <!-- Card deck -->
</section>
<jsp:include page="footer.jsp"/>
</body>
</html>
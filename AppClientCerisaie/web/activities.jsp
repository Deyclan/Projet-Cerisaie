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
    <title>La Cerisaie - activités</title>
</head>

<body>
<header>
    <jsp:include page="menu.jsp"/>
        <div class="view" style="background-image: url('resources/img/brown-background.jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center; height: 85%">
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
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
                        <button type="button" class="btn btn-light-blue btn-md">Read more</button>
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
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <button type="button" class="btn btn-light-blue btn-md">Read more</button>
                    </div>
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
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <button type="button" class="btn btn-light-blue btn-md">Read more</button>
                    </div>
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
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <button type="button" class="btn btn-light-blue btn-md">Read more</button>
                    </div>
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
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <button type="button" class="btn btn-light-blue btn-md">Read more</button>
                    </div>
                </div>

                <div class="card mb-4">
                    <div class="view overlay">
                        <img class="card-img-top" src="resources/img/BaladeEquestre.jpg" alt="Balade équestre">
                        <a href="#!">
                            <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    <div class="card-body">
                        <h4 class="card-title">Balade équestre</h4>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <button type="button" class="btn btn-light-blue btn-md">Read more</button>
                    </div>
                </div>
            </div>
            <!-- Card deck -->
        </div>
</header>

<jsp:include page="footer.jsp"/>
</body>
</html>
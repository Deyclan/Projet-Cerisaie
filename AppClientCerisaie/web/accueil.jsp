<%--
  Created by IntelliJ IDEA.
  User: Brandon
  Date: 02/06/2018
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <link rel="stylesheet" href="resources/css/bootstrap.min.css">
      <link rel="stylesheet" href="resources/css/mdb.min.css">
      <link rel="stylesheet" href="resources/css/myCSS.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>La Cerisaie - Accueil</title>
  </head>

  <body>
  <header>
      <jsp:include page="menu.jsp"/>
      <!-- Full Page Intro -->
      <div class="view jarallax" data-jarallax='{"speed": 0.2}' style="background-image: url('resources/img/camping.jpg'); background-repeat: no-repeat; background-size: cover; background-position: center center;">
          <div class="mask rgba-stylish-strong d-flex justify-content-center align-items-center">
              <div class="container">
                  <div class="row">
                      <div class="col-md-12 mb-4 white-text text-center">
                          <h2 class="h1-reponsive white-text text-uppercase font-weight-bold mb-0 pt-md-5 pt-5 wow fadeInDown" data-wow-delay="0.3s" style="text-shadow: 2px 2px 4px #4e342e ;"> La <strong><span class="orange-text">Cerisaie </span></strong></h2>
                          <hr class="hr-light my-4 wow fadeInDown" data-wow-delay="0.4s">
                          <h5 class="text-uppercase mb-4 white-text wow fadeInDown" data-wow-delay="0.4s" style="text-shadow: 2px 2px 4px #4e342e ;"><strong>Redécouvrez la joie du camping</strong></h5>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </header>
  <jsp:include page="footer.jsp"/>
  </body>
</html>

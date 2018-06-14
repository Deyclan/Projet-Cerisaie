<%--
  Created by IntelliJ IDEA.
  User: Nejko
  Date: 14-Jun-18
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/mdb.min.css">
    <link rel="stylesheet" href="resources/css/myCSS.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>La Cerisaie - Contact</title>
</head>
<body>
<div class="py-5">
    <jsp:include page="menu.jsp"/>
</div>
<!--Section: Live preview-->
<section class="form-dark pt-5 pb-5" style="background-image: linear-gradient(120deg, #fdfbfb 0%, #ebedee 100%);">

    <!--Form without header-->
    <div class="card card-image mx-auto" style="background-image: url('https://mdbootstrap.com/img/Photos/Others/pricing-table7.jpg'); width: 28rem;">

        <div class="text-white rgba-stylish-strong py-5 px-5 z-depth-4">

            <!--Header-->
            <div class="text-center">
                <h3 class="white-text mb-5 mt-4 font-weight-bold"><strong>CONTACTEZ</strong> <a class="orange-text font-weight-bold"><strong> NOUS</strong></a></h3>
            </div>

            <!--Body-->
            <div class="md-form">
                <input type="text" id="Form-email5" class="form-control white-text">
                <label for="Form-email5" class="white-text">Votre nom</label>
            </div>

            <div class="md-form">
                <input type="text" id="Form-pass5" class="form-control">
                <label for="Form-pass5" class="white-text">Votre mail</label>
            </div>

            <div class="md-form mb-5">
                <textarea type="text" id="message5" name="message5" rows="2" class="form-control md-textarea white-text"></textarea>
                <label for="message5" class="white-text">Votre message</label>
            </div>

            <!--Grid row-->
            <div class="row d-flex align-items-center">

                <!--Grid column-->
                <div class="text-center mb-3 col-md-12">
                    <button type="button" class="btn btn-warning btn-block btn-rounded z-depth-1 waves-effect waves-light">Envoyer message</button>
                </div>
                <!--Grid column-->
            </div>
            <!--Grid row-->
        </div>
    </div>
    <!--/Form without header-->

</section>
<!--Section: Live preview-->
<jsp:include page="footer.jsp"/>

</body>
</html>

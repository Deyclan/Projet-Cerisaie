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
    <link rel="stylesheet" href="/css/myCSS.css">
    <script src="/js/formTest.js"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>La Cerisaie</title>
  </head>

  <body>

  <H2 class="text-center"> Inscription </H2>

  <main class="cards">
  <jsp:include page="activities.jsp" />
  </main>

  <aside>
    <jsp:include page="form.jsp"/>
  </aside>
  </body>
</html>

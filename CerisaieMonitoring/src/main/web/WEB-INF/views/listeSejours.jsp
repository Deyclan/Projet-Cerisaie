<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/mdb.min.css">
    <link rel="stylesheet" href="resources/css/myCSS.css">
    <title>La Cerisaie - Séjours</title>
</head>
<body>
<header>
    <jsp:include page="menu.jsp"/>
    <div class="view" style="background-image: linear-gradient(135deg, #f7fbfc 0%,#d9edf2 40%,#add9e4 100%);">
        <div class="mask rgba-gradient d-flex justify-content-center align-items-center">
            <div class="container">
                <div class="row mt-5 justify-content-center">
                    <div class="col-md-12 my-3">
                        <div style="height:700px">
                            <!--Table-->
                            <TABLE BORDER="0" class="table table-hover text-center card" style="background-color:rgba(0, 0, 0, 0.3); max-height: 100% ; overflow-y: auto; overflow-x: hidden">
                                <thead class="thead-light">
                                <TR class="row justify-content-center">
                                    <TH class="col" scope="col">N° séjour</TH>
                                    <TH class="col" scope="col">N° client</TH>
                                    <TH class="col" scope="col">N° emplacement</TH>
                                    <TH class="col" scope="col">Dates du séjour</TH>
                                    <TH class="col" scope="col">Nombre de personnes</TH>
                                </TR>
                                </thead>
                                <tbody class="white-text">
                                <c:forEach items="${mesSejours}" var="sej">
                                    <tr class="row justify-content-center">
                                        <td class="col" scope="row">${sej.numSej}</td>
                                        <td class="col">${sej.numCli}</td>
                                        <td class="col">${sej.numEmpl}</td>
                                        <td class="col">${sej.datedebSej} - ${sej.dateFinSej}</td>
                                        <td class="col">${sej.nbPersonnes}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </TABLE>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<jsp:include page="footer.jsp"/>
</body>
</html>
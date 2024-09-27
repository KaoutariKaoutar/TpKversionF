<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<fmt:setLocale value="${sessionScope.lang != null ? sessionScope.lang : 'fr'}" />
<fmt:setBundle basename="messages" />

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><fmt:message key="title.confirmer_panier"/></title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link href="styles.css" rel="stylesheet">
</head>

<body>
<<div class="top-bar bg-dark text-light">
<a href="LogoutServlet" class="text-light"><fmt:message key="se_deconnecter" /></a>
    </div>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <div class="row w-100">
            <div class="col-md-4 d-flex justify-content-start align-items-center">
                <a class="navbar-brand d-flex align-items-center" href="#">
                    <img src="images/imageBar.jpeg" alt="Logo" class="d-inline-block align-top" height="60">
                    <span class="navbar-text ml-2">SphereBiblio</span>
                </a>
            </div>
            <div class="col-md-8 d-flex justify-content-end align-items-center">
                <a class="nav-link ml-2" href="index.jsp"><fmt:message key="accueil"/></a>
                <a class="nav-link ml-2" href="creerCompte.jsp"><fmt:message key="creer_compte"/></a>
                <a class="nav-link ml-2" href="login.jsp"><fmt:message key="se_connecter"/></a>
            </div>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <h1 class="text-center mb-4"><fmt:message key="confirmation_panier"/></h1>
    <div class="row">

        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title"><fmt:message key="livres_selectionnes"/></h5>
                    <ul class="list-group">
                        <c:forEach var="livre" items="${livres}">
                            <li class="list-group-item">
                                <c:out value="${livre}"/>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="image-sectionn">
                <div class="content">
                    <p><fmt:message key="merci_reservation"/></p>
                    <p><fmt:message key="contact_information"/></p>
                    <p>6035 Boulevard de l'Acadie, Montréal</p>
                    <p>514 765 4556</p>
                    <p>sphéreBiblio@bib.qc.ca</p>
                </div>
            </div>
        </div>
    </div>
</div>

<footer class="text-center mt-4">
    <p><fmt:message key="footer_message"/></p>
</footer>

</body>
</html>

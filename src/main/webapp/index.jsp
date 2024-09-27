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
    <title><fmt:message key="page_title" /></title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="top-bar bg-dark text-light">
    <form action="LangueServlet" method="get">
        <select name="lang" class="form-select bg-dark text-light" onchange="this.form.submit()">
            <option value="fr" selected>FR</option>
            <option value="en">EN</option>
        </select>
    </form>
</div>

<nav class="navbar navbar-expand-lg navbar-light bg-gold">
    <div class="container">
        <div class="row w-100">
            <div class="col-md-4 d-flex justify-content-start align-items-center">
                <a class="navbar-brand d-flex align-items-center" href="#">
                    <img src="images/imageBar.jpeg" alt="Logo" class="d-inline-block align-top" height="120">
                    <span class="navbar-text ml-2">
                        SphéreBiblio
                    </span>
                </a>
            </div>
            <div class="col-md-8 d-flex justify-content-end align-items-center">
                <a class="nav-link ml-2" href="#"><fmt:message key="accueil" /></a>
                <a class="nav-link ml-2" href="creerCompte.jsp"><fmt:message key="creer_compte" /></a>
                <a class="nav-link ml-2" href="login.jsp"><fmt:message key="se_connecter" /></a>
            </div>
        </div>
    </div>
</nav>

<!-- Section des images -->
<div class="container mt-4">
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="row">
                    <div class="col-md-4">
                        <img src="images/image1.jpg" class="d-block w-100" alt="Image 1">
                    </div>
                    <div class="col-md-4">
                        <img src="images/image2.jpg" class="d-block w-100" alt="Image 2">
                    </div>
                    <div class="col-md-4">
                        <img src="images/image3.jpg" class="d-block w-100" alt="Image 3">
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <div class="row">
                    <div class="col-md-4">
                        <img src="images/image4.jpg" class="d-block w-100" alt="Image 4">
                    </div>
                    <div class="col-md-4">
                        <img src="images/image5.jpg" class="d-block w-100" alt="Image 5">
                    </div>
                    <div class="col-md-4">
                        <img src="images/image6.jpg" class="d-block w-100" alt="Image 6">
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only"><fmt:message key="previous" /></span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only"><fmt:message key="next" /></span>
        </a>
    </div>
</div>

<div class="container mt-4 text-center">
    <p class="highlighted-text">
        <fmt:message key="quote" /><br>
        <strong>****<fmt:message key="author" />****</strong>
    </p>
</div>

<footer class="text-center mt-4">
    <p><fmt:message key="footer_message"/></p>
</footer>

</body>
</html>

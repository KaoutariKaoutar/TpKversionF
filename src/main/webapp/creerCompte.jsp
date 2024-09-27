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
    <title><fmt:message key="title.creer_compte"/></title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<fmt:setLocale value="fr_FR" scope="session"/>
<fmt:setBundle basename="messages"/>

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
                <a class="nav-link ml-2" href="index.jsp"><fmt:message key="accueil"/></a>
                <a class="nav-link ml-2" href="#"><fmt:message key="creer_compte"/></a>
                <a class="nav-link ml-2" href="login.jsp"><fmt:message key="se_connecter"/></a>
            </div>
        </div>
    </div>
</nav>

<div class="container mt-2 mb-5">
    <div class="row">
        <div class="col-md-6 form-section">
            <br>
            <h2 class="text-center"><fmt:message key="title.creer_compte"/></h2>

            <form action="CompteAbonne" method="post">
                <div class="form-group">
                    <label for="nom"><fmt:message key="form.label.name"/></label>
                    <input type="text" class="form-control" id="nom" name="nom" required>
                </div>
                <div class="form-group">
                    <label for="prenom"><fmt:message key="form.label.lastName"/></label>
                    <input type="text" class="form-control" id="prenom" name="prenom" required>
                </div>
                <div class="form-group">
                    <label for="email"><fmt:message key="form.label.email"/></label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="adresse"><fmt:message key="form.label.address"/></label>
                    <input type="text" class="form-control" id="adresse" name="adresse">
                </div>

                <!-- Bouton de soumission -->
                <button type="submit" class="btn btn-primary"><fmt:message key="form.submit"/></button>
            </form>
            <br>

            <c:if test="${not empty errorMessage}">
                <div class="alert alert-danger">
                    <c:out value="${errorMessage}"/>
                </div>
            </c:if>
            <c:if test="${not empty successMessage}">
                <div class="alert alert-success">
                    <c:out value="${successMessage}"/>
                </div>
            </c:if>
        </div>

        <div class="col-md-6 image-section">
            <img src="images/biblio.jpg" alt="<fmt:message key='image.alt'/>">
        </div>
    </div>
</div>

<footer class="mx-auto">
    <p><fmt:message key="footer_message"/></p>
</footer>

</body>
</html>

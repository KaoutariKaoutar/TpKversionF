<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<fmt:setLocale value="${sessionScope.lang != null ? sessionScope.lang : 'fr'}" />
<fmt:setBundle basename="messages" />
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><fmt:message key="se_connecter"/></title>
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
                <a class="nav-link ml-2" href="creerCompte.jsp"><fmt:message key="creer_compte"/></a>
                <a class="nav-link ml-2" href="login.jsp"><fmt:message key="se_connecter"/></a>
            </div>
        </div>
    </div>
</nav>

<br>
<div class="container h-100 d-flex justify-content-center align-items-center">
    <div class="login-container col-md-4 text-center">
        <h2><fmt:message key="mon_compte"/></h2>
        <form action="LoginServlet" method="post">
            <div class="form-groupLogin">
                <label for="login"><fmt:message key="form.label.username"/></label>
                <input type="text" class="form-control" id="login" name="login" required>
            </div>
            <br>
            <div class="form-groupLogin">
                <label for="password"><fmt:message key="form.label.password"/></label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <br>
            <button type="submit" class="btn btn-primary btn-block"><fmt:message key="form.submit1"/></button>
        </form>
    </div>
</div>

<footer class="text-center mt-4">
    <p><fmt:message key="footer_message"/></p>
</footer>

</body>
</html>

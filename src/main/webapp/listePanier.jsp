<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<fmt:setLocale value="${sessionScope.lang != null ? sessionScope.lang : 'fr'}" />
<fmt:setBundle basename="messages" />
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Récapitulatif du Panier</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">
</head>

<body>
<div class="top-bar bg-dark text-light">
    <a href="LogoutServlet" class="text-light"><fmt:message key="se_deconnecter"></a>
</div>
<nav class="navbar navbar-expand-lg navbar-light bg-gold">
    <div class="container">
        <div class="row w-100">
            <div class="col-md-3 d-flex justify-content-start align-items-center">
                <a class="navbar-brand d-flex align-items-center" href="#">
                    <img src="images/imageBar.jpeg" alt="Logo" class="d-inline-block align-top" height="120">
                    <span class="navbar-text ml-2">SphereBiblio</span>
                </a>
            </div>
            <div class="col-md-8 d-flex justify-content-end align-items-center">
                <a class="nav-link ml-3" href="#">Accueil</a>
                <a class="nav-link ml-3" href="creerCompte.jsp">Créer un compte</a>
                <a class="nav-link ml-3" href="login.jsp">Se connecter</a>
            </div>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <h2>Votre sélection de livres</h2>
    <c:if test="${not empty panier}">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Livre</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="livre" items="${panier}">
                <tr>
                    <td>${livre.titre}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
    <c:if test="${empty panier}">
        <p>Votre panier est vide.</p>
    </c:if>
    <div class="text-center">
        <a href="panier.jsp" class="btn btn-secondary">Retour au panier</a>
        <a href="confirmation.jsp" class="btn btn-primary">Confirmer la commande</a>
    </div>
</div>

<footer class="text-center mt-4">
    <p><fmt:message key="footer_message"/></p>
</footer>

</body>
</html>

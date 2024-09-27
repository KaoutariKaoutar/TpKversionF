<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<fmt:setLocale value="${sessionScope.lang != null ? sessionScope.lang : 'fr'}" />
<fmt:setBundle basename="messages" />
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><fmt:message key="panier" /></title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
<div class="top-bar bg-dark text-light">
<a href="LogoutServlet" class="text-light"><fmt:message key="se_deconnecter" /></a>
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
                    <a class="nav-link ml-2" href="index.jsp"><fmt:message key="accueil" /></a>
                    <a class="nav-link ml-2" href="creerCompte.jsp"><fmt:message key="creer_compte" /></a>
                    <a class="nav-link ml-2" href="login.jsp"><fmt:message key="se_connecter" /></a>
            </div>
        </div>
    </div>
</nav>

<br>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="form-container">
                <h2 class="text-center"><fmt:message key="catalogue_des_Livres" /></h2>
                <form action="AjouterPanier" method="post">
                    <div class="form-group">
                        <div class="list-group">

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="Les Miserables">
                                <span class="book-name">Les Misérables</span>
                                <img src="images/image1.jpg" alt="Les Misérables" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="1984">
                                <span class="book-name">1984</span>
                                <img src="images/image4.jpg" alt="1984" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="Le Petit Prince">
                                <span class="book-name">Le Petit Prince</span>
                                <img src="images/image2.jpg" alt="Le Petit Prince" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="LEtranger">
                                <span class="book-name">L'Étranger</span>
                                <img src="images/image8.jpg" alt="L'Étranger" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="La Peste">
                                <span class="book-name">La Peste</span>
                                <img src="images/image6.jpg" alt="La Peste" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="Crime et Chatiment">
                                <span class="book-name">Crime et Châtiment</span>
                                <img src="images/image3.jpg" alt="Crime et Châtiment" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="Le Rouge et le Noir">
                                <span class="book-name">Le Rouge et le Noir</span>
                                <img src="images/image9.jpg" alt="Le Rouge et le Noir" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="Madame Bovary">
                                <span class="book-name">Madame Bovary</span>
                                <img src="images/image5.jpg" alt="Madame Bovary" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="Germinal">
                                <span class="book-name">Germinal</span>
                                <img src="images/image10.jpg" alt="Germinal" class="book-imagePanier">
                            </div>

                            <div class="book-item list-group-item">
                                <input type="checkbox" name="livres" value="La Metamorphose">
                                <span class="book-name">La Métamorphose</span>
                                <img src="images/image7.jpg" alt="La Métamorphose" class="book-imagePanier">
                            </div>

                        </div>
                    </div>

                    <div class="form-group text-center">
                        <button type="submit" class="btn btn-primary btn-custom"><fmt:message key="ajouter_au_panier" /></button>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>

<footer class="text-center mt-4">
    <p><fmt:message key="footer_message"/></p>
</footer>

</body>
</html>
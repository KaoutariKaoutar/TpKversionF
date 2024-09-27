package control;

import service.AbonneService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private AbonneService abonneService;

    @Override
    public void init() {
        abonneService = new AbonneService(new persistence.AbonneDAO());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("login");
        String email = request.getParameter("password");

        // Vérifier si l'abonné existe avec cet name et email
        boolean exists = abonneService.verifierExistenceAbonne(name, email);

        if (exists) {
            // Créer une session pour l'utilisateur
            HttpSession session = request.getSession();
            session.setAttribute("userEmail", email);

            // Rediriger vers la page panier.jsp
            response.sendRedirect("panier.jsp");
        } else {
            // Ajouter un message d'erreur à la requête
            request.setAttribute("errorMessage", "Le nom d'utilisateur ou le mot de passe sont incorrects. Veuillez réessayer.");

            // Rediriger vers la page de connexion avec le message d'erreur
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

package control;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import persistence.AbonneDAO;
import service.AbonneService;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

@WebServlet("/CompteAbonne")
public class CompteAbonne extends HttpServlet {

    private AbonneService abonneService;

    @Override
    public void init() throws ServletException {
        abonneService = new AbonneService(new AbonneDAO()); // Initialisation du service avec DAO
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String adresse = request.getParameter("adresse");

        String errorMessage = null;
        String successMessage = null;

        Locale locale = (Locale) request.getSession().getAttribute("javax.servlet.jsp.jstl.fmt.locale.session");
        if (locale == null) {
            locale = request.getLocale();
        }

        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);

        if (nom == null || prenom == null || email == null || nom.isEmpty() || prenom.isEmpty() || email.isEmpty()) {
            errorMessage = messages.getString("error.empty_fields");
        } else if (!email.matches("[^@]+@[^.]+\\..+")) {
            errorMessage = messages.getString("error.invalid_email");
        } else {
            try {
                abonneService.addAbonne(nom, prenom, email, adresse);
                successMessage = messages.getString("success.add_success");  // Message de confirmation
            } catch (Exception e) {
                errorMessage = messages.getString("error.add_failed");
            }
        }

        if (errorMessage != null) {
            request.setAttribute("errorMessage", errorMessage);
        } else {
            request.setAttribute("successMessage", successMessage);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("creerCompte.jsp");
        dispatcher.forward(request, response);
    }
}

package control;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modele.Livre;
import persistence.Livre_DAO;
import service.LivreService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AjouterPanier")

public class AjouterPanier extends HttpServlet {
    LivreService livreService= new LivreService(new Livre_DAO());

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] livreSelectionnes= request.getParameterValues("livres");

        if(livreSelectionnes==null){
            livreSelectionnes= new String[0];
        }

        List<String> listLivres= new ArrayList<>();
        for(String livre:livreSelectionnes){
            listLivres.add(livre);
        }
        request.setAttribute("livres", listLivres);
        RequestDispatcher dispatcher = request.getRequestDispatcher("confirmerPanier.jsp");
        dispatcher.forward(request, response);





    }
}

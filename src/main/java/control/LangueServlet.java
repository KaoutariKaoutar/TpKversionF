package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

@WebServlet("/LangueServlet")
public class LangueServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String lang = request.getParameter("lang");
        if (lang != null && !lang.isEmpty()) {
            Locale locale = new Locale(lang);
            request.getSession().setAttribute("lang", lang);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

package enterprise.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "catalog")
public class CatalogServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        req.getRequestDispatcher("Catalog.html").forward(req, resp);
        req.getRequestDispatcher("catalog.jsp").forward(req, resp);
        resp.sendRedirect("catalog");
    }
}

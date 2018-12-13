import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object isUser = request.getSession().getAttribute("isUser");

        if (isUser == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else if (!(boolean) isUser) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            request.getSession().removeAttribute("isUser");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

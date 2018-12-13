import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object isUser = request.getSession().getAttribute("isUser");

        if (isUser == null || !(boolean) isUser) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("user") && password.equals("password");
        request.getSession().setAttribute("isUser", false);

        if (validAttempt) {
            request.getRequestDispatcher("profile.jsp").forward(request, response);
            request.getSession().setAttribute("isUser", true);
        } else {
            response.sendRedirect("/login");
        }
    }
}

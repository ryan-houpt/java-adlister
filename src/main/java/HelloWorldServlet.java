import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/login")
public class HelloWorldServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletRequest response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if(username.equals("admin") && password.equals("password") )
        {
            RequestDispatcher req = request.getRequestDispatcher("profile.jsp");
            req.include(request, (ServletResponse) response);
        }
        else
        {
            RequestDispatcher req = request.getRequestDispatcher("login.jsp");
            req.forward(request, (ServletResponse) response);
        }
    }
}

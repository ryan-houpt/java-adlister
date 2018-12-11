import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Name", urlPatterns = "/guess")
public class NameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Random r = new Random();
        int randNum = r.nextInt((7 - 1) + 1) + 1;
        request.setAttribute("randNum", randNum);
        int number = Integer.parseInt(request.getParameter("number"));
        request.setAttribute("number", number);

    }

}

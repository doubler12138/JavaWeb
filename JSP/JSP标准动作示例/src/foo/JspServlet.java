package foo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JspServlet")
public class JspServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        foo.Employee employee1 = new foo.Employee();
        foo.Person employee = new foo.Employee();

        employee1.setName("Evan");
        request.setAttribute("employee1",employee1);
        foo.Employee employee3 = new foo.Employee();
        request.setAttribute("employee3",employee3);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);
    }
}

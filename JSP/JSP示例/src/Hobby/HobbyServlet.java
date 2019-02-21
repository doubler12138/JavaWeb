package Hobby;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "HobbyServlet")
public class HobbyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hobby = request.getParameter("hobby");
        ArrayList<String> extreme = new ArrayList<String>(Arrays.asList("Fred","Pradeep","Philippe"));
        if (hobby.equals("extreme knitting")){
            request.setAttribute("names",extreme);
        }
        RequestDispatcher view = request.getRequestDispatcher("hobby.jsp");
        view.forward(request,response);
    }
}

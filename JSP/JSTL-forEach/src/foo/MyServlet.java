package foo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] movies1 = {"Matrix Revolutions","Kill Bill","Boondock Saints"};
        String[] movies2 = {"Amelie","Return of thie King","Mean Girls"};
        List movieList = new ArrayList();
        movieList.add(movies1);
        movieList.add(movies2);
        request.setAttribute("movies",movieList);
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request,response);
    }
}

package foo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "dogServlet")
public class dogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] favoriteMusic = {"Zero 7", "Tahiti 80", "BT", "Frou Frou"};
        request.setAttribute("musicList", favoriteMusic);
        ArrayList favoriteFood = new ArrayList();
        favoriteFood.add("chai ice cream");
        foo.Person p = new foo.Person();
        p.setName("Evan");
        foo.Dog dog = new foo.Dog();
        dog.setName("Spike");
        p.setDog(dog);
        request.setAttribute("person", p);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}

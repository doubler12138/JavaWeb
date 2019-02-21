package foo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet" )
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num= "2";
        request.setAttribute("num",num);
        Integer i = new Integer(3);
        request.setAttribute("integer",i);
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("true");
        list.add("false");
        list.add("2");
        list.add("10");
        request.setAttribute("list",list);
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request,response);
    }
}

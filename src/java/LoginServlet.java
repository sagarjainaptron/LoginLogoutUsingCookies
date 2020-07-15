

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
         request.getRequestDispatcher("link.html").include(request, response);
        
      String name= request.getParameter("name");
        String password= request.getParameter("password");
        if(password.equals("sagar")){
            out.println("<br>You are successfully logIn...<br>");
            out.println("Welcome "+ name);
            
            Cookie ck=new Cookie("name", name);
            response.addCookie(ck);
            
        }
        else{
             out.println("Enter your username and password again...");
             request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }

 

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp world
 */
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              PrintWriter out=response.getWriter();
               request.getRequestDispatcher("link.html").include(request, response);
               Cookie ck[]=request.getCookies();
               if(ck!=null){
                   String name=ck[0].getValue();
                   if(!name.equals("") || name!=null){
                       out.println("<br>This is your profile page....<br>");
                       out.println("Welcome, "+name);
                   }
               }
               else{
                   out.println("Please Login first<br>");
                    request.getRequestDispatcher("login.html").include(request, response);
               }
               out.close();
    }


}

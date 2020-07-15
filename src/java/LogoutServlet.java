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
public class LogoutServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             PrintWriter out=response.getWriter();
               request.getRequestDispatcher("link.html").include(request, response);
               Cookie ck=new Cookie("name", "");
               ck.setMaxAge(0);
               response.addCookie(ck);
               out.println("<br>You are successfully logged out...<br>");
    }

}

package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("operation")!=null){
            if(request.getParameter("operation").equals("logout")){
                request.getSession().removeAttribute("login");
            }
        }
        RequestDispatcher rs = request.getRequestDispatcher("login/loginpage.jsp");
        rs.forward(request, response);
        
        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("in login servlet");
        if (request.getParameter("post_operation").equals("login")) {
            String username = request.getParameter("username").trim();
            String password = request.getParameter("password").trim();
            boolean status = new LoginSystem().check(username, password);
            if (status == true) {
                request.getSession().setAttribute("login", true);
                request.getSession().setAttribute("username", username);
                response.sendRedirect("home");
            } else {
                request.getSession().setAttribute("message", "Login failed,wrong username or password");
                 response.sendRedirect("login");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import openSAPdto.cheque.Cheque;
import openSAPdto.cheque.ChequeEntryBook;
import openSAPdto.core.Fund;

/**
 *
 * @author GhostMachine
 */
public class home extends HttpServlet {

    public void login_filter(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("login");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("login"); // IF LOGIN IS NOT DONE
        } else {
     //IF LOGIN IS DONE
            ////////////////////////////////////LOGIN IS OK/////////////////////////////      
            System.out.println("In home servlet");
            if (request.getParameter("operation") != null) {
                String operation = request.getParameter("operation");
                String module = request.getParameter("module");

                if (module.equals("cheque")) {
                    if (operation.equals("add")) {
                        RequestDispatcher rs = request.getRequestDispatcher("cheque/add.jsp");
                        rs.forward(request, response);
                    } else if (operation.equals("list")) {
                        RequestDispatcher rs = request.getRequestDispatcher("cheque/list.jsp");
                        request.setAttribute("list", new ChequeEntryBook().get_all_cheques());
                        rs.forward(request, response);
                    }
                }
                if (module.equals("myaccount")) {
                    if (("operation").equals("logout")) {
                        request.getSession().invalidate();
                        response.sendRedirect("/login");
                    }
                }

            }
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            rs.forward(request, response);
            ////////////////////////////////////////////////////////////////////////////////////////     
        }// IF LOGIN IS OK END

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("login"); // IF LOGIN IS NOT DONE
        } else {
     //IF LOGIN IS DONE
            ////////////////////////////////////LOGIN IS OK/////////////////////////////  

            if (request.getParameter("post_operation") != null) {

                //////////////////////ONE POST CASE////////////////
                if (request.getParameter("post_operation").equals("cheque_submit")) {
                    String pay_to = request.getParameter("pay_to");
                    int amount_numbers = Integer.parseInt(request.getParameter("amount_numbers").trim());
                    String amount_words = request.getParameter("amount_words");
                    String pay_from = request.getParameter("pay_from");
                    int cheque_type = Integer.parseInt(request.getParameter("cheque_type"));
                    String cheque_date = request.getParameter("cheque_date");

                    Cheque c = new Cheque();
                    c.setAmount(new Fund(amount_numbers, amount_words));
                    c.setPAY_TO(pay_to);
                    c.setFrom_account(pay_from);
                    c.setCheckq_date(new Date());
                    c.setCheck_type(cheque_type);

                    ChequeEntryBook eb = new ChequeEntryBook();
                    eb.add_a_cheque(c);
                }
                /////////////////////////////////////////////////////
                if (request.getParameter("post_operation").equals("login")) {

                }
                ////////////////////////////////////////////////////////
                doGet(request, response);

            }
      //////////////////////////////////////////////////////////////////////////////////      
        }// IF LOGIN IS OK END

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

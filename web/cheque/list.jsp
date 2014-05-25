<%@page import="openSAPdto.cheque.Cheque"%>
<%@page import="java.util.List"%>
<%@page import="home.ModuleRegistry"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../header.jsp" %>
    <body>

        <%@include file="../navbar.jsp" %>
        <div class="container">
            <div class="row">
                <%@include file="../sidebar.jsp" %>
                <div class="span8">
                    <table class="table table-bordered">
                        <tr style="background: steelblue;color:white;">
                            <td>Cheque Id</td>
                            <td>Payment to</td>
                            <td>Payment from</td>
                            <td>Amount</td>
                            <td>Cheque Type</td>
                            <td>Cheque Date</td>
                        </tr>
                        <%        List list = (List) request.getAttribute("list");
                            for (Iterator iterator
                                    = list.iterator(); iterator.hasNext();) {
                                Cheque c = (Cheque) iterator.next();

                        %>
                        <tr>
                            <td><%= c.getCheck_id()%></td>
                            <td><%= c.getPAY_TO()%></td>
                            <td><%= c.getFrom_account()%></td>
                            <td><%= c.getAmount().getAmount_in_numbers()%></td>
                            <td><%= c.getCheck_type()%></td>
                            <td><%= c.getCheckq_date().toString()%></td>
                        </tr>

                        <%        }
                        %>


                    </table>
                </div>
            </div>   

        </div>
        <%@include file="../script_plugins.jspf" %>
    </body>
</html>

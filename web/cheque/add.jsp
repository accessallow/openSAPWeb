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
                <div class="span8 well">
                    <form class="form-horizontal span5" method="POST" action="home?module=cheque&operation=add">
                        <input type="hidden" name="post_operation" value="cheque_submit"/>
                        <div class="control-group ">
                            <label class="control-label">Pay To</label>
                            <div class="controls">
                                <input type="text" id="" placeholder="" name="pay_to">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Amount(numbers)</label>
                            <div class="controls">
                                <input type="text" id="" placeholder="" name="amount_numbers">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Amount(words)</label>
                            <div class="controls">
                                <input type="text" id="" placeholder="" name="amount_words">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Pay from</label>
                            <div class="controls">
                                <input type="text" id="" placeholder="" name="pay_from">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Cheque type</label>
                            <div class="controls">
                                <select name="cheque_type">
                                    <option value="1">PAYEE Cheque</option>
                                    <option value="2">BEARER Cheque</option>
                                    <option value="3">ACCOUNT Cheque</option>
                                </select>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Date</label>
                            <div class="controls">
                                <input type="text" id="" placeholder="" name="cheque_date">
                            </div>
                        </div>


                        <div class="control-group">
                            <div class="controls">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>   

        </div>
        <%@include file="../script_plugins.jspf" %>
    </body>
</html>

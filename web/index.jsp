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
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://localhost/bootstrap2/css/bootstrap.css"/>
        <link rel="stylesheet" href="http://localhost/bootstrap2/css/bootstrap-theme.css"/>
        <title>JSP Page</title>
        <style>
            .container{
                text-align: center;
                padding-right: 15px;
                padding-left: 15px;
                margin-right: auto;
                margin-left: auto;

            }
        </style>
    </head>
    <body>

        <%@include file="navbar.jsp" %>
        <div class="container">
            <div class="row">
                <%@include file="sidebar.jsp" %>
            </div>   

        </div>
        <%@include file="script_plugins.jspf" %>
    </body>
</html>

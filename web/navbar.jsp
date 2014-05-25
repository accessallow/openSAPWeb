<%@page import="home.ModuleRegistry"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>

<!-- Navaigation bar -->
<div class="navbar">
    <div class="navbar-inner">
        <a class="brand" href="#">Company Name</a>
        <ul class="nav">
            <li class="active"><a href="#">File</a></li>
            <li><a href="#">Settings</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    Load Module
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <%
                        ModuleRegistry registry = new ModuleRegistry();
                        HashMap modules = registry.getModules();
                        Set s = modules.entrySet();
                        Iterator it = s.iterator();
                    %>

                    <%
                        while (it.hasNext()) {
                            Map.Entry me = (Map.Entry) it.next();
//                                out.print(me.getKey() + ": ");
//                                out.println(me.getValue());
                    %>
                    <li><a href="?module=<%=me.getValue()%>"><%= me.getKey()%></a></li>
                        <%
                            }
                        %>
                </ul>
            </li>

            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    My Account
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">View my profile</a></li>
                    <li><a href="#">View my rights</a></li>
                    <li><a href="login?operation=logout">Logout</a></li>
                </ul>
            </li>
        </ul>
    </div>
</div>
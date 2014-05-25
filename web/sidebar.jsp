<%@page import="java.util.Map"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="home.ModuleProvider"%>
<%@page import="home.ModuleEntry"%>
<div class="span3">

    <ul class="nav nav-tabs nav-stacked">
        <%
            if (request.getParameter("module") != null) {
                String module_name = request.getParameter("module");
                ModuleEntry e = new ModuleProvider().get_module(module_name);

                HashMap operations = (HashMap) e.getOperations();
                String module_url = e.getModule_url();
                module_url = "?module=" + module_url + "&operation=";
        %>
        <%
            Set set = operations.entrySet();
            // Get an iterator
            Iterator i = set.iterator();
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry) i.next();

        %>
        <li><a href="<%= module_url%><%=me.getValue()%>"><%= me.getKey()%></a></li>
            <%
                    }
                }
            %>
    </ul>
</div>
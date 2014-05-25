
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../header.jsp" %>

    <body>
    

        <div class="container">
            <div class="row">
                <div class="span8">
                    <form class="form-horizontal span5 offset2" method="POST" action="login"
                          style="margin-top: 30%;">
                        
                        <input type="hidden" name="post_operation" value="login"/>
                         
                        <div class="control-group ">
                            <label class="control-label">Username</label>
                            <div class="controls">
                                <input type="text" id="" placeholder="" name="username">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">Password</label>
                            <div class="controls">
                                <input type="password" id="" placeholder="" name="password">
                            </div>
                        </div>

                        <div class="control-group">
                            <div class="controls">
                                <button type="submit" class="btn btn-primary">Login</button>
                            </div>
                        </div>
                         <div class="control-group">
                             <label class="control-label">
                                 <%
                                     if(request.getSession().getAttribute("message")!=null){
                                         out.println(request.getSession().getAttribute("message"));
                                         request.getSession().removeAttribute("message");
                                     }
                                 %>
                             </label>
                        </div>
                    </form>
                </div>

            </div>   

        </div>
    
        <%@include file="../script_plugins.jspf" %>
    </body>
</html>

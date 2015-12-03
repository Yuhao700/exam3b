

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@ include file="includes/searchbar.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers Database</title>
        <link rel="stylesheet" type="text/css" href="Styling.css"/>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
         <div class="wrap">
            

        
            <%@ include file="includes/header.jsp" %>
            

            
            <%@ include file="includes/menu.jsp" %>
            
            
        
        <div class="main">
        <h1>Customers Database</h1>
        <%= table %>
        
        <br><br>
        <a href ="add">Add a New Customer</a>
        <br><br>
        </div>
        <%@ include file="includes/footer.jsp" %>
        </div>
    </body>
</html>

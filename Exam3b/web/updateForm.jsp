<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customer"%>
<% Customer member = (Customer) request.getAttribute("member"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Update A Member Information</title>
        <link rel="stylesheet" type="text/css" href="Styling.css"/>
    </head>
    <body>
                <div class="wrap">
            

        
            <%@ include file="includes/header.jsp" %>
            
            <%@ include file="includes/menu.jsp" %>
            
            
        
        <div class="main">
        <h1>Update A Member Information</h1>
        
        <form name="updateForm" action ="updateMember" method="get">
            
            <table class="update">    
            <tr>
                <td>Customer ID:</td>
                <td><input type="text" name="custID" value="<%= member.getcustID() %>"  /></td>
            </tr>
            
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" value="<%= member.getfirstName() %>"  /></td>
            </tr>
                
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" value="<%= member.getlastName() %>" readonly/></td>
            </tr>
                
            <tr>
                <td>Address Line 1:</td>
                <td><input type="text" name="addr1" value ="<%= member.getaddr1() %>"  /></td>
            </tr>
            
            <tr>
                <td>Address Line 2:</td>
                <td><input type="text" name="addr2" value = "<%= member.getaddr2() %>" /></td>
            </tr>
            
            <tr>
                <td>City:</td>
                <td><input type="text" name="city" value = "<%= member.getCity() %>" /></td>
            </tr>
            
            <tr>
            <td>State:</td>
            <td>
            <select name="state">
                <option value= "<%= member.getState() %>"><%= member.getState() %></optione>
			<option value="AL">Alabama</option>
			<option value="AK">Alaska</option>
			<option value="AZ">Arizona</option>
			<option value="AR">Arkansas</option>
			<option value="CA">California</option>
			<option value="CO">Colorado</option>
			<option value="CT">Connecticut</option>
			<option value="DE">Delaware</option>
			<option value="DC">District of Columbia</option>
			<option value="FL">Florida</option>
			<option value="GA">Georgia</option>
			<option value="HI">Hawaii</option>
			<option value="ID">Idaho</option>
			<option value="IL">Illinois</option>
			<option value="IN">Indiana</option>
			<option value="IA">Iowa</option>
			<option value="KS">Kansas</option>
			<option value="KY">Kentucky</option>
			<option value="LA">Louisiana</option>
			<option value="ME">Maine</option>
			<option value="MD">Maryland</option>
			<option value="MA">Massachusetts</option>
			<option value="MI">Michigan</option>
			<option value="MN">Minnesota</option>
			<option value="MS">Mississippi</option>
			<option value="MO">Missouri</option>
			<option value="MT">Montana</option>
			<option value="NE">Nebraska</option>
			<option value="NV">Nevada</option>
			<option value="NH">New Hampshire</option>
			<option value="NJ">New Jersey</option>
			<option value="NM">New Mexico</option>
			<option value="NY">New York</option>
			<option value="NC">North Carolina</option>
			<option value="ND">North Dakota</option>
			<option value="OH">Ohio</option>
			<option value="OK">Oklahoma</option>
			<option value="OR">Oregon</option>
			<option value="PA">Pennsylvania</option>
			<option value="RI">Rhode Island</option>
			<option value="SC">South Carolina</option>
			<option value="SD">South Dakota</option>
			<option value="TN">Tennessee</option>
			<option value="TX">Texas</option>
			<option value="UT">Utah</option>
			<option value="VT">Vermont</option>
			<option value="VA">Virginia</option>
			<option value="WA">Washington</option>
			<option value="WV">West Virginia</option>
			<option value="WI">Wisconsin</option>
			<option value="WY">Wyoming</option>
</select>
            </td>
            </tr>
            
            <tr>
                <td>Zip:</td>
                <td><input type="text" name="zip" value = "<%= member.getZip() %>" /></td>
            </tr>
            
            <tr>
                <td>Email Address:</td>
                <td><input type="text" name="emailAddr" value = "<%= member.getEmailAddr() %>" /></td>
            </tr>
            
            <tr>
                <td>Age:</td>
                <td><input type="text" name="age" value = "<%= member.getAge() %>" /></td>
            </tr>
            
            </table>
            <input type="submit" name="submit" value="Update" />
        </form>
                    </div>
        

        
        <%@ include file="includes/footer.jsp" %>
        
        </div>
    </body>
</html>

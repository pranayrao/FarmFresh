<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
<link href="css/details.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
  <div class="details">
    <h1>Customer Details</h1>
    <form method="post" action="/FarmFresh/CustomerServlet">
      <p><input type="text" name="CustID" value="" placeholder="CustomerID"></p>
       	<label>
         
          
        </label>
      </p>
      <p class="submit"><input type="submit" name="Submit" value="Submit"></p>
    </form>
  </div>
</body>
</html>
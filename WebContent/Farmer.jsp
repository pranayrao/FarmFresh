<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Farmer Details</title>
<link href="css/details.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
  <div class="details">
    <h1>Farmer Details</h1>
    <form method="post" action="/FarmFresh/FarmerServlet">
      <p><input type="text" name="farmerID" value="" placeholder="FarmerID"></p>
       <label>
        </label>
      </p>
      <p class="submit"><input type="submit" name="Submit" value="Submit"></p>
    </form>
  </div>
  </div>
</body>
</html>
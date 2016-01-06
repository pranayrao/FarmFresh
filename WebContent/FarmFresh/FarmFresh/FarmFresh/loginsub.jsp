<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/login.css" rel="stylesheet" type="text/css"/>
<style>
body {
  font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
  color: #404040;
  background: #c9fccd;
}
</style>
</head>

<body>
<div class="container">
  <div class="login">
    <h1>Login</h1>
    <form method="post" target="_parent" action="/FarmFresh/LoginServlet">
      <p><input type="text" name="userName" value="" placeholder="Username"></p>
      <p><input type="password" name="password" value="" placeholder="Password"></p>
      <p class="remember_me">
        <label>
         <label>
          <input type="checkbox" name="remember_me" id="remember_me">
          Remember me on this computer
        </label>
        </label>
      </p>
      <p class="submit"><input type="submit" name="commit" value="Login"></p>
    </form>
  </div>
 
  <div class="login-help">
    <p>Forgot your password? <a href="#">Click here to reset it</a>.</p>
  </div>
</div>
</body>
</html>
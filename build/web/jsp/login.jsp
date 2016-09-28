<%-- 
    Document   : login
    Created on : Sep 21, 2016, 5:18:22 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Arq. de Software</title>
    
    
    
    
    <link rel="stylesheet" href="../css/style.css">

    
    
    
  </head>

  <body>

    <div class="wrapper">
	<div class="container">
		<h1>Biblioteca</h1>
		
                <form  method="POST" action="../LoginServlet" class="form">
                    <input type="text" placeholder="Usuario" name="usu" id="usu">
                    <input type="password" placeholder="Contraseña" name="psw" id="psw">
			<button type="submit" id="login-button">Ingresar</button>
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="../js/index.js"></script>

    
    
    
  </body>
</html>

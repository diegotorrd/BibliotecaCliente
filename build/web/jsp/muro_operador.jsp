<%-- 
    Document   : muro
    Created on : Sep 21, 2016, 6:16:23 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Biblioteca ULIMA</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Muli" rel="stylesheet">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="../vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../vendor/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="../vendor/device-mockups/device-mockups.min.css">

    <!-- Theme CSS -->
    <link href="../css/new-age.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top" >Bienvenido </a>
                <a class="navbar-brand page-scroll" href="#page-top" >${usuario.nombre}</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#download">Registrar</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#features">Modificar</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="container">
            <div class="row">
                <div class="col-sm-7" style="margin-right: 30px">
                    <div class="header-content">
                        <div class="header-content-inner">
                            <h1>Biblioteca ULIMA</h1>
                            <p>La Biblioteca apoya los procesos pedagógicos y de investigación de la Universidad de Lima, a través de la selección y acceso a recursos de información impresos, electrónicos y audiovisuales, cuyo uso y manejo se fomentan mediante un sostenido programa de formación de usuarios.</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="header-content">
                        <div class="header-content-inner" style="float: right">
                                <div class="screen" >
                                    <!-- Demo image for screen mockup, you can put an image here, some HTML, an animation, video, or anything else! -->
                                    <img src="http://www.dezignwithaz.com/images/book-trees-decal.png" class="img-responsive" alt="" align="middle" >
                                </div>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <section id="download" class="download bg-primary text-center">
        <div class="container">
            <div class="row">
                <div class="col-sm-6" style="margin-right: 20px">
                    <h2 class="section-heading">Registra un nuevo libro a la Biblioteca!</h2>
                    <p>No olvides especificar todos los detalles n_n</p>
                    
                </div>
                
                <div class="col-sm-5">
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">1.</span>
                        <input id="titulo" name="titulo" type="text" class="form-control" placeholder="Titulo del libro" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">2.</span>
                        <input id="autor" name="autor" type="text" class="form-control" placeholder="Autor(a) del libro" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">3.</span>
                        <input id="genero" name="genero" type="text" class="form-control" placeholder="Genero" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">4.</span>
                        <input id="pais" name="pais" type="text" class="form-control" placeholder="País" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">5.</span>
                        <input id="publicacion" name="publicacion" type="text" onfocus="(this.type='date')" class="form-control" placeholder="Fecha publicación" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">6.</span>
                        <input id="paginas" name="paginas" type="number" class="form-control" placeholder="Paginas" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">7.</span>
                        <input id="imagen" name="imagen" type="text" class="form-control" placeholder="Imagen" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <button type="submit" class="btn btn-outline btn-xl page-scroll" onclick="registrarLibro()">Registrar</button>
                    </div>                   
                </div>
            </div>
        </div>
    </section>

    <section id="features" class="features">
       <div class="container">
            <div class="row">
                <div class="col-sm-6" style="margin-right: 20px">
                    <h2 class="section-heading">Modifica los datos de un libro</h2>
                    <p>Antes búscalo por su ID</p>
                        <div class=" row input-group" style="margin-bottom: 10px; width: 300px" >
                            <span class="input-group-addon" id="basic-addon1"></span>
                            <input id="id_mod" name="id_mod" type="text" class="form-control" placeholder="ID del libro" aria-describedby="basic-addon1">
                        </div>
                        <div class=" row input-group" style="margin-bottom: 10px">
                            <input id="btn-buscar-mod" name="btn-buscar-mod" type="button" onclick="buscarLibro()" class="btn btn-outline btn-xl page-scroll" style="color: #9d9d9d" value="Busscar">
                        </div>
                </div>
                
                <div class="col-sm-5" id="div-modificar">
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1" >Titulo</span>
                        <input id="titulo-mod" name="titulo-mod" type="text" class="form-control" placeholder="Titulo del libro" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">Autor</span>
                        <input id="autor-mod" name="autor-mod" type="text" class="form-control" placeholder="Autor(a) del libro" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">Genero</span>
                        <input id="genero-mod" name="genero-mod" type="text" class="form-control" placeholder="Genero" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">País</span>
                        <input id="pais-mod" name="pais-mod" type="text" class="form-control" placeholder="País" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">Fec. Pub.</span>
                        <input id="publicacion-mod" name="publicacion-mod" type="date" class="form-control" placeholder="Fecha publicación" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">Paginas</span>
                        <input id="paginas-mod" name="paginas-mod" type="number" class="form-control" placeholder="Paginas" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">link Img.</span>
                        <input id="imagen-mod" name="imagen-mod" type="text" class="form-control" placeholder="Imagen" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1">Estado</span>
                        <select id="estado-mod" name="estado-mod" type="text" class="form-control" placeholder="Estado" aria-describedby="basic-addon1">
                            <option value="A">Activo</option>
                            <option value="I">Inactivo</option>
                        </select>
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px" >
                        <a onclick="actualizarLibro()" class="btn btn-outline btn-xl page-scroll" style="color: #9d9d9d">Modificar</a>
                    </div>
                    
                </div>
            </div>
        </div>
    </section>


    <footer>
        <div class="container">
            <p>&copy; 2016 Start Bootstrap. All Rights Reserved.</p>
            <ul class="list-inline">
                <li>
                    <a href="#">Privacy</a>
                </li>
                <li>
                    <a href="#">Terms</a>
                </li>
                <li>
                    <a href="#">FAQ</a>
                </li>
            </ul>
        </div>
    </footer>
            
    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.js"></script>
    

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="../js/new-age.min.js"></script>
    
    <script src="../js/funciones.js"></script>
</body>

</html>

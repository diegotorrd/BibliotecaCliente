<%-- 
    Document   : muro_usuario
    Created on : 27/09/2016, 07:27:26 PM
    Author     : Diego Torres
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
                        <a class="page-scroll" href="#download">Catalogo</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#features">Buscar</a>
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

    <section id="download" class="download bg-primary text-center" >
        <div class="container" >
            <div class="row" style="margin-bottom: 10px">
                <div class="col" style="margin-right: 20px">
                    <h2 class="section-heading">Revisa el Catalogo</h2>                    
                </div>
                
            </div>                
            
            <div class="row">
                <div class="col">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="carousel slide multi-item-carousel" id="theCarousel">
                                    <div class="carousel-inner">
                                        <div class="item active">
                                            <div class="col-sm-4">
                                                <a href="#1"><img src="http://placehold.it/300/f44336/000000" class="img-responsive"></a>
                                                <p>jeje</p>
                                            </div>
                                        </div>
                                        <div class="item">
                                            <div class="col-sm-4"><a href="#1"><img src="http://placehold.it/300/e91e63/000000" class="img-responsive"></a></div>
                                        </div>
                                        <div class="item">
                                            <div class="col-xs-4"><a href="#1"><img src="http://placehold.it/300/9c27b0/000000" class="img-responsive"></a></div>
                                        </div>
                                        <div class="item">
                                          <div class="col-xs-4"><a href="#1"><img src="http://placehold.it/300/673ab7/000000" class="img-responsive"></a></div>
                                        </div>
                                        <div class="item">
                                          <div class="col-xs-4"><a href="#1"><img src="http://placehold.it/300/4caf50/000000" class="img-responsive"></a></div>
                                        </div>
                                        <div class="item">
                                          <div class="col-xs-4"><a href="#1"><img src="http://placehold.it/300/8bc34a/000000" class="img-responsive"></a></div>
                                        </div>
                                    </div>
                                    <a class="left carousel-control" href="#theCarousel" data-slide="prev"><i class="glyphicon glyphicon-chevron-left"></i></a>
                                    <a class="right carousel-control" href="#theCarousel" data-slide="next"><i class="glyphicon glyphicon-chevron-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                
        </div>
    </section>

    <section id="features" class="features">
       <div class="container">
            <div class="row">
                <div class="col-sm-6" style="margin-right: 20px">
                    <h2 class="section-heading">Si conoces el ID del libro, buscalo ;)</h2>
                    
                </div>
                
                <div class="col-sm-5" id="div-modificar" >
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <span class="input-group-addon" id="basic-addon1"></span>
                        <input type="text" class="form-control" placeholder="ID" aria-describedby="basic-addon1">
                    </div>
                    <div class=" row input-group" style="margin-bottom: 10px">
                        <a href="#contact" class="btn btn-outline btn-xl page-scroll" style="color: #9d9d9d">Buscar</a>
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
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="../js/new-age.min.js"></script>

</body>

</html>

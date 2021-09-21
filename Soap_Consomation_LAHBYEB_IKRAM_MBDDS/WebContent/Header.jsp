<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>BookTime</title>
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>
    <!--// Common Js -->
    <!--search-bar-agileits-->
    <script src="js/main.js"></script>
    <!--//search-bar-agileits-->
    <!-- start-smoth-scrolling -->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <!-- start-smoth-scrolling -->
    <!-- Banner Responsive slider -->
    <script src="js/responsiveslides.min.js"></script>
    <script>
        // You can also use "$(window).load(function() {"
        $(function () {
            // Slideshow 3
            $("#slider3").responsiveSlides({
                auto: true,
                pager: false,
                nav: true,
                speed: 500,
                namespace: "callbacks",
                before: function () {
                    $('.events').append("<li>before event fired.</li>");
                },
                after: function () {
                    $('.events').append("<li>after event fired.</li>");
                }
            });

        });
    </script>
    <!-- // Banner Responsive slider -->
    <!-- flexSlider -->
    <script defer src="js/jquery.flexslider.js"></script>
    <script type="text/javascript">
        $(window).load(function () {
            $('.flexslider').flexslider({
                animation: "slide",
                start: function (slider) {
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
    <!-- //flexSlider -->
    <!-- stats -->
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/jquery.countup.js"></script>
    <script>
        $('.counter-agileits-w3layouts').countUp();
    </script>
    <!-- //stats -->
    <!-- smooth scrolling -->
    <script type="text/javascript">
        $(document).ready(function () {
            /*
                var defaults = {
                containerID: 'toTop', // fading element id
                containerHoverID: 'toTopHover', // fading element hover id
                scrollSpeed: 1200,
                easingType: 'linear'
                };
            */
            $().UItoTop({
                easingType: 'easeOutQuart'
            });
        });
    </script>


    <script src="js/bootstrap.js"></script>


    <!--// Required Scripts -->
    <!-- // Meta Tags -->
    <!-- // Meta Tags -->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
	<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
	<!--testimonial flexslider-->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!--fonts-->
	<link href="//fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Raleway:300,400,500,600,800" rel="stylesheet">
	<!--//fonts-->
<body>
<% HttpSession ses = request.getSession();
String username =(String)ses.getAttribute("username");
%>
<%if (username==null){ %>
<header>

<div class="header" style="top: 10px;left: 5px;right: 5px;">
        <div class="top" style="height: 50px;padding-top: 5px; padding-bottom: 5px;">
            <div class="container">

                <div class="col-md-9 top-left">
                    <ul>
                        <li><a href="Register.jsp">Register</a></li>
                        <li><a href="Register.jsp">Login</a></li>
                    </ul>
                </div>
                <div class="col-md-3 top-middle">
                    <ul>
                        <li><p></p></li>
                        <li><i class=" fa fa-user-circle-o"></i></li>
                    </ul>
                </div>

                <div class="clearfix"></div>

            </div>
        </div>
        <!--top-bar-w3layouts-->
        <div class="top-bar-w3layouts" style="height:72px;">
            <div class="container">
                <nav class="navbar navbar-default">
                    <div class="navbar-header" style="height:72px;">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <h1 style="margin-top: 0px;margin-bottom: 0px; "><a href="index.html">BookTime</a></h1>
                    </div>
                    <!-- navbar-header -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="Home.jsp">Home</a></li>
                            <li><a href="About.jsp">About</a></li>
                            <li><a href="AddCart.jsp">Cart</a></li>
                            <li><a href="BookShop.jsp">BookShop</a></li>
                            <!--  <li class="">
                                <a href="BookShop.jsp" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Book <span class="caret"></span></a>
                                <ul class="dropdown-menu" style="background-color: #93c83f;">
                                    <li><a href="All.jsp">All</a></li>
                                    <li><a href="Regiter.jsp">Register</a>)</li>
                                    <li><a href="Regidter.jsp">Register</a></li>
                                    <li><a href="Regidter.jsp">Register</a></li>
                                </ul>
                            </li>-->
                            <li><a href="Contact.jsp">Contact</a></li>


                        </ul>

                    </div>

                    <div class="search-bar-agileits">
                        <div class="cd-main-header">
                            <ul class="cd-header-buttons">
                                <li><a class="cd-search-trigger" href="#cd-search"> <span></span></a></li>
                            </ul>
                            <!-- cd-header-buttons -->
                        </div>
                        <div id="cd-search" class="cd-search " style="margin-top: 40px;width:720px;">
                            <form action="#" method="post">
                                <input name="Search" type="search" placeholder="Click enter after typing..." style="width:656px;">
                            </form>
                        </div>
                    </div>


                    <div class="clearfix"> </div>
                </nav>
            </div>
        </div>

    </div>
</header>
<%} else { %>
<header>

<div class="header" style="top: 10px;left: 5px;right: 5px;">
        <div class="top" style="height: 50px;padding-top: 5px; padding-bottom: 5px;">
            <div class="container">

                <div class="col-md-9 top-left">
                    <ul>
                        <li><a href="Register.jsp">Register</a></li>
                        <li><a href="DeleteUserSession">Log out</a></li>
                    </ul>
                </div>
                <div class="col-md-3 top-middle">
                    <ul>
                        <li><p><%=username %></p></li>
                        <li><i class=" fa fa-user-circle-o"></i></li>
                    </ul>
                </div>

                <div class="clearfix"></div>

            </div>
        </div>
        <!--top-bar-w3layouts-->
        <div class="top-bar-w3layouts" style="height:72px;">
            <div class="container">
                <nav class="navbar navbar-default">
                    <div class="navbar-header" style="height:72px;">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <h1 style="margin-top: 0px;margin-bottom: 0px; "><a href="index.html">BookTime</a></h1>
                    </div>
                    <!-- navbar-header -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="Home.jsp">Home</a></li>
                            <li><a href="About.jsp">About</a></li>
                            <li><a href="AddCart.jsp">Cart</a></li>
                            <li><a href="BookShop.jsp">BookShop</a></li>
                            <!--  <li class="">
                                <a href="BookShop.jsp" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Book <span class="caret"></span></a>
                                <ul class="dropdown-menu" style="background-color: #93c83f;">
                                    <li><a href="All.jsp">All</a></li>
                                    <li><a href="Regiter.jsp">Register</a>)</li>
                                    <li><a href="Regidter.jsp">Register</a></li>
                                    <li><a href="Regidter.jsp">Register</a></li>
                                </ul>
                            </li>-->
                            <li><a href="Contact.jsp">Contact</a></li>


                        </ul>

                    </div>

                    <div class="search-bar-agileits">
                        <div class="cd-main-header">
                            <ul class="cd-header-buttons">
                                <li><a class="cd-search-trigger" href="#cd-search"> <span></span></a></li>
                            </ul>
                            <!-- cd-header-buttons -->
                        </div>
                        <div id="cd-search" class="cd-search " style="margin-top: 40px;width:720px;">
                            <form action="#" method="post">
                                <input name="Search" type="search" placeholder="Click enter after typing..." style="width:656px;">
                            </form>
                        </div>
                    </div>


                    <div class="clearfix"> </div>
                </nav>
            </div>
        </div>

    </div>
</header>

<%} %>

</body>
</html>
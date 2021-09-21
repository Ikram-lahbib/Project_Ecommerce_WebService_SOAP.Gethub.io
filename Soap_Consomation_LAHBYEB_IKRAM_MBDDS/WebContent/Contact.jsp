<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp"  %>
<div class="banner"></div>
<section class="contact">
    <div class="container">
        <h3 class="title-txt"><span>C</span>ontact Us</h3>
        <div class="contact-grids">
            <div class=" col-md-5 contact-form">
                <h4 class="heading">Get In Touch</h4>
                <form action="#" method="post">
                    <input type="text" placeholder="Full Name" required="" />
                    <input type="email" placeholder="Your Mail" required="" />
                    <input type="text" placeholder="Mobile Number" required="" />
                    <textarea placeholder="Message" required=""></textarea>
                    <div class="submit1">
                        <input type="submit" value="send">
                    </div>
                </form>
            </div>
            <div class=" col-md-7 map">
                <img src="images/g3.jpg" />
                <div class="col-md-4 contact-grid1">
                    <i class="fa fa-facebook-square" aria-hidden="true"></i>
                    <div class="contact-right">
                        <p>Facebook</p>
                        <span><a href="#">BookTime</a></span>
                    </div>
                </div>
                <div class="col-md-4 contact-grid1">
                    <i class="fa fa-instagram" aria-hidden="true"></i>
                    <div class="contact-right">
                        <p>Instagrame</p>
                        <span><a href="#">Book_Time</a></span>
                    </div>
                </div>
                <div class="col-md-4 contact-grid1">
                    <i class="fa fa-envelope" aria-hidden="true"></i>
                    <div class="contact-right">
                        <p>Email</p>
                        <a href="mailto:info@example.com">BookTime@example.com</a>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
</section>

<%@ include file="Footer.jsp"  %>
</body>
</html>
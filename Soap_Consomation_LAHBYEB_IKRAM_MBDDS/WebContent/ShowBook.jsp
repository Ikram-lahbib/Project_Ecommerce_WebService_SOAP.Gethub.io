<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="BookService.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BookService.MethodsBook"%>
<%@page import="BookService.MethodsBookService"%>
<%@page import="BookService.MethodsBookServiceLocator"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You Book</title>
</head>
<body>
<%@ include file="Header.jsp"  %>
<%
	Book b=new Book();
MethodsBookService bds=new MethodsBookServiceLocator();
MethodsBook port=bds.getMethodsBookPort();
b=port.getBook(Integer.parseInt(request.getParameter("id")));
%>
<div class="testimonials">
    <div class="container">
        <h3 class="title-txt"><span>Y</span>our Book</h3>
        <div class="col-md-6 testimonials-main" style="width:960px;padding-left:100px;">
            <div class="flexslider">
                <div class="inner-testimonials-w3ls">
                    <img src="images/<%=b.getBook_Image() %>" alt=" " class="img-responsive" />
                    <div class="testimonial-info-wthree" style="padding-top:20px;">
                        <h5>Book Name </h5><samp><%=b.getBook_Name() %></samp>
                        <h5>Writer Name </h5><span><%=b.getWriter_Name()%></span>
                        <h5>Summary </h5>
                        <p class="para-w3ls">
                            <%=b.getBook_Summary() %>
                        </p>
                        <h5>Price </h5> <span><%=b.getBook_Price() %> $</span>
                        <h5>Catygory </h5> <span><%=b.getBook_Catygory().getId_Catygory()%></span>
                        <h5>Stock </h5> <span><%=b.getBook_Stock() %></span>
                        <button style="width:200px;height:40px;border:10px;color:white;background-color:#93c83f;"><a href="AddCart?id_book=<%=b.getBook_id()%>" style="color:white;font-family:sans-serif;font-size:20px;">Add To Cart</a></button>

                    </div>
                </div>

            </div>
        </div>
    </div>
</div>

<%@ include file="Footer.jsp"  %>
</body>
</html>
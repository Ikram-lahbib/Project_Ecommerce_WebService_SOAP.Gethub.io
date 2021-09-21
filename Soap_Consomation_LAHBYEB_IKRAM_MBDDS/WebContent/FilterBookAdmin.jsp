<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="CategoryService.MethodsCategory"%>
<%@page import="CategoryService.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CategoryService.MethodsCategoryService"%>
<%@page import ="CategoryService.MethodsCategoryServiceLocator"%>
<%@page import="BookService.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BookService.MethodsBook"%>
<%@page import="BookService.MethodsBookService"%>
<%@page import="BookService.MethodsBookServiceLocator"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookShope</title>

</head>
<body>
<%@ include file="HeaderAdmin.jsp"  %>
<% 
int id_category=Integer.parseInt(request.getParameter("id_category"));
Book[] bs=new Book[]{};
MethodsBookService mbs=new MethodsBookServiceLocator();
MethodsBook port=mbs.getMethodsBookPort();
MethodsCategoryService mcs =new MethodsCategoryServiceLocator();
MethodsCategory  port2= mcs.getMethodsCategoryPort();
String cn=port2.getCategoryName(id_category);
bs=port.getBookByCategory(id_category);
%>
<div class="banner"></div>
<!-- product right -->
<!-- gallery -->
<div class="gallery" style="">
    <div class="container">
        <h3 class="title-txt"><span>B</span>ook Shop</h3>
        <div class="container" style="width:200px;height:160px;position:absolute;">
            <h2 style="text-align:left;color:#040a2e;font-size:30px;">Filter By</h2><br />
            <ul class="list-group" style="width:250px; font-size:20px;">
                <li class="list-group-item active" style="font-size:25px;background-color:yellowgreen;border-color:yellowgreen;">Category</li>
                <li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="AllBook.jsp">All </a></li>
                <li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="All.jsp"><%=cn%></a></li>
                </ul>
            <ul class="list-group" style="width:250px; font-size:25px;">
                <li class="list-group-item active" style="font-size:20px;background-color:yellowgreen;border-color:yellowgreen;">Price</li>
                <li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="All.jsp">Price UP</a></li>
                <li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="All.jsp">Price Down</a></li>
            </ul>
        </div>

        <div class="container" style="margin-left:350px;width:1000px;">
             <% int i = 0; 
            while (i<bs.length){%>
                <div class="gallery_gds">
                    <div class="col-md-3 col-sm-6 thumbnail team-w3agile" style="margin-right: 10px;margin-bottom:10px;">
                        <img src="images/<%=bs[i].getBook_Image()%>" class="img-responsive" alt="" style="width:400px;height:300px;">
                        <div class="team-info">
                            <div class="caption">
                                <h4><%=bs[i].getBook_Name() %></h4>
                               <a href="UpdateBook.jsp?id_book=<%=bs[i].getBook_id()%>" style="color:#93c83f;">Update</a>
                            </div>
                            <div class="w3ls-social-icons">
                                <a class="facebook" href="DeleteBook?id_book=<%=bs[i].getBook_id()%>"><span class="fa fa-trash"></span></a>
                            </div>
                        </div>
                    </div>
                </div>
                
                <%i++;} %>
            <div class="clearfix"> </div>



        </div>
    </div>
</div>
<%@ include file="Footer.jsp"  %>
</body>
</html>
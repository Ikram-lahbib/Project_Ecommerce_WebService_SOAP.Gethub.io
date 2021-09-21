<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="BookService.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BookService.MethodsBook"%>
<%@page import="BookService.MethodsBookService"%>
<%@page import="BookService.MethodsBookServiceLocator"%>
<%@page import="CategoryService.MethodsCategory"%>
<%@page import="CategoryService.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CategoryService.MethodsCategoryService"%>
<%@page import ="CategoryService.MethodsCategoryServiceLocator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Book</title>

</head>
<body>
<%@ include file="HeaderAdmin.jsp"  %>
<%
Book[] bs=new Book[]{};
MethodsBookService mbs=new MethodsBookServiceLocator();
MethodsBook port=mbs.getMethodsBookPort();
Category[] cs=new Category[]{};
MethodsCategoryService mcs =new MethodsCategoryServiceLocator();
MethodsCategory  port2= mcs.getMethodsCategoryPort();
cs=port2.getAllCategory();
bs=port.getALLBook();
%>
<div class="banner"></div>
<!-- product right -->
<!-- gallery -->
<div class="gallery" style="">
    <div class="container">
        <h3 class="title-txt"><span>A</span>ll Book</h3>
        <div class="container" style="width:200px;height:160px;position:absolute;">
            <h2 style="text-align:left;color:#040a2e;font-size:30px;">Filter By</h2><br />
            <ul class="list-group" style="width:250px; font-size:20px;">
                <li class="list-group-item active" style="font-size:25px;background-color:yellowgreen;border-color:yellowgreen;">Category</li>
                <%for(int j=0;j<cs.length;j++){ %>
                <li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="FilterBookAdmin.jsp?id_category=<%=cs[j].getId_Catygory()%>"><%=cs[j].getName_Category()  %></a></li>
                <%} %>
                <!--<li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="All.jsp">Science</a></li>
                <li class="list-group-item" style="font-size:20px;color:#0b102b;"><a href="All.jsp">Phylosofie</a></li>-->
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
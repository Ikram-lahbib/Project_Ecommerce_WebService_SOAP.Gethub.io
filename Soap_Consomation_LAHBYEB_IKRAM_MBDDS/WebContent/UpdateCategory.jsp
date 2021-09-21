<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="CategoryService.MethodsCategory"%>
<%@page import="CategoryService.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CategoryService.MethodsCategoryService"%>
<%@page import ="CategoryService.MethodsCategoryServiceLocator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="HeaderAdmin.jsp"%>
<%
	int id =Integer.parseInt(request.getParameter("id_catygory"));
Category c=new Category();
MethodsCategoryService mcs =new MethodsCategoryServiceLocator();
MethodsCategory  port= mcs.getMethodsCategoryPort();
c=port.getCategory(id);
%>
<div class="banner"></div>
<section class="contact" >
    <div class="container">
        <h3 class="title-txt"><span>U</span>pdate Category</h3>
        <div class="contact-grids" style="width:1720px; height:720px; margin-left:240px;">
            <div class=" col-md-5 contact-form">
                <h4 class="heading">Update Category</h4>
                <form action="UpdateCategory" method="post">
                    <input type="file" placeholder="Image" name="image" value="images/<%=c.getImage_Category()%>"/>
                    <input type="text" placeholder="Category Name" name="name" value="<%=c.getName_Category() %>"/>
                    <textarea placeholder="Description" name="description"><%=c.getDescription_Category() %></textarea>
                    <div class="submit1">
                        <input type="submit" value="Update Category">
                    </div>
                </form>
            </div>
      </div>
      </div>
 </section>
<%@ include file="Footer.jsp"  %>


</body>
</html>
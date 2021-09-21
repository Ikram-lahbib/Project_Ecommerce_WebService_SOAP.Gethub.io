<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="CategoryService.MethodsCategory"%>
<%@page import="CategoryService.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CategoryService.MethodsCategoryService"%>
<%@page import ="CategoryService.MethodsCategoryServiceLocator"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllCategory</title>
</head>
<body>
<%@ include file="HeaderAdmin.jsp"%>
<%
	//ArrayList<Category> cs=new ArrayList<Category>();
Category[] cs=new Category[]{};
MethodsCategoryService mcs =new MethodsCategoryServiceLocator();
MethodsCategory  port= mcs.getMethodsCategoryPort();
cs=port.getAllCategory();
%>
<!--service-->
<div class="w3-agile-services" style="margin-top:70px;">
    <div class="container">
        <h3 class="title-txt"><span>C</span>ategory</h3>
        <div class="agileits-services">
            <div class="services-right-grids">
            <%int i =0;
              while(i<cs.length){%>
                <div class="col-sm-4 services-right-grid thumbnail team-w3agile">
                    <div class="se-top" style="height:340px; width:350px">
                        <div class="services-icon">
                            <img src="images/<%=cs[i].getImage_Category() %>" style="width:100px;height:100px;">
                        </div>
                        <div class="services-icon-info">
                            <h5><a href="Science.html"><%=cs[i].getName_Category() %></a></h5>
                            <p><%=cs[i].getDescription_Category() %></p>
                        </div>
                    </div>
                    <div class="team-info" style="width:350px">
                            <div class="w3ls-social-icons">
                                <a class="facebook" href="DeleteCategory?id_category=<%=cs[i].getId_Catygory()%>"><span class="fa fa-trash"></span></a>
                            </div>
                    </div>
                    </div>
                </div>
                <% i++;} %>
                
                <div class="clearfix"> </div>
            </div>

        </div>
    </div>
</div>
<!-- //services -->
<%@ include file="Footer.jsp"  %>
</body>
</html>
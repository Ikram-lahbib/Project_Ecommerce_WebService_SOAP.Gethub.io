<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.SQLException"%>
<%@page import="CategoryService.MethodsCategory"%>
<%@page import="CategoryService.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CategoryService.MethodsCategoryService"%>
<%@page import ="CategoryService.MethodsCategoryServiceLocator"%>
<%@page import="BookService.Book"%>
<%@page import="BookService.MethodsBook"%>
<%@page import="BookService.MethodsBookService"%>
<%@page import="BookService.MethodsBookServiceLocator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
</head>
<body>
<%@ include file="HeaderAdmin.jsp"  %>
<%
	int id_book=Integer.parseInt(request.getParameter("id_book"));
Category[] cs=new Category[]{};
Book b=new Book();
MethodsCategoryService cds =new MethodsCategoryServiceLocator();
MethodsCategory  port= cds.getMethodsCategoryPort();
cs=port.getAllCategory();
MethodsBookService bds=new MethodsBookServiceLocator();
MethodsBook port2=bds.getMethodsBookPort();
b=port2.getBook(id_book);
%>
<div class="banner"></div>
<section class="contact" >
    <div class="container">
        <h3 class="title-txt"><span>U</span>pdate Book</h3>
        <div class="contact-grids" style="width:1720px; height:797px; margin-left:210px;">
            <div class=" col-md-5 contact-form">
                <h4 class="heading">Update Book</h4>
                <form action="UpdateBook?id_book=<%=b.getBook_id() %>" method="post">
                    <input type="file" placeholder="Image" name="image" value="images/<%=b.getBook_Image()%>" />
                    <input type="text" placeholder="Book Name" name="name" value="<%=b.getBook_Name() %>" />
                    <input type="text" placeholder="Book Writer" name="writer" value="<%=b.getWriter_Name() %>"  />
                    <select name="category" style="margin: .5em 0;  padding: .7em 1em;font-size: .9em; width: 100%; background: transparent; border: 1px solid #fff; color: #fff;  letter-spacing: 2px;">
                       
                      <%for(int i=0; i<cs.length;i++){ %>
                         <option value="<%=cs[i].getId_Catygory() %>"><%=cs[i].getName_Category() %></option>
                      <% } %>
                   </select>
                    <input type="text" placeholder="Book Price" name="price" value="<%=b.getBook_Price() %>" />
                    <input type="text" placeholder="Book Stock" name="stock" value="<%=b.getBook_Stock() %>" />
                    <input type="date" placeholder="Book Date" name="date" value="<%=b.getDate_Add_Book() %>"  />
                    <textarea placeholder="Summary" name="summary"><%=b.getBook_Summary() %></textarea>
                    <div class="submit1">
                        <input type="submit" value="Update Book">
                    </div>
                </form>
            </div>
          </div>
      </div>
 </section>
<%@ include file="Footer.jsp"  %>
</body>
</html>
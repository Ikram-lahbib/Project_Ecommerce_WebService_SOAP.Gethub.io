<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="CartService.Book"%>
<%@page import="CartService.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CartService.MethodsCart"%>
<%@page import="CartService.MethodsCartService"%>
<%@page import="CartService.MethodsCartServiceLocator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<%@ include file="Header.jsp"  %>
<%
	//HttpSession ses = request.getSession();
int id_user =(int)ses.getAttribute("iduser");
Cart[] cs=new Cart[]{};
MethodsCartService mcs=new MethodsCartServiceLocator();
MethodsCart port=mcs.getMethodsCartPort();
cs=port.getCartByUser(id_user);
double total=0;
%>
   <% if(username==null) { 
	   response.sendRedirect("Register.jsp");
	   
   %>
   <%}else{ %>
<div class="banner"></div>
<div class="container">
    <table id="cart" class="table table-hover table-condensed">
        <thead>
            <tr>
                <th style="width:50%">Product</th>
                <th style="width:10%">Price</th>
                <th style="width:8%">Quantity</th>
                <th style="width:22%" class="text-center">Subtotal</th>
                <th style="width:10%"></th>
            </tr>
        </thead>
         <% int i=0;
        while(i<cs.length){
        	total=total+cs[i].getPrice_book();
        	%>
        <tbody>
             <tr>
                    <td data-th="Product">
                        <div class="row">
                            <div class="col-sm-2 hidden-xs"><img src="images/<%=cs[i].getImage_book() %>" alt="..." class="img-responsive" /></div>
                            <div class="col-sm-10">
                                <h4 class="nomargin"><%=cs[i].getName_book() %></h4>
                            </div>
                        </div>
                    </td>
                    <td data-th="Price"><%=cs[i].getPrice_book() %></td>
                    <td data-th="Quantity">
                        <input type="number" name="Qty" class="form-control text-center" value="1">
                    </td>
                    <td data-th="Subtotal" class="text-center"><%=cs[i].getPrice_book() %></td>
                    <td class="actions" data-th="">
                        <a href="RefreshCart?id_cart=<%=cs[i].getId_Cart()%>" class="btn btn-info btn-sm" ><i class="fa fa-refresh"></i></a>
                        <a href="DeleteBookCart?id_cart=<%=cs[i].getId_Cart()%>" class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></a>
                    </td>
                </tr>
        </tbody>
         <%i++;} %>
        <tfoot>
            <tr class="visible-xs">
                <td class="text-center"><strong>Total 1.99</strong></td>
            </tr>
            <tr>
                <td><a href="BookShop.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
                <td colspan="2" class="hidden-xs"></td>
                <td class="hidden-xs text-center"><strong>Total  <%=total %> DH</strong></td>
                <td><a href="PayBook.jsp" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
            </tr>
        </tfoot>
    </table>
</div>
<% } %>
<%@ include file="Footer.jsp"  %>

</body>
</html>
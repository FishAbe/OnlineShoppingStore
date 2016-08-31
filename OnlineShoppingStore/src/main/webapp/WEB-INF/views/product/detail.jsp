<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Products">
    <jsp:body>
<div class="container"style="width: 60%;margin: auto">
<div class="row">
<div class="col-md-4 well" style="height: 400px; border-color: #657979;">
<img src="resources/images/book.png" class="img-rounded" alt="product image" width="230" height="340">
</div>
<div class="col-md-6 well" style="margin-left: 20px" >
<h2>Product Detail</h2>
<div>Product Name:${product.name}</div>
<div>Book Title:  ${product.name}</div>
<div>Book Author:${product.author}</div>
<div>Price:${product.price}</div>
<div>Quantity:<input type="text" value=1></div>
<div>
<a class="btn btn-success btn-lg"  href="/OnlineShoppingStore/spring/product/addToCart/${product.id}">
								<span class="glyphicon glyphicon-shopping-cart"></span> <span class="items">Add to Cart</span></a>
<a class="btn btn-primary" href="/OnlineShoppingStore/spring/product">Back</a>
</div>
</div>
</div>
</div>

</jsp:body>
</t:mainLayout>
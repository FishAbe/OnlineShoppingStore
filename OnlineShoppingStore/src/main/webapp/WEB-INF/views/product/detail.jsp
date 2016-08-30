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
<div class="col-md-4 well" style="height: 400px; border-color: red;">
Image
</div>
<div class="col-md-6" >
<h2>Product Detail</h2>
<div>Product Name:---------------------</div>
<div>Book Title:------------------------</div>
<div>Book Author:-----------------------</div>
<div>Price:-----------------------</div>
<div>Quantity:-----------------------</div>
<div>
<a class="btn btn-success btn-lg"  href="/OnlineShoppingStore/spring/product/detail/1">
								<span class="glyphicon glyphicon-shopping-cart"></span> <span class="items">Add to Cart</span></a>
<a class="btn btn-primary" href="/OnlineShoppingStore/spring/product">Back</a>
</div>
</div>
</div>
</div>

</jsp:body>
</t:mainLayout>
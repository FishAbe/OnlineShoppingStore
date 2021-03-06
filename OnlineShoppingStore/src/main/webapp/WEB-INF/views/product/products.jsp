<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Products">
    <jsp:body>
  <div class="container">
        <h2>List of Available Products</h2>
		<%-- <c:forEach begin="0" end="8" varStatus="loop"> --%>
		<c:forEach var="product" items="${products}">
		 <div class="col-md-3 well" style="height=30px; margin: 2px; border-color: #657979;">
		 <div><img src="resources/images/book.png" class="img-rounded" alt="product image" width="180" height="150"></div>
		   <div class="col-md-12 well" style="border-color: #657979;">
		    <B>Product Type :<strong style="color:blue">Book</strong> </B>
		    <br/>
		     <B>Title:<strong style="color:blue">${product.name}</strong> </B>
		    <br/>
		     <B>Author:<strong style="color:blue">${product.author}</strong> </B>
		     <br/>
		     <B> Price: $<strong style="color:red">${product.price}</strong> </B>
		     
		    <div class="button-wrapper">
	          <a class="btn  btn-primary"  href="/OnlineShoppingStore/spring/product/detail/${product.id}">
								<span class="fa fa-save"></span> View Detail</a>
			<a class="btn btn-success btn-lg" style="padding: 6px 2px"  href="/OnlineShoppingStore/spring/product/addToCart/${product.id}">
								<span class="glyphicon glyphicon-shopping-cart"></span> <span class="items">Add to Cart</span></a>
             </div> 
		    
		   </div>
		   
		   </div>
		   </c:forEach>	
		   <c:forEach var="laptop" items="${laptops}">
		 <div class="col-md-3 well" style="height=30px; margin: 2px; border-color: #657979;">
		 <div><img src="resources/images/laptop.png" class="img-rounded" alt="product image" width="180" height="150"></div>
		   <div class="col-md-12 well" style="border-color: #657979;">
		    <B>Product Type :<strong style="color:blue">Lap Top</strong> </B>
		    <br/>
		     <B>Model:<strong style="color:blue">${laptop.name}</strong> </B>
              <br/>
		     <B>Type:<strong style="color:blue">${laptop.type}</strong> </B>
		     <br/>
		     <B> Price: $<strong style="color:red">${laptop.price}</strong> </B>
		     
		    <div class="button-wrapper">
	          <a class="btn  btn-primary"  href="/OnlineShoppingStore/spring/product/detail/${laptop.id}">
								<span class="fa fa-save"></span> View Detail</a>
			  <a class="btn btn-success btn-lg" style="padding: 6px 2px"  href="/OnlineShoppingStore/spring/product/addToCart/${laptop.id}">
								<span class="glyphicon glyphicon-shopping-cart"></span> <span class="items">Add to Cart</span></a>
             </div> 
		   
		   </div>
		   
		   </div>
		   </c:forEach>	       		   
		</div>
     
</jsp:body>
</t:mainLayout>
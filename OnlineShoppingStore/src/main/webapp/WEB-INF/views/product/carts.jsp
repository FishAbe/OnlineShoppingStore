<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Cart Items">
    <jsp:body>
<div class="container">
<div class="page-header ">
			<h3>Cart Items</h3>
		</div>
  <div class="table-responsive well" style= "border-color: #657979;">
			<table class="table table-striped table-condensed">
				<thead>
					<tr>
						<th>Product</th>
						<th>Unit Price</th>
						<th>Quantity</th>
						<th>Subtotal</th>
						<th></th>
					</tr>
				</thead>
				<c:forEach var="cartItem" items="${cartItems}">
					<tr>
						<td>${cartItem.productId}</td>
						<td>${cartItem.unitPrice}</td>
						<td>${cartItem.quantity}</td>
						<td>${cartItem.subtotal}</td>
						<td>
								<a class="btn  btn-danger"  href="/OnlineShoppingStore/spring/cart/delete/${cartItem.id}">
								<span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
		<div>	
<a class="btn btn-primary" href="/OnlineShoppingStore/spring/product">Check Out</a>
<a class="btn btn-success" href="/OnlineShoppingStore/spring/product">Continue Shopping</a>

</div>
		</div>
</body>
</html>
</jsp:body>
</t:mainLayout>
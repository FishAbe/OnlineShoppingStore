<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Orders">
    <jsp:body>

<div class="container">
		<div class="page-header ">
			<h3>Recent Orders</h3>
		</div>
	   <div class="well" style="border-color: #657979;">
	   <c:forEach var="order" items="${orders}">
							
		<div class="control-group form-horizontal well" style="border-color: #657979;">
     <div class="row">
         
         <div class="control-group" style="font-family: sans-serif;">
             <div class="control-label">
                <strong>Customer Name:</strong> ${order.customer.firstName}  ${order.customer.lastName}
             </div>
             <div class="control-label">
                   <strong>Order Status : </strong> ${order.orderStatus}
             </div>
              <div class="control-label">
                    <strong>Order Date :</strong> ${order.orderDate}
             </div>
         </div>
                
     </div>
     </div>
     <strong>Order details</strong>
		<br />
		<div class="table-responsive well">
			<table class="table table-striped table-condensed">
				<thead>
					<tr>
						<th>Product</th>
						<th>Unit Price</th>
						<th>Quantity</th>
						<th>Sub Total</th>					 
				
					</tr>
				</thead>
				 <c:forEach var="orderLine" items="${order.orderLineItems}"> 
				
					<tr>
						<td>${orderLine.product.name}</td>					
						<td>${orderLine.product.price}</td>
						<td>${orderLine.quantity}</td>
					    <td>${orderLine.product.price}</td>
					</tr>
					
				</c:forEach>
				<tr>
					<td colspan="3"></td>
					<td  style="color:red">Total : $ ${order.totalOrderPrice}</td>
					<tr>
			</table>
		</div>
		<hr/>
		</c:forEach>
		<!--order--></div>
	</div>

</jsp:body>
</t:mainLayout>
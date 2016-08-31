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
         <div class="span4">
         <div class="control-group">
             <div class="control-label">
                Customer Name:
             </div>
             <div class="controls">
                ${order.customer.firstName}
             </div>

         </div>
     </div>
         <div class="span6">
             <div class="control-group">
                 <div class="control-label">
                    Order Status :
                 </div>
                 <div class="controls">
                     New
                 </div>

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
					    <td>${order.totalOrderPrice}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<hr/>
		</c:forEach>
		<!--order--></div>
	</div>

</jsp:body>
</t:mainLayout>
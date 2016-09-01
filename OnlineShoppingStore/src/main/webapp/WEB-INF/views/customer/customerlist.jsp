<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Customers">
    <jsp:body>

<div class="container">
		<div class="page-header ">
			<h3>Customer List</h3>
		</div>
       
		<!-- <div>
			<a href="customer/add" class="btn btn-primary" > Add Customer</a>
			 <br/>
		</div> --> -->
          
		<div class="table-responsive well" style= "border-color: #657979;">
			<table class="table table-striped table-condensed">
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Actions</th>
						<!-- <th>City</th>
						<th>State</th> -->
					</tr>
				</thead>
				<c:forEach var="customer" items="${customerList}">
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<%-- <td>${customer.address.city}</td>
						<td>${customer.address.state}</td> --%>
						<td>
						
								<a class="btn  btn-primary"  href="/OnlineShoppingStore/spring/customer/update/${customer.id}">
								<span class="fa fa-save"></span> Update</a>
								<a class="btn  btn-danger"  href="/OnlineShoppingStore/spring/customer/delete/${customer.id}">
								<span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>

</jsp:body>
</t:mainLayout>
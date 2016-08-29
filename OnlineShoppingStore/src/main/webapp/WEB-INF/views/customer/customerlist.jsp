<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<title>Customers</title>
</head>
<body>

<div class="container">
		<div class="page-header ">
			<h3>Customer List</h3>
		</div>

		<div>
			<a href="customer/add" class="btn btn-primary"> Add Customer</a>
		</div>

		<br />

		<div class="table-responsive">
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
						
								<a class="btn  btn-primary"  href="customer/update/${customer.id}">
								<span class="fa fa-save"></span> Update</a>
								<a class="btn  btn-danger"  href="customer/delete/${customer.id}">
								<span class="fa fa-lg fa-times-circle"></span> Delete</a>
								
							
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>
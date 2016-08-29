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
<title>Add Customer</title>
</head>
<body>
<div class="well" style="width: 60%;margin: auto">
		<h2>Customer Registration</h2>
		<form:form modelAttribute="customer"
			action="${pageContext.request.contextPath}/customer/add" method="post">
			<br/>
			<h3>Personal Info</h3>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">First Name</span>
						<form:input path="firstName" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="firstName" class="alert alert-danger" role="alert" />
				</div>
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Last Name</span>
						<form:input path="lastName" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="lastName" class="alert alert-danger" role="alert" />
				</div>
			</div>
			<br/>
			<div class="row">
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Email</span>
						<form:input path="email" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="email" class="alert alert-danger" role="alert" />
				</div>
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Password</span>
						<form:input type="password" path="password" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="password" class="alert alert-danger" role="alert" />
				</div>
			</div>
			<br/>
			<br/>
	       <h3>Address Information</h3>
			<div class="row">
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Street</span>
						<form:input path="address.street" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="address.street" class="alert alert-danger" role="alert" />
				</div>
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">City</span>
						<form:input type="address.city" path="password" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="address.city" class="alert alert-danger" role="alert" />
				</div>
			</div>
			<br />
	       
			<div class="row">
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Zip</span>
						<form:input path="address.zip" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="address.zip" class="alert alert-danger" role="alert" />
				</div>
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">State</span>
						<form:input type="address.state" path="password" class="form-control" />
					</div>
				</div>
				<div class="col-md-2">
					<form:errors path="address.state" class="alert alert-danger" role="alert" />
				</div>
			</div>
			<br />
			<div>
				<input type="submit" value="Add" class="btn btn-primary" />
				<input type="reset" value="Reset" class="btn btn-reset" />
			</div>
			
			<br/>
			<br/>
					
		</form:form>
	</div>

</body>
</html>
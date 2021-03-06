<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Add Customer">
    <jsp:body>



<div class="well" style="width: 60%;margin: auto">
		<h2>Admin Registration</h2>
		<form:form modelAttribute="admin"
			action="/OnlineShoppingStore/spring/admin/add">
			<br/>
			<h3>Personal Info</h3>
			<form:errors path="*" cssClass="alert alert-danger" element="div"/>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">First Name</span>
						<form:input path="firstName" class="form-control" />
					</div>
				</div>
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Last Name</span>
						<form:input path="lastName" class="form-control" />
					</div>
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
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Password</span>
						<form:input type="password" path="password" class="form-control" />
					</div>
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
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">City</span>
						<form:input path="address.city" class="form-control" />
					</div>
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
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">State</span>
						<form:input path="address.state" class="form-control" />
					</div>
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

  </jsp:body>
</t:mainLayout>
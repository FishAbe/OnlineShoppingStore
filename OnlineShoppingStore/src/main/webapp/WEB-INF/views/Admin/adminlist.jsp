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
			<h3>Admin List</h3>
		</div>
       
		<div>
			<a href="admin/add" class="btn btn-primary" > Add Admin</a>
			 <br/>
		</div>
          
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
				<c:forEach var="admin" items="${adminList}">
					<tr>
						<td>${admin.firstName}</td>
						<td>${admin.lastName}</td>
						<td>${admin.email}</td>
						<%-- <td>${admin.address.city}</td>
						<td>${admin.address.state}</td> --%>
						<td>
						
								<a class="btn  btn-primary"  href="/OnlineShoppingStore/spring/admin/update/${admin.id}">
								<span class="fa fa-save"></span> Update</a>
								<a class="btn  btn-danger"  href="/OnlineShoppingStore/spring/admin/delete/${admin.id}">
								<span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>

</jsp:body>
</t:mainLayout>
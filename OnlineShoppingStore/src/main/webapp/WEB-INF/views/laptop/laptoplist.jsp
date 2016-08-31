<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Laptops">
    <jsp:body>

<div class="container">
		<div class="page-header ">
			<h3>Laptop List</h3>
		</div>

		<div>
			<a href="laptop/add" class="btn btn-primary"> Add Laptop</a>
		</div>

		<br />

		<div class="table-responsive well" style= "border-color: #657979;">
			<table class="table table-striped table-condensed">
				<thead>
					<tr>					
						<th>Name</th>
						<th>Type</th>
						<th>serialNo</th>
						<th>price</th>						
						<th>status</th>
					    
				
					</tr>
				</thead>
				<c:forEach var="laptop" items="${laptopList}">
					<tr>
						
						<td>${laptop.name}</td>
						<td>${laptop.type}</td>
						<td>${laptop.serialNo}</td>	
						<td>${laptop.price}</td> 					
					    <td>${laptop.status}</td>
						
						<td>
						
								<a class="btn  btn-primary"  href="laptop/update/${laptop.id}">
								<span class="fa fa-save"></span> Update</a>
								<a class="btn  btn-danger"  href="laptop/delete/${laptop.id}">
								<span class="glyphicon glyphicon-trash"></span></a>
								
							
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</jsp:body>
</t:mainLayout>
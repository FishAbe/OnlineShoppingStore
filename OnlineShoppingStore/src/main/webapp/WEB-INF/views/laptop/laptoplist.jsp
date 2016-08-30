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

		<div class="table-responsive">
			<table class="table table-striped table-condensed">
				<thead>
					<tr>
						<th>serialNo</th>
						<th>name</th>
						<th>type</th>
						<th>status</th>
					    <th>price</th>
				
					</tr>
				</thead>
				<c:forEach var="laptop" items="${laptopList}">
					<tr>
						<td>${laptop.serialNo}</td>
						<td>${laptop.name}</td>
						<td>${laptop.type}</td>
					    <td>${laptop.status}</td>
						<td>${laptop.price}</td> 
						<td>
						
								<a class="btn  btn-primary"  href="book/update/${laptop.serialNo}">
								<span class="fa fa-save"></span> Update</a>
								<a class="btn  btn-danger"  href="book/delete/${laptop.serialNo}">
								<span class="fa fa-lg fa-times-circle"></span> Delete</a>
								
							
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</jsp:body>
</t:mainLayout>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Books">
    <jsp:body>

<div class="container">
		<div class="page-header ">
			<h3>Book List</h3>
		</div>

		<div>
			<a href="book/add" class="btn btn-primary"> Add Book</a>
		</div>

		<br />

		<div class="table-responsive well" style= "border-color: #657979;">
			<table class="table table-striped table-condensed">
				<thead>
					<tr>
						<th>ISBN</th>
						<th>Title</th>
						<th>Author</th>
						<th>Genre</th>
					    <th>Price</th>
				
					</tr>
				</thead>
				<c:forEach var="book" items="${bookList}">
					<tr>
						<td>${book.isbn}</td>
						<td>${book.name}</td>
						<td>${book.author}</td>
					    <td>${book.genre}</td>
						<td>${book.price}</td> 
						<td>
						
								<a class="btn  btn-primary"  href="book/update/${book.id}">
								<span class="fa fa-save"></span> Update</a>
								<a class="btn  btn-danger"  href="book/delete/${book.id}">
								<span class="glyphicon glyphicon-trash"></span></a>
								
							
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</jsp:body>
</t:mainLayout>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Add Book">
    <jsp:body>



<div class="well" style="width: 60%;margin: auto">
		<h2>Book Registration</h2>
		<form:form modelAttribute="book"
			action="/OnlineShoppingStore/spring/book/add">
			<br/>
			<h3>Book Info</h3>
			 <form:errors path="*" cssClass="alert alert-danger" element="div"/>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">ISBN </span>
						<form:input path="isbn" class="form-control" />
					</div>
				</div>
				
				</div>
				<br/>
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Title</span>
						<form:input path="name" class="form-control" />
					</div>
				</div>
				
				</div>
			
			<br/>
			<div class="row">
			  <div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Author</span>
						<form:input path="author" class="form-control" />
					</div>
				</div>
				
				</div>
				<br/>
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Genre</span>
						 <form:select path="genre" id="genre-list" class="form-control">
                                    <c:forEach var="genre" items="${allGenres}">
                                        <form:option value="${genre}">${genre}</form:option>
                                    </c:forEach>
                                </form:select>
					</div>
				</div>
				</div>
				<br/>
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Price</span>
						<form:input path="price" class="form-control" />
					</div>
				</div>
				
				</div>
				<br/>
				
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Status</span>
						
						<form:select path="status" id="genre-list" class="form-control">
                                    <c:forEach var="status" items="${allStatus}">
                                        <form:option value="${status}">${status}</form:option>
                                    </c:forEach>
                                </form:select>
						
					</div>
				</div>
				
				</div>
				<br/>
				
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Discount</span>
						<form:input path="discount" class="form-control" />
					</div>
				</div>
				
				</div>
				<br/>
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Quantity</span>
						<form:input path="quantity" class="form-control" />
					</div>
				</div>
				
				</div>
				<br/>
				
				<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Description</span>
						<form:textarea path="description"  class="form-control" cols="100" rows="3" />
					</div>
				</div>
				
				</div>
				
				<br/>
				
			</div>
			<br/>
			<br/>
	       
	      
			
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
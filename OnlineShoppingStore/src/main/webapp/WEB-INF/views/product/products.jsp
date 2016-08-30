<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Products">
    <jsp:body>
  <div class="container">
        <h2>List of Available Products</h2>
		<c:forEach begin="0" end="8" varStatus="loop">
		 <div class="col-md-3 well" style="height=40px; margin: 2px;">
		 <div>Product Image</div>
		   <div class="col-md-6">
		   $ price
		   </div>
		   <div class="col-md-5">
		    <div class="container button-wrapper">
	          <button class="btn btn-success btn-lg"><span class="glyphicon glyphicon-shopping-cart"></span> <span class="items">1</span></button>
             </div> 
		   </div>
		   </div>
		   </c:forEach>	       		   
		</div>
     
</jsp:body>
</t:mainLayout>
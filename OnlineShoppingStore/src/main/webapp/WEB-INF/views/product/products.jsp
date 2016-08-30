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
		 <div class="col-md-3 well" style="height=40px; margin: 2px; border-color: red;">
		 <div><img src="/resources/images/book.png" class="img-rounded" alt="Cinque Terre" width="250" height="340"></div>
		   <div class="col-md-6">
		   $ 245
		   </div>
		   <div class="col-md-5">
		    <div class="container button-wrapper">
	          <a class="btn  btn-primary"  href="/OnlineShoppingStore/spring/product/detail/1">
								<span class="fa fa-save"></span> View Detail</a>
             </div> 
		   </div>
		   </div>
		   </c:forEach>	       		   
		</div>
     
</jsp:body>
</t:mainLayout>
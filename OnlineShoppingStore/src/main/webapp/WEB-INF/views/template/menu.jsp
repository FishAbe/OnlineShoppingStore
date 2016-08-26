<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- <ul style="list-style:none;line-height:28px;"> -->

<%-- 	<li><spring:url value="/home" var="homeUrl" htmlEscape="true" /> --%>
<%-- 		<a href="${homeUrl}">Home</a> --%>
<!-- 	</li> -->

<%-- 	<li><spring:url value="/home" var="personListUrl" htmlEscape="true" /> --%>
<%-- 		<a href="${personListUrl}">Product</a> --%>
<!-- 	</li> -->

<!-- </ul> -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"> Shopping Store </a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Category1</a></li>
      <li><a href="#">Category2</a></li> 
      <li><a href="#">Category3</a></li> 
      <li><a href="#">Category4</a></li> 
      <li><a href="#">Category5</a></li>
      <li><a href="#">Category6</a></li>
      <li><a href="#">Category7</a></li> 
      
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="Navigation" pageEncoding="UTF-8"%>
      <div class="header">
        <div class="brand" style="text-align:center">
            <a href='<c:url value="/"/>'>
                <h1>
                    Online Shopping 
                </h1>
            </a>
        </div>
        <br>
        <nav class="main-nav">
        <c:choose>
        <c:when test="${loggedInUser.firstName != null}">
          <ul class="list-inline">
              <li><a href='<c:url value="/"/>'>Home</a></li>
              <li><a href='<c:url value="/products"/>'>Products</a></li>
              <li><a href='<c:url value="/customer"/>'>Customers</a></li>
              <li><a href='<c:url value="/book"/>'>Book</a></li>
              <li><a href='<c:url value="/laptops"/>'>Laptop</a></li>
              <li><a href='<c:url value="/orders"/>'>Orders</a></li>
          </ul>
            </c:when>
         </c:choose>
        </nav>
        <div class="account">
         
         <c:choose>
             <c:when test="${loggedInUser.firstName == null}">
                 <ul class="list-inline">
                     <li><a href='<c:url value="/user/login"/>'>Login</a></li>
                     <li><a class="register" href='<c:url value="user/register"/>'>Register</a></li>
                 </ul>
             </c:when>
             <c:when test="${loggedInUser.firstName != null}">
                 <ul class="list-inline">
                     <li><a class="" href='<c:url value="/snippets/create"/>'>New Snippet</a></li>
                     <li><a class="" href='<c:url value="/users/${loggedInUser.slug}"/>'>${loggedInUser.firstName}</a></li>
                     <li><a href='<c:url value="/logout"/>'>Logout</a></li>
                 </ul>
             </c:when>
         </c:choose>
        </div>
      </div>
      <!-- End Header -->
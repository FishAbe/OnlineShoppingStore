
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Login">
    <jsp:body>
   
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div style="height: 20px;"></div>
                    <div class="login paper">
                        <div class="heading">
                            <h2>Login</h2>
                        </div>
                        <div class="body">
                        <form:form class="form-horizontal" modelAttribute="currentUser">
                                <form:input path="email" class="form-control" placeholder="Email" />
                                <form:password path="password" class="form-control" placeholder="Password" />
                                <input type="submit" class="login btn" value="Login" />
                        </form:form>
                        <c:if test='${loginError.equals("no")}'>
                            <div class="alert alert-danger">
                                Wrong email or password
                            </div>
                        </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </jsp:body>
</t:mainLayout>
<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Register">
    <jsp:body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="register paper">
                        <div class="heading">
                            <h2>Register</h2>
                        </div>
                        <div class="body">
                            <form:form class="form-horizontal" modelAttribute="newUser">
                                <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                                <form:input path="email" type="text" class="form-control" placeholder="Email" />
                                <form:input path="firstName" type="text" class="form-control" placeholder="First Name" />
                                <form:input path="lastName" type="text" class="form-control" placeholder="Last Name" />
                                <form:password path="password" class="form-control" placeholder="Password" />
                                <form:input path="phone" type="text" class="form-control" placeholder="Phone"></form:input>
                                <form:textarea path="biography" class="form-control" placeholder="Who are you?"/>
                                <input type="submit" class="login btn" value="Register">
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </jsp:body>
</t:mainLayout>
<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Create Snippet">
    <jsp:body>
        <div class="snippets-container">
            <div class="container">
                <div class="row">
                    <c:forEach var="user" items="${users}">
                        <div class="col-xs-6 col-sm-4">
                            <a href='<c:url value="/users/${user.slug}"></c:url>'>
                                <div class="user-profile">
                                    <img src='<c:url value="resources/images/profile.png" />' alt="Profile image" class="profile-img">
                                    <div class="user-info">
                                        <h1>${user.fullName} <span class="count">${user.count}</span></h1>
                                        <h2>${user.email}</h2>
                                        <p>
                                            ${user.biography}
                                        </p>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- End Snippets Container -->
    </jsp:body>
</t:mainLayout>
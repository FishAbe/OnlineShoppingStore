<%-- 
    Document   : marketing
    Created on : May 16, 2016, 8:45:26 PM
    Author     : tekeste
--%>

<%@tag description="marketing peiece" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="marketing">
    <h1>Welcome to SnippetHub</h1>
    <h2>Create and search awesome code snippets .</h2>
    <div class="search">
        <input type="text" placeholder="Search by title, description, author and tags" class="search-box">
        <div class="tags">
            <ul class="list-inline">
                <c:forEach var="tag" items="${homeTags}">
                    <li><a href='<c:url value="/snippets/tag/${tag.slug}"></c:url>' class="tag">${tag.slug}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
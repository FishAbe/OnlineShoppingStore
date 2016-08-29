<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Welcome to SnippetHub">
    <jsp:body>
        <t:marketing></t:marketing>
            <!-- End Marketing -->
            <div class="snippets-container">
                <div class="container">
                    <div class="row snippets-row">
                    <c:forEach var="snippet" items="${snippets}">
                    <c:if test='${snippet.visiblity.equals("public")}'>
                        <div class="col-xs-12 col-sm-6">
                            <div class="snippet-box">
                                <a href='<c:url value="/snippets/${snippet.slug}"></c:url>'>
                                        <div class="snippet-code">
                                        <pre>
<code class="language-${snippet.language}">${snippet.content}</code>
                                        </pre>
                                    </div>
                                </a>
                                <div class="snippet-details">
                                    <a href='<c:url value="/snippets/${snippet.slug}"></c:url>'>
                                            <div class="snippet-title">
                                            ${snippet.snippetTitle}
                                        </div>
                                        <div class="description">
                                            ${snippet.snippetDescription}
                                        </div>
                                    </a>
                                    <ul class="list-inline tags">
                                        <c:forEach var="tag" items="${snippet.tags}">
                                            <li><a href='<c:url value="/snippets/tag/${tag.slug}"></c:url>' class="tag">${tag.tagTitle}</a></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </c:if>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- End Snippets Container -->
    </jsp:body>
</t:mainLayout>
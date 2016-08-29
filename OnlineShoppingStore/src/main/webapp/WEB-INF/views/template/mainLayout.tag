<%-- 
    Document   : mainLayout
    Created on : May 16, 2016, 5:55:09 PM
    Author     : tekeste
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="pageTitle" required="true"%>

<%-- any content can be specified here e.g.: --%>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>${pageTitle}</title>
        <link rel="stylesheet" href='<c:url value="/resources/styles/main.css"/>'>
        <link rel="stylesheet" href='<c:url value="/resources/styles/animate.min.css"/>'>
    </head>
    <body>
        <t:modal></t:modal>
        <div class="wrapper">
            <t:header></t:header>
            <jsp:doBody/>
            <t:footer></t:footer>
        </div>
    <script src='<spring:url value="/resources/scripts/vendor.js"/>'></script>
    <script src='<spring:url value="/resources/scripts/plugins.js"/>'></script>
    <script src='<spring:url value="/resources/scripts/select2.full.min.js"/>'></script>
    <script src='<spring:url value="/resources/scripts/main.js"/>'></script>
    <script src='<spring:url value="/resources/scripts/prism.js"/>'></script>
    </body>
</html>

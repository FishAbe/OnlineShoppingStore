<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
</head>
<body>
<h1> 
	Hello world!
</h1>
<div class="well">
${controllerMessage}
</div>

<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-1.12.3.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>

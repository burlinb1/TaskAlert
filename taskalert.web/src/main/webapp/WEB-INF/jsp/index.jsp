<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.servletContext.contextPath}" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring 4 Web MVC</title>
        <link rel="stylesheet" type="text/css" href="${path}/resources/css/site.css" />
        <script src="${path}/resources/js/js.js"></script>
        <script src="${path}/resources/js/jquery-1.11.2.min.js"></script>
    </head>
    <body>
        <h4>Spring 4 Web MVC</h4>
        <div class="blue">${msg1}</div>
        <div class="blue">${msg2}</div>       
    </body>
</html>

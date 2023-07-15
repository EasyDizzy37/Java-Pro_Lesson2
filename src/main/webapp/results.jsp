<%--
  Created by IntelliJ IDEA.
  User: B_W
  Date: 14.07.2023
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Poll results</title>
</head>
<body>
<h2> Genre</h2>
<p>Jazz:<%= request.getAttribute("JazzCount")%> </p>
<p>Rock:<%= request.getAttribute("Rock")%> </p>

<h2>Platform</h2>
<p>Sound Cloud<%= request.getAttribute("Sound Cloud")%> </p>
<p>YouTube Music<%= request.getAttribute("YouTube Music")%> </p>
<a href="index.jsp">try again </a>
</body>
</html>

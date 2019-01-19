<%--
  Created by IntelliJ IDEA.
  User: jonathany23
  Date: 1/19/19
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Listado de Personas</title>
  </head>
  <body>
  <h1>Listado de Personas</h1>
  <ul>
    <c:forEach items="${personas}" var="persona">
      <li>${persona.nombre} ${persona.apePaterno} ${persona.apeMaterno}</li>
    </c:forEach>
  </ul>
  </body>
</html>

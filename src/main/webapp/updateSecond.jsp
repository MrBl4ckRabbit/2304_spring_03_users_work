<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Update Second</title>
</head>
<body>
   <form method="post" action="/updateSecond">
     <input name="id" type="hidden"  value="<%= request.getParameter("id") %>">
     <input name="name" value="<%= request.getParameter("name") %>">
     <input name="age" type="number"  value="<%= request.getParameter("age") %>">
     <input type="submit" value="Update">
     </form>
</body>
</html>
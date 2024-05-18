<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Second Approach</title>
</head>
<body>
   <form method="post" action="/saveSecond">
    <input type="text" name="name"required>
    <input type="number" name="age" required>
    <input type="submit" value="save">
    </form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.itclass.constants.AppConstants" %>
<html>
<head>
  <title>Index</title>
</head>
<body>
  <div>
     <a href="<%=AppConstants.ALL_USERS_URL%>">Show All users</a>
  </div>

  <div>
       <a href="<%=AppConstants.ADD_USER_URL%>">Create new user</a>
    </div>

    <div>
           <a href="/create.jsp">Create new user second</a>
        </div>
</body>
</html>

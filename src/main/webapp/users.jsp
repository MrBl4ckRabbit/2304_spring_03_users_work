<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
 <title>Users List </title>
</head>
 <body>
   <table border="1">
     <tr>
      <th>ID</th>
      <th>FIO</th>
      <th>AGE</th>
      <th>Actions</th>
     </tr>
     <c:forEach var="user" items="${usersList}">
       <tr>
         <td>${user.id}</td>
         <td>${user.name}</td>
         <td>${user.age}</td>
         <td>
           <a href="/delete?id=${user.id}">Delete</a>
           <a href="/update?id=${user.id}&name=${user.name}&age=${user.age}">Update</a>

         </td>
       </tr>
     </c:forEach>
   </table>
 </body>
</html>
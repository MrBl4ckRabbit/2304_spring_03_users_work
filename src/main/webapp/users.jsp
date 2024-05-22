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
      <th>City</th>
      <th>Street</th>
      <th>House</th>
      <th>Actions</th>

     </tr>
     <c:forEach var="user" items="${usersList}">
       <tr>
         <td>${user.id}</td>
         <td>${user.name}</td>
         <td>${user.age}</td>
         <td>${user.address.city}</td>
         <td>${user.address.street}</td>
         <td>${user.address.house}</td>
         <td>
           <a href="/delete?id=${user.id}">Delete</a>
           <a href="/update?id=${user.id}&name=${user.name}&age=${user.age}">Update</a>
           <a href="/updateSecond.jsp?id=${user.id}&name=${user.name}&age=${user.age}">UpdateSecond</a>

         </td>
       </tr>
     </c:forEach>
   </table>
 </body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 9/23/2017
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results"  />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>

<html><body>

<%--TODO Pretty up the results!--%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>UserID</th>
        <th>Email</th>
        <th>user Password</th>
        <th>Firs Name</th>
        <th>Last Name</th>
        <th>Permission Type</th>
        <th>createDate</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.Email}</td>
                <td>${user.userPassword}</td>
                <td>${user.FirstName}</td>
                <td>${user.LastName}</td>
                <td>${user.PermissionType}</td>
                <td>${user.createDate}</td>
            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>

</body>
</html>
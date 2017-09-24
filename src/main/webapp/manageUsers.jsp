<%--
  Created by IntelliJ IDEA.
  User: Tony Alvarez
  Date: 9/23/2017
  Time: 11:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="taglib.jsp"%>
<c:set var="title" value="User Search Home Page"  />
<%@include file="head.jsp"%>
<html>
    <title>seograder-user-management</title>
<body>
<h2>User Display Exercise - Week 1</h2>
<!--<a href = "searchUser">Go to the User Search</a> -->
<form action="/searchUser" class="form-inLine">
    <div class="form-group">
        <label for="searchTerm">Search</label>
        <input type="text" class="form-control" name="searchTerm" id="searchTerm" aria-describedby="searchTerm">
    </div>
    <!-- commenting out search.. only use viewAll for first tests of hibernate
    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
    ---->
    <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
</form>
</body>
</html>

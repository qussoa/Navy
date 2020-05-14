<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/include-head.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table table-hover">
	<thead class="thead-light">
		<tr>
			<th>NO</th>
			<th>UserName</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Address</th>
		</tr>
	</thead>
	
	<c:choose>
		<c:when test="${empty userList}">
			<tr><td colspan="5">User 정보 없음
		</c:when>
		<c:otherwise>
			<c:forEach items="${userList}" var="user" varStatus="i">
				<tr data-id="${user.username}" class="tr_user">
					<td>${i.count}</td>
					<td>${user.username}</td>
					<td>${user.email}</td>
					<td>${user.phone}</td>
					<td>${user.address}</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	
	
	<tr>
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include/include-head.jspf" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section>
	<form:form modelAttribute="userVO">

		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<label for="username" class="input-group-text">UserName</label>
			</div>
			<form:input type="text" path="username" class="form-control" readonly="true"/>
		</div>
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<label for="email" class="input-group-text">Email</label>
			</div>
			<form:input type="text" path="email" class="form-control" />
		</div>
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<label for="phone" class="input-group-text">Phone</label>
			</div>
			<form:input type="text" path="phone" class="form-control" />
		</div>
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<label for="address" class="input-group-text">Address</label>
			</div>
			<form:input type="text" path="address" class="form-control" />
		</div>
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<label for="address" class="input-group-text">계정활성화</label>
			</div>
			<form:checkbox path="enabled" class="form-control" />
		</div>
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<label for="checkout" class="input-group-text">탈퇴여부</label>
			</div>
			<form:checkbox path="checkout" class="form-control" />
		</div>

		<div id="auth_box">
			<div align="right">
				<button type="button" class="btn btn-success mb-3" id="auth_append">권한
					정보 입력 추가</button>
			</div>
				<div id="auth_list">
			<c:if test="${not empty userVO.authorities}">

				 
					<h6><b>현재 권한</b></h6>
					<c:forEach items="${userVO.authorities}" var="auth"
					varStatus="index">
						<!-- <p>${index.index+1}번째권한 : ${auth.authority}</p> -->
						<!-- <input name="auth" value="${auth.authority}" class="auth form-control mb-3"> -->
					<div class="input-group mb-3">
					  <input name="auth" value="${auth.authority}" class="auth form-control" placeholder="권한">
					  <div class="input-group-append">
					    <button class="btn btn-danger btn-delete" type="button" data-id="${auth.id}" data-username="${auth.username}">&times</button>
					  </div>
					</div>
					</c:forEach>
			</c:if>
				</div>
		</div>
		<div align="right">
			<button type="button" class="btn btn-success" id="btn_save" data-id="${userVO.username}">저장</button>
		</div>
	</form:form>
	<h6><b>권한 추가하기</b></h6>
	<select id="auth" class="form-control mb-3" name="auth">
		<option value="ADMIN">ADMIN</option>
		<option value="ROLE_ADMIN">ROLE_ADMIN</option>
		<option value="USER">USER</option>
		<option value="ROLE_USER">ROLE_USER</option>
	</select>
</section>
</body>
</html>
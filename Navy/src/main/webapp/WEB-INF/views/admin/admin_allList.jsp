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
상품전체 리스트
<table class="table table-hover">
	<thead class="thead-light">
		<tr>
			<th>PCODE</th>
			<th>상품명</th>
			<th>가격</th>
			<th>수량</th>
		</tr>
	</thead>
	
	<c:choose>
		<c:when test="${empty PROLIST}">
			<tr><td colspan="4">상품 정보 없음
		</c:when>
		<c:otherwise>
			<c:forEach items="${PROLIST}" var="pro" varStatus="i">
				<tr data-id="${pro.p_code}" class="tr_pro">
					<td>${pro.p_code}</td>
					<td>${pro.p_name}</td>
					<td>${pro.p_price}</td>
					<td>${pro.p_qty}</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	
	
	<tr>
</table>

<button type="button" class="btn_pro_insert">등록</button>

</body>
</html>
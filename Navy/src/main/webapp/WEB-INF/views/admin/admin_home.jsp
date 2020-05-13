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
<%@ include file = "/WEB-INF/views/include/include-nav.jspf" %>
관리자 메인페이지
<ul>
	<li><a href="${rootPath}/admin/userlist">회원 리스트</a></li>
	<li><a href="${rootPath}/admin/productlist">상품 정보</a></li>
	<li><a href="${rootPath}/admin/orderlist">주문 정보</a></li>
	<li><a href="${rootPath}/admin/qna">QNA</a></li>
	<li><a href="${rootPath}/admin/review">리뷰</a></li>
	<li><a href="${rootPath}/admin/inventory">재고</a></li>
	<li><a href="${rootPath}/admin/support">고객센터</a></li>
</ul>
</body>
</html>
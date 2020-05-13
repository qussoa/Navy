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
<h3>장바구니 페이지</h3>
<a href="${rootPath}/cart/buy"><button>최종구매</button></a>
<%@ include file= "/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>
  
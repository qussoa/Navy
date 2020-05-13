<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/views/include/include-head.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
$(function(){
	$("button").click(function(){
		alert("감사합니다.")
		document.location.href = "${rootPath}/"
	})
})
</script>
<body>
<%@ include file = "/WEB-INF/views/include/include-nav.jspf" %>
<h3>결제정보 입력 페이지</h3>
<button>결제완료</button>
<%@ include file= "/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>
  
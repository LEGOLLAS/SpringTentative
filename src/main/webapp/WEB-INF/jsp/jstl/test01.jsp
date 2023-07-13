<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL core 변수</h1>
	
	<c:set var="number1" value="36"/>
	<c:set var="number2">3</c:set>
	
	<c:out value="${number1}"/>
	<c:out value="${number2}"/>
	
	<c:set var="division" value="${number1 / number2 }" />
	<c:set var="multi" value="${number1 * number2 }" />
	
	<h1>JSTL core 연산</h1>
	<h4>더하기 : ${number1 + number2 }</h4>
	<h4>빼기 : ${number1 - number2 }</h4>
	<h4>곱하기 : ${multi}</h4>
	<h4>나누기 : ${division}</h4>
	
	
	<h1>JSTL core out</h1>
	<c:if test="${ division >= 10 }">
		<h1>${division}</h1>
	</c:if>
	
	<c:if test="${ division < 10 }">
		<h1>${division}</h1>
	</c:if>
	
	<c:if test="${ multi >= 10 }">
		<c:out value="<script>alert('너무 큰 수 입니다.')</script>" escapeXml="false" />
	</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
	
	</style>
<meta charset="UTF-8">
<title>테스트</title>
</head>


<body>

<%
	int a = 1;
	int b = 2;
	int c = a + b;
%>
	1234212312
	<p class="cc"><%= c %></p>
	<button id="cl" onclick="name(<%=c%>)">클릭</button>
	<button id="cl" onclick="name()">클릭2</button>


</body>
</html>
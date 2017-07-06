<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>

</head>
<body> 
<h1 style="text-align:center;font-size:14px;">学生列表</h1>
<form  action="${pageContext.request.contextPath }/querystudent.do" method="post" >

<div style="padding-left:500px;">查询:  <input type="text" name="sno" />
<a href="${pageContext.request.contextPath }/addStu.do">添加学生</a>
<a href="${pageContext.request.contextPath }/logout.do">退出</a></div>

</form>

<form name="itemsForm" action="${pageContext.request.contextPath }/querylist.do" method="post">


<p></p>
<table width="70%" border=1 style="margin:0 auto;">
<tr>

	<td>学号</td>
	<td>姓名</td>
	<td>性别</td>
	<td>年龄</td>
	<td>密码</td>

	
</tr>
<c:forEach items="${stulist }" var="item">
<tr>	
	<td>${item.sno }</td>
	<td>${item.sname }</td>
	<td>${item.ssex }</td>
	<td>${item.sage }</td>
	<td>${item.spass }</td>


</tr>
</c:forEach>
</table>

</form>
</body>

</html>
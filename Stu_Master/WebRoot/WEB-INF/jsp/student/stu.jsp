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

<form  action="${pageContext.request.contextPath }/querylist.do" method="post">



学生个人信息：
<p></p>


<table width="100%" border=1>
<tr>
	<td>照片</td>
	<td>学号</td>
	<td>姓名</td>
	<td>年龄</td>
	<td>专业</td>
	
</tr>

<tr>
	<td style="width:100px;"><div id="img"><img src="/pic/${student.pic}" width=100 height=100 /></div></td>
	<td>${student.sno }</td>
	<td>${student.sname }</td>
	<td>${student.sage }</td>
	<td>${student.sdept }</td>

</tr>


</table>
</form>
</body>

</html>
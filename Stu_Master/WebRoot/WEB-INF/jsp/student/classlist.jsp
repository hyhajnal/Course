<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程列表</title>

</head>
<body> 
课程列表：


<form name="itemsForm" action="${pageContext.request.contextPath }/queryclass.do?sno=${student.sno}" method="post">


<p></p>
<table width="100%" border=1>
<tr>
	
	<td>学号</td>
	<td>姓名</td>
	<td>年龄</td>
	<td>专业</td>
	
</tr>

<tr>
	<td>${student.sno }</td>
	<td>${student.sname }</td>
	<td>${student.sage }</td>
	<td>${student.sdept }</td>

</tr>


</table>
<p></p>
<td><a href="${pageContext.request.contextPath }/selectClass.do?sno=${student.sno}">选课</a></td>
<p></p>
<table width="100%" border=1>

<tr>
	<td></td>
	<td>课程编号</td>
	<td>课程</td>
	<td>教师</td>
	<td>上课时间</td>
	<td>地点</td>
	<td>操作</td>
	
</tr>
<c:forEach items="${classList }" var="item">
<tr>	
	<td><input type="checkbox" name="items_id" value="${item.cid}"/></td>
	<td>${item.cid }</td>
	<td>${item.cname }</td>
	<td>${item.cteacher }</td>
	<td>${item.ctime }</td>
	<td>${item.caddress }</td>

	<td><a href="${pageContext.request.contextPath }/deleteClass.do?cid=${item.cid}">删除</a></td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选课列表</title>

</head>
<body> 
选课列表：


<form name="itemsForm" action="${pageContext.request.contextPath }/selectSubmit.do" method="post">

<table width="60%" border=1>
<tr>
	
	<td>学号</td>
	<td>姓名</td>
	<td>年龄</td>
	<td>专业</td>
	
</tr>

<tr>
	<td style="width:170px;"><input type="text" name="sno" value="${student.sno}" /></td>
	<td>${student.sname }</td>
	<td>${student.sage }</td>
	<td>${student.sdept }</td>

</tr>
</table>

<p></p>

<table width="100%" border=1>

<tr>
	<td></td>
	<td>课程编号</td>
	<td>课程</td>
	<td>教师</td>
	<td>上课时间</td>
	<td>地点</td>
	
</tr>
<c:forEach items="${classList }" var="item">
<tr>	
	<td><input type="checkbox" name="items_id" value="${item.cid}"/></td>
	<td>${item.cid }</td>
	<td>${item.cname }</td>
	<td>${item.cteacher }</td>
	<td>${item.ctime }</td>
	<td>${item.caddress }</td>

	

</tr>
</c:forEach>

</table>
<p></p>
<input type="submit" value="提交"/>
</form>
</body>

</html>
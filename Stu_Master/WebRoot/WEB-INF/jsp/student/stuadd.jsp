<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生信息</title>

</head>
<body> 


<form  action="${pageContext.request.contextPath }/addStuSubmit.do" method="post" enctype="multipart/form-data">

添加学生：
<table width="100%" border=1>

<tr>
	<td>学号</td>
	<td><input type="text" name="sno" /></td>
</tr>
<tr>
	<td>姓名</td>
	<td><input type="text" name="sname"/></td>
</tr>
<tr>
	<td>年龄</td>
	<td><input type="text" name="sage" /></td>
</tr>
<tr>
	<td>专业</td>
	<td><input type="text" name="sdept"/></td>
</tr>
<tr>
	<td>学生照片</td>
	<td> 
	<input type="file" name="pictureFile" />
	</td>
</tr>


<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>
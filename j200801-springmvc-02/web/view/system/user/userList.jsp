<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>用戶列表</h1>
</center>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">增加</a>

<center>
	<hr>
	<form method="post"
		action="">
		<table align="center" border="1" width="80%">
			<tr>
				<td>用户ID</td>
				<td>名称</td>
				<td>年龄</td>
				<td>性别</td>
				<td>爱好</td>
				<td>登录名</td>
				<td>密码</td>
				<td>创建时间</td>
				<td colspan="2">操作</td>
			</tr>
			<tr>
				<td>001</td>
				<td>張三</td>
				<td>18</td>
				<td>女</td>
				<td>男</td>
				<td>zhangsan</td>
				<td>111</td>
				<td>2020-11-04</td>
				<td><a href="#">删除</a></td>
				<td><a href="#">修改</a></td>
			</tr>
			<tr>
				<td>001</td>
				<td>李四</td>
				<td>16</td>
				<td>女</td>
				<td>男</td>
				<td>zhangsan</td>
				<td>111</td>
				<td>2020-11-03</td>
				<td><a href="#">删除</a></td>
				<td><a href="#">修改</a></td>
			</tr>
<%--			<c:forEach items="${userList }" var="user">--%>
<%--				<tr>--%>
<%--					<td><input type="checkbox" name="id[]"--%>
<%--						value="${user.user_id }" />${user.user_id }</td>--%>
<%--					<td>${user.name }</td>--%>
<%--					<td>${user.age }</td>--%>
<%--					<td>${user.sex }</td>--%>
<%--					<td>${user.hobby }</td>--%>
<%--					<td>${user.login_name }</td>--%>
<%--					<td>${user.password }</td>--%>
<%--					<!-- <td>${user.create_time }</td> -->--%>
<%--					<td><fmt:formatDate value="${user.create_time }"--%>
<%--							pattern="yyyy-MM-dd HH:ss:mm" /></td>--%>
<%--				</tr>--%>
<%--			</c:forEach>--%>
		</table>


	</form>
</center>
</body>
</html>
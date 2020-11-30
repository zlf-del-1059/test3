<%--
  Created by IntelliJ IDEA.
  User: zhulingfeng
  Date: 2020/11/4
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<body>
<center>
    <h1>主页面</h1>
  <font color="red">${message}</font>
    <hr>
</center>
<a href="<%=basePath%>userController/list.do">用户管理</a><br>
<a href="<%=basePath%>roleController/list.do">角色管理</a><br>
<a href="<%=basePath%>muenController/list.do">菜单管理</a><br>
</body>
</html>

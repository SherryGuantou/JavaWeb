<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/1
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="GBK" %>
<&@ page errorPage="ree.jsp" %>

<%@ page import="com.sherry.WebTest.JSPTest" %>
<html>
<head>
    <title>Sherry Test.</title>
</head>
<body>
<%JSPTest temp=new JSPTest();%>
<%temp.sayHello("Sherry");%>
</body>
</html>

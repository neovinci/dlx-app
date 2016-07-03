<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 15.06.2016
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="shortcut icon" href="/images/icon-academic-confirm.png">
</head>
<body>
<tiles:insert definition=".main">
    <tiles:put name="title">
        <bean:message key="farefamily.jsp.msg.welcome"/>
    </tiles:put>
    <tiles:put name="info" value="/WEB-INF/jsp/template/fare-family-body.jsp" />
</tiles:insert>
</body>
</html>

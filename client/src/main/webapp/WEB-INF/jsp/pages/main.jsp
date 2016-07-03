<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 13.06.2016
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" type="text/css" href="style/css/bootstrap.css">
</head>
<body>
    <div class="cover">
        <tiles:insert attribute="header"/>
        <tiles:insert attribute="footer"/>

        <div class="container">
            <tiles:insert attribute="info"/>
        </div>
</div>
</body>
</html>

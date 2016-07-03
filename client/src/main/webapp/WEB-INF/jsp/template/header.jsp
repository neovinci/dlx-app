<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 08.06.2016
  Time: 5:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
    <link href="style/css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="navbar navbar-static-top">
        <nav class="navbar-inner">
            <div class="container">
                <div class="brand">
                    DLX project
                </div>
                    <c:if test="${user.login != null}">
                        <ul class="nav">
                            <li class="divider-vertical"></li>
                            <li>
                                <html:link forward="/reservation-page"><bean:message key="reservation.jsp.msg.welcome"/></html:link>
                            </li>
                            <li>
                                <html:link forward="/customer-page"><bean:message key="customer.jsp.msg.welcome"/></html:link>
                            </li>
                            <li>
                                <html:link forward="/farefamily-page"><bean:message key="farefamily.jsp.msg.welcome"/></html:link>
                            </li>
                            <li class="divider-vertical"></li>
                            <li class="dropdown">
                                <a href="" class="dropdown-toggle" data-toggle="dropdown">${user.login}
                                    <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="<c:url value="/logout.do"/>">
                                        <span class="header-link"><bean:message key="header.jsp.msg.logout"/></span>
                                    </a></li>
                                </ul>
                            </li>
                        </ul>
                    </c:if>
            </div>
        </nav>
    </div>
</body>
</html>

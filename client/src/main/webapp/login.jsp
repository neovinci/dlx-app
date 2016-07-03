

<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html-el" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 09.06.2016
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="shortcut icon" href="/images/icon-academic-confirm.png">
    <link rel="stylesheet" type="text/css" href="style/css/bootstrap.min.css">
    <style>
        .well {
            margin-top: 100px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="well span4 offset4">
                <ul class="inline">
                    <li class="active">
                        <a href="<c:url value="/locale.do?lang=ru"/>"><img src="/images/Russia%20Flag.ico" style="height: 30px" alt="Russian"></a>
                    </li>
                    <li class="active">
                        <a href="<c:url value="/locale.do?lang=en"/>"><img src="/images/UK%20Flag.ico" style="height: 30px" alt="English"></a>
                    </li>
                </ul>

                <legend>
                    <bean:message key="auth.jsp.msg.welcome"/>
                </legend>
                <c:if test="${error}">
                    <div class="alert alert-error">
                        <div>
                            <html:errors property="login"/>
                        </div>

                        <div>
                            <html:errors property="password"/>
                        </div>
                    </div>
                </c:if>

                <html:form method="POST" action="login">
                    <input type="text" class="span4" placeholder="<bean:message key="auth.jsp.msg.login"/>" name="login">
                    <input type="password" class="span4" placeholder="<bean:message
                    key="auth.jsp.msg.password"/>" name="password">
                    <button type="submit" name="submit" class="btn btn-block btn-primary">
                        <bean:message key="auth.jsp.msg.submit"/>
                    </button>
                </html:form>
            </div>
        </div>
    </div>
</body>
</html>

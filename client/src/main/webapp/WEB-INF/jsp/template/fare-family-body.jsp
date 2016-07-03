<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 03.07.2016
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="res-tag" uri="by.epamlab.dlx.customtag" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<div class="row">
    <div class="col-md-9">
        <res-tag:fare-family var="farefamily"/>
        <div>
            <h4><span><bean:message key="farefamily.jsp.msg.welcome" /></span></h4>
            <p><span><bean:message key="farefamily.jsp.msg.fareFamilyCode" /></span> ${farefamily.fareFamilyCode}</p>
        </div>

        <div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th><span><bean:message key="farefamily.jsp.msg.ancillaryAirComponentCode" /></span></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${farefamily.airComponents}" var="farecomponents">
                    <tr>
                        <td>${farecomponents.airComponentCode}</td>
                    </tr>
                </c:forEach>
                </tbody>

            </table>

        </div>

    </div>
</div>
<body>

</body>
</html>

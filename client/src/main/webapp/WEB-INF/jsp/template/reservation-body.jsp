<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 03.07.2016
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@taglib prefix="res-tag" uri="by.epamlab.dlx.customtag" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

    <div class="row">
        <div class="col-md-9">
            <res-tag:reservation var="reservation"/>
            <div>
                <h4><span><bean:message key="reservation.jsp.msg.welcome" /></span></h4>
                <p><span><bean:message key="reservation.jsp.msg.code" /></span> ${reservation.code}</p>
                <p><span><bean:message key="reservation.jsp.msg.description" /></span> ${reservation.description}</p>

            </div>

            <div>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th><span><bean:message key="reservation.jsp.msg.componentTypeCode" /></span></th>
                            <th><span><bean:message key="reservation.jsp.msg.createDateTime" /></span></th>
                            <th><span><bean:message key="reservation.jsp.msg.internalStatus" /></span></th>
                            <th><span><bean:message key="reservation.jsp.msg.sequence" /></span></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${reservation.components}" var="component">
                            <tr>
                                <td>${component.componentTypeCode}</td>
                                <td>${component.createDateTime}</td>
                                <td>${component.internalStatus}</td>
                                <td>${component.sequence}</td>
                            </tr>
                        </c:forEach>
                    </tbody>

                </table>

            </div>

        </div>
    </div>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Sergei Astapenko
  Date: 03.07.2016
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="res-tag" uri="by.epamlab.dlx.customtag" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
    <div class="row">
        <div class="col-md-9">
            <res-tag:customer var="customer"/>
            <div>
                <h4><span><bean:message key="customer.jsp.msg.welcome" /></span></h4>
                <p><span><bean:message key="customer.jsp.msg.id" /></span> ${customer.id}</p>
                <p><span><bean:message key="customer.jsp.msg.firstname" /></span> ${customer.firstName}</p>
                <p><span><bean:message key="customer.jsp.msg.lastname" /></span> ${customer.lastName}</p>
                <p><span><bean:message key="customer.jsp.msg.email" /></span> ${customer.email}</p>
                <p><span><bean:message key="customer.jsp.msg.phone" /></span> ${customer.phone}</p>

            </div>

            <div>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th><span><bean:message key="customer.jsp.msg.amountPaid" /></span></th>
                        <th><span><bean:message key="customer.jsp.msg.formOfPaymentTypeCode" /></span></th>
                        <th><span><bean:message key="customer.jsp.msg.currencyCode" /></span></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${customer.payments}" var="payments">
                        <tr>
                            <td>${payments.amountPaid}</td>
                            <td>${payments.formOfPaymentTypeCode}</td>
                            <td>${payments.currencyCode}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>

            </div>

        </div>
    </div>
</body>
</html>

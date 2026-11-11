<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="calculator">

    <h2>Calculator</h2>

    <spring:url value="/calculator" var="formUrl"/>
    <form action="${fn:escapeXml(formUrl)}" method="post" class="form-horizontal" id="calculator-form">
        <div class="form-group">
            <label class="col-sm-2 control-label" for="left">First number</label>
            <div class="col-sm-10">
                <input class="form-control" id="left" name="left" type="number" step="any" required
                       value="${fn:escapeXml(left)}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" for="right">Second number</label>
            <div class="col-sm-10">
                <input class="form-control" id="right" name="right" type="number" step="any" required
                       value="${fn:escapeXml(right)}"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Calculate</button>
            </div>
        </div>
    </form>

    <c:if test="${sum != null}">
        <table class="table table-striped">
            <tr><th>Sum</th><td><c:out value="${sum}"/></td></tr>
            <tr><th>Difference</th><td><c:out value="${difference}"/></td></tr>
        </table>
    </c:if>
</petclinic:layout>

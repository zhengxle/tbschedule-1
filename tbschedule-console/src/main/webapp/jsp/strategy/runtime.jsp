<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<jsp:include page="../header.jsp"/>
<table border="1" >
     <tr>
     	<th>NO</th>
     	<th>Type</th>
     	<th>Machine</th>
    	<th>ThreadGroup Count</th>
     </tr>
     <c:forEach items="${runtimeList }" var="r" varStatus="status">
     <tr >
     	<td>${status.index + 1 }</td>
     	<td>${r.strategyName }</td>
     	<td align="center">${r.factoryUuid }</td>
     	<td align="center">${r.requestNum }</td>
     </tr>
     </c:forEach>
</table>
<jsp:include page="../footer.jsp"/>
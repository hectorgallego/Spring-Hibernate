<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

This would be your list:

<c:forEach items="${orders}" var="order">
		${order.idOrder} - ${order.provider} - ${order.description}
		<br />
</c:forEach>

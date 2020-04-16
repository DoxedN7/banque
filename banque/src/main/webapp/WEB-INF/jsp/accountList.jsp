<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>NTR BANK</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
	<h1>Person List</h1>

	<br />
	<br />
	<div>
		<table border="1">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Money</th>
			</tr>
			<c:forEach items="${accounts}" var="account">
				<tr>
					<td>${account.firstName}</td>
					<td>${account.lastName}</td>
					<td>${account.money}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
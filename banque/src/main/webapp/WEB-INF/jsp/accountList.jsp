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
				<th>id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Money</th>
				<th>Voir le profil</th>
			</tr>
			<c:forEach items="${accounts}" var="account">
				<tr>
					<td>${account.id}</td>
					<td>${account.firstName}</td>
					<td>${account.lastName}</td>
					<td>${account.money}</td>
					<td><a href="${pageContext.request.contextPath}/accountInfo/${account.id}">Voir le profil</a>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
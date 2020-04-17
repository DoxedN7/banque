<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>NTR BANK Infos du compte</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
    </head>
    
		    <body>
		        <h1>NTR BANK</h1>
		        <h3>Bonjour ${account.firstName} ${account.lastName}.</h3>
		        <h3>Votre solde est de ${account.money} euros.</h3>
		        
		        
		</body>
</html>
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
		        <h3>Effectuer un virement :</h3>
		        <div class="form-example">
		            <label for="id">Entrez l'id de la personne qui recevra le virement: </label>
		            <input type="text" name="name" id="name" required>
		        </div>
		        <br/>
		        <div class="form-example">
		            <label for="somme">Entrez le montant de la somme: </label>
		            <input type="number" name="somme" id="somme" required>
		        </div>
		        <br/>
		        <input type ="submit" value = "Effectuer le virement">
		        
		</body>
</html>
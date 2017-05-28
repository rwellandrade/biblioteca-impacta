<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
<style>
	fieldset{
		width: 400px;
		height: 100px;
		margin-top:100px;
		border-radius: 20px;
	}
</style>
</head>
<body>
	<center>
	<fieldset>
		<legend>
			Autenticação
		</legend>
		<form method = "post">
			<input type = "hidden" value = "login">
			Usuário :<input type = "text" name = "usuario"><br/>
			Senha :<input type = "password" name = "senha"><br/><br/>
			<input type = "submit" value = "enviar">
		</form>
	</fieldset>
    </center>
</body>
</html>
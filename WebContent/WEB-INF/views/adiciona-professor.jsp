<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Novo Professor</title>
</head>
<body>
	<center><h1>Cadastro de Professor</h1></center>
	<fieldset>
		<legend>
			Novo Professor
		</legend>
		<form>
			Nome: <input type = "text" name = "nome" id = "nome">
			Data de Nascimento: <input type = "date" name = "dataNasc" id = "dataNasc">
			<fieldset>
				<legend>
					Sexo
				</legend>
				<input type = "radio" name = "sexo" value = "m" checked>Masculino</br>
				<input type = "radio" name = "sexo" value = "f" checked>Feminino</br>				
			</fieldset>	
			Endereço: <input type = "text" name = "endereco">
			Complemento: <input type = "text" name = "complemento">
			Telefone: <input type = "text" name = "telefone">		
		</form>			
	</fieldset>

</body>
</html>
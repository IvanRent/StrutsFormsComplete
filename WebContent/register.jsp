<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%@ taglib prefix ="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Register</title>
</head>
<s:head/>
<sx:head/>
<body>
	<sx:tabbedpanel id="formRegister">
			<sx:div label="FORMULARIO CRUD REGISTER">
				<s:form action="alta.action" method="post">
					<s:push value="register">
						<s:hidden key="id" />
						<s:textfield  key="nombre" label="nombre"/>
						<s:radio name="genero"  label="GENERO" list="{'Masculio','Femenino'}"/>
						<s:select name="ciudad" label = "CIUDAD" list="{'Puebla','Queretaro','Guadalajara','Monterrey', 'Oaxaca'}"/>
						<s:textarea key="descripcion" label="descripcion"/>
						<s:checkbox name="desarrollador" label="¿HA MANEJADO BD DERBY?"/>
					</s:push>
						<s:submit value="ACEPTAR"/>
						<s:reset value="LIMPIAR"/>
				</s:form>
				
					<table border="2">
							<tr>
								<th>ID</th>
								<th>NOMBRE</th>
								<th>GENERO</th>
								<th>CIUDAD</th>
								<th>DESCRIPCION</th>
								<th>DESARROLLADOR</th>
								<th>EDITAR</th>
								<th>DELETE</th>							
							</tr>							
							
							  <s:iterator value="listRegister">
							  <tr>
								    <td><s:property value="id"/></td>
								    <td><s:property value="nombre"/></td>
								    <td><s:property value="genero"/></td>
								    <td><s:property value="ciudad"/></td>
								    <td><s:property value="descripcion"/></td>
								    <td><s:property value="desarrolador"/></td>
								    
								    <td><s:url id="editarURL" action="editar">
								    	<s:param name="id" value="%{id}"/></s:url>
								    	<s:a href="%{editarURL}">EDITAR</s:a>
								    </td>
								    <td>
								    	<s:url id="bajaURL" action="baja">
								    	<s:param name="id"  value="%{id}"/></s:url>
							    		<s:a href="%{bajaURL}">Delete</s:a>
							    	</td>							  
							  </tr>
							 </s:iterator>						
					</table>				
			</sx:div>
	</sx:tabbedpanel>
</body>
</html>
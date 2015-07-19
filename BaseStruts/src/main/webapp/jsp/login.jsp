<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!doctype html>
<!--[if lt IE 7]> <html class="ie6 oldie"> <![endif]-->
<!--[if IE 7]>    <html class="ie7 oldie"> <![endif]-->
<!--[if IE 8]>    <html class="ie8 oldie"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Untitled Document</title>
<link href="<s:url value="/resources/css/boilerplate.css"/>" rel="stylesheet" type="text/css">
<link href="<s:url value="/resources/css/home.css"/>" rel="stylesheet" type="text/css">
<!-- 
To learn more about the conditional comments around the html tags at the top of the file:
paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/

Do the following if you're using your customized build of modernizr (http://www.modernizr.com/):
* insert the link to your js here
* remove the link below to the html5shiv
* add the "no-js" class to the html tags at the top
* you can also remove the link to respond.min.js if you included the MQ Polyfill in your modernizr build 
-->
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="<%=request.getContextPath()%>/resources/js/jquery-1.11.2.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/respond.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/form2json.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/login.js"></script>
</head>
<body>
	<div class="gridContainer clearfix">
		<div id="div1" class="fluid">
        	<div class="contenedor">
            	
                <label class="titulo">e-Traveler</label> 
                <br><br>
                     
            	<div class="error">
                	El nombre de usuario y/o contraseña son incorrectos.
                </div>
                <br>
                
                <form id="formCuenta" action="validarCuenta">                     
                     <input name="username" type="text" placeholder="Usuario" class="box"/>
                     <br>
                     <input name="password" type="password" placeholder="Contraseña" class="box"/>
                     <br>
                     <input type="submit" value="INGRESAR" class="login"/>
                </form>
                <br>
                
                <a href="">¿Olvidaste tu contraseña?</a>
                <br><br>
                &copy; 2015 e-Traveler. Todos los derechos reservados.
        	</div>
        </div>
	</div>
</body>
</html>
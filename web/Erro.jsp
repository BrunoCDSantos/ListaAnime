<%-- 
    Document   : Erro
    Created on : 11/10/2017, 15:50:09
    Author     : informatica
--%>

<%@page import=" Erro.Erros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Css/fundoErro.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bom dia, tarde ou qualquer coisa</h1>
        <%
            Erros e = (Erros) request.getAttribute("erro");
            out.println(e.getErro());
        %>
        <br>
        <a href="javascript:history.back();" style="color: #000">
            Voltar
        </a>
        <br>
    </body>
</html>

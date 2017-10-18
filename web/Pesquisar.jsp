<%-- 
    Document   : Inicial
    Created on : 11/10/2017, 15:11:41
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Pizza Sabor Zumbi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="estilos.css">
        <link href="Css/fundoPesquisar.css" rel="stylesheet">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </head>
    <body>
       
        
        <div class="demo-layout-transparent mdl-layout mdl-js-layout">
            <header class="mdl-layout__header mdl-layout__header--transparent">
                <div class="mdl-layout__header-row">
                    <!-- Title -->
                    <span class="mdl-layout-title">Menu</span>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Menu</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link" href="Inicial.jsp">Página Inicial</a>
                    <a class="mdl-navigation__link" href="Incluir.jsp">Incluir Anime</a>
                    <a class="mdl-navigation__link" href="Modificar.jsp">Modificar anime</a>
                    <a class="mdl-navigation__link" href="Excluir.jsp">Excluir Anime</a>
                    <a class="mdl-navigation__link" href="Pesquisar.jsp">Pesquisar Anime</a>
                    <a class="mdl-navigation__link" href="Visualizar.jsp">Visualizar Anime</a>
                    <a class="mdl-navigation__link" href="index.jsp">Logout</a>
                </nav>
            </div>
            
            <main class="mdl-layout__content">
                <img src="assets/coollogo3.png" class="displayed"/>
                <div class="img_formato_3">
                    <img src="assets/coollogo_Vindo.png"/>
                </div>
                <div class="img_formato_4" style="text-align: left ">
                    <img src="assets/coollogo_Bem.png"/>                    
                </div>
                
            </main>
        </div>
    </body>
</html>